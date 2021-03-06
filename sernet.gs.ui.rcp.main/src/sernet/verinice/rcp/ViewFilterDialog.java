/*******************************************************************************
 * Copyright (c) 2009 Alexander Koderman <ak[at]sernet[dot]de>.
 * This program is free software: you can redistribute it and/or 
 * modify it under the terms of the GNU Lesser General Public License 
 * as published by the Free Software Foundation, either version 3 
 * of the License, or (at your option) any later version.
 *     This program is distributed in the hope that it will be useful,    
 * but WITHOUT ANY WARRANTY; without even the implied warranty 
 * of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  
 * See the GNU Lesser General Public License for more details.
 *     You should have received a copy of the GNU Lesser General Public 
 * License along with this program. 
 * If not, see <http://www.gnu.org/licenses/>.
 * 
 * Contributors:
 *     Alexander Koderman <ak[at]sernet[dot]de> - initial API and implementation
 *     Robert Schuster <r.schuster[at]tarent.de> - rewritten to use set of classes
 *     Daniel Murygin <dm[at]sernet[dot]de> - TypeParameter Added, RCP Layout
 ******************************************************************************/
package sernet.verinice.rcp;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.CheckboxTableViewer;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.ICheckStateProvider;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;

import sernet.gs.ui.rcp.main.ExceptionUtil;
import sernet.gs.ui.rcp.main.common.model.CnAElementHome;
import sernet.hui.common.VeriniceContext;
import sernet.hui.common.connect.HUITypeFactory;
import sernet.verinice.interfaces.CommandException;
import sernet.verinice.iso27k.rcp.Messages;
import sernet.verinice.model.common.ElementFilter;

/**
 * A dialog with a form for filtering elements in the views ISMView
 * and BaseProtectionView.
 * 
 * @author koderman[at]sernet[dot]de
 */
public class ViewFilterDialog extends Dialog {

    private static final int CHECKBOX_COLUMN_WIDTH = 430;
    private static final int VIEWER_TABLE_WIDTH = 470;
    private static final int VIEWER_TABLE_HEIGHT = 135;
    
    private String[][] types = ViewFilterAction.ISO_TYPES; 

    private boolean state = true;
    private String[] tagPattern;
    private CheckboxTableViewer viewer;
    private String[] checkedElements;

    private Button filterOrgCheckbox;
    private boolean filterOrg;
    
    private Button hideEmptyCheckbox;
    private boolean hideEmpty;
    
    private CheckboxTableViewer viewerType;
    private Set<String[]> visibleTypes = new HashSet<String[]>();

    public ViewFilterDialog(Shell parent, ViewFilterAction viewFilter) {
        super(parent);
        int style = SWT.CLOSE | SWT.TITLE | SWT.BORDER;
        style = style | SWT.APPLICATION_MODAL | SWT.RESIZE;
        setShellStyle(style);
        this.tagPattern = viewFilter.getTagParameter().getPattern();
        this.filterOrg = viewFilter.getTagParameter().isFilterOrg();
        this.hideEmpty = viewFilter.getHideEmptyFilter().isHideEmpty();
        this.visibleTypes = viewFilter.getTypeParameter().getVisibleTypeSet();
    }

    @Override
    protected org.eclipse.swt.widgets.Control createDialogArea(Composite parent) {
        Composite container = (Composite) super.createDialogArea(parent);
        GridLayout layout = new GridLayout();
        layout.numColumns = 1;
        container.setLayout(layout);

        Label intro = new Label(container, SWT.NONE);
        intro.setLayoutData(new GridData(GridData.BEGINNING, GridData.CENTER, false, false, 1, 1));
        intro.setText(Messages.ISMViewFilterDialog_0);
        
        createTypeGroup(container);
        createTagfilterGroup(container);  
        createFilterOrgGroup(container);  
        createHideEmptyGroup(container);     
        
        initContent();
        container.layout();
        return container;
    }

	/**
     * @param container2
     * @return
     */
    private void createTypeGroup(Composite parent) {  

        Group groupComposite = new Group(parent, SWT.BORDER);
        groupComposite.setText(Messages.ISMViewFilterDialog_2);
        GridData gridData = new GridData(GridData.FILL, GridData.CENTER, true, false, 1, 1);
        groupComposite.setLayoutData(gridData);
        groupComposite.setLayout(new GridLayout(1, false));

        ScrolledComposite comp = new ScrolledComposite(groupComposite, SWT.V_SCROLL);
        comp.setLayoutData(new GridData(GridData.FILL_BOTH));
        comp.setExpandHorizontal(true);
          
        viewerType = CheckboxTableViewer.newCheckList(comp, SWT.BORDER );
        
        Table table = viewerType.getTable();
        table.setLayoutData(new GridData(GridData.FILL, GridData.BEGINNING, false, false));
        table.setHeaderVisible(false);
        table.setLinesVisible(false);    
        TableColumn checkboxColumn = new TableColumn(table, SWT.LEFT);
        checkboxColumn.setWidth(CHECKBOX_COLUMN_WIDTH);
        
        comp.setContent(viewerType.getControl());
        viewerType.getTable().setSize(VIEWER_TABLE_WIDTH, VIEWER_TABLE_HEIGHT);
 
        viewerType.setContentProvider(new ArrayContentProvider());

        viewerType.setLabelProvider(new ITableLabelProvider() {
            @Override
            public Image getColumnImage(Object element, int columnIndex) {
                return null;
            }
            @Override
            public String getColumnText(Object element, int columnIndex) {
                return getTypeFactory().getMessage(((String[])element)[0]);
            }

            public void dispose() {}
            public boolean isLabelProperty(Object element, String property) {
                return false;
            }
            public void removeListener(ILabelProviderListener listener) {}
            @Override
            public void addListener(ILabelProviderListener listener) {}
        });
        viewerType.setCheckStateProvider(new CheckStateProvider(getVisibleTypes()));
        viewerType.setInput(getTypes());  
        
        viewerType.addDoubleClickListener(new IDoubleClickListener() {
            @Override
            public void doubleClick(DoubleClickEvent event) {
                state = !state;
                viewerType.setAllChecked(state);
            }
        });
    }

    private void createTagfilterGroup(Composite parent) {
        Group groupComposite = new Group(parent, SWT.BORDER);
        groupComposite.setText(Messages.ISMViewFilterDialog_1);
        GridData gridData = new GridData(GridData.FILL, GridData.CENTER, true, false, 1, 1);
        groupComposite.setLayoutData(gridData);
        groupComposite.setLayout(new GridLayout(1, false));

        ScrolledComposite comp = new ScrolledComposite(groupComposite, SWT.V_SCROLL);
        comp.setLayoutData(new GridData(GridData.FILL_BOTH));
        comp.setExpandHorizontal(true);
      
        viewer = CheckboxTableViewer.newCheckList(comp, SWT.BORDER);
        Table table = viewer.getTable();
        table.setLayoutData(new GridData(GridData.FILL, GridData.BEGINNING, false, false));
        table.setHeaderVisible(false);
        table.setLinesVisible(false);
        TableColumn checkboxColumn = new TableColumn(table, SWT.LEFT);
        checkboxColumn.setWidth(CHECKBOX_COLUMN_WIDTH);
        
        comp.setContent(viewer.getControl());
        viewer.getTable().setSize(VIEWER_TABLE_WIDTH, VIEWER_TABLE_HEIGHT);

        viewer.setContentProvider(new ArrayContentProvider());

        viewer.setLabelProvider(new ITableLabelProvider() {
            public Image getColumnImage(Object element, int columnIndex) {
                return null;
            }
            public String getColumnText(Object element, int columnIndex) {
                return (String) element;
            }
            public void addListener(ILabelProviderListener listener) {
            }
            public void dispose() {
            }
            public boolean isLabelProperty(Object element, String property) {
                return false;
            }
            public void removeListener(ILabelProviderListener listener) {
            }
        });
    }
    

    private Group createFilterOrgGroup(Composite parent) {
    	Group groupComposite = new Group(parent, SWT.BORDER);
        GridData gridData = new GridData(GridData.FILL, GridData.END, true, false);
        groupComposite.setLayoutData(gridData);
        groupComposite.setLayout(new GridLayout(1, false));
        filterOrgCheckbox = new Button(groupComposite, SWT.CHECK);
        filterOrgCheckbox.setText(Messages.ISMViewFilterDialog_7);
        return groupComposite;
	}

    /**
     * @param container2
     * @return
     */
    private Group createHideEmptyGroup(Composite parent) {
        Group groupComposite = new Group(parent, SWT.BORDER);
        GridData gridData = new GridData(GridData.FILL, GridData.END, true, false);
        groupComposite.setLayoutData(gridData);
        groupComposite.setLayout(new GridLayout(1, false));
        hideEmptyCheckbox = new Button(groupComposite, SWT.CHECK);
        hideEmptyCheckbox.setText(Messages.ISMViewFilterDialog_6);
        return groupComposite;
    }

    public String[] getCheckedElements() {
        return (checkedElements != null ) ? checkedElements.clone() : null;
    }

    public boolean getHideEmpty() {
        return hideEmpty;
    }

    public boolean isHideEmpty() {
        return getHideEmpty();
    }
    
    public boolean isFilterOrgs() {
		return getFilterOrgs();
	}
    
    public boolean getFilterOrgs() {
		return filterOrg;
	}

    public Set<String[]> getVisibleTypes() {   
        return visibleTypes;
    }

    protected void initContent() {
        List<String> tags;
        try {
            tags = CnAElementHome.getInstance().getTags();
            tags.add(0, ElementFilter.NO_TAG);
            viewer.setInput(tags);
        } catch (CommandException e) {
            ExceptionUtil.log(e, Messages.ISMViewFilterDialog_4);
        }

        if (tagPattern != null) {
            viewer.setCheckedElements(tagPattern);
        }

        filterOrgCheckbox.setSelection(getFilterOrgs());
        hideEmptyCheckbox.setSelection(getHideEmpty());
    }

    @Override
    public boolean close() {
        // get checked objects, cast to string:
        List<Object> tagList = Arrays.asList(viewer.getCheckedElements());
        this.checkedElements = tagList.toArray(new String[tagList.size()]);
        this.filterOrg = filterOrgCheckbox.getSelection();
        this.hideEmpty = hideEmptyCheckbox.getSelection();
        visibleTypes.clear();
        List<Object> typeList = Arrays.asList(viewerType.getCheckedElements());
        if (typeList.size() >= getTypes().length) {
            visibleTypes.add(ElementFilter.ALL_TYPES);
        } else {
            for (Object object : typeList) {
                visibleTypes.add((String[]) object);
            }
        }
        return super.close();
    }

    @Override
    protected void configureShell(Shell newShell) {
        super.configureShell(newShell);
        final int shellWidth = 500;
        final int shellHeight = 570;
        newShell.setText(Messages.ISMViewFilterDialog_5);

        // workaround to prevent tableviewer size from exceeding shell size:
        newShell.setSize(shellWidth, shellHeight);
    }
    
    protected HUITypeFactory getTypeFactory() {
        return (HUITypeFactory) VeriniceContext.get(VeriniceContext.HUI_TYPE_FACTORY);
    }

    public String[][] getTypes() {
        return types;
    }

    public void setTypes(String[][] types) {
        this.types = types;
    }
}

class CheckStateProvider implements ICheckStateProvider  {

    private Set<String[]> visibleTypes;
    
    public CheckStateProvider(Set<String[]> visibleTypes) {
        this.visibleTypes = visibleTypes;
    }

    @Override
    public boolean isChecked(Object o) {
        String[] element = (String[]) o;
        for (String[] type : visibleTypes) {
            int typeHash = Arrays.hashCode(type);
            if (typeHash == Arrays.hashCode(element)
                    || typeHash == Arrays.hashCode(ElementFilter.ALL_TYPES)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean isGrayed(Object element) {
        return false;
    }
}
