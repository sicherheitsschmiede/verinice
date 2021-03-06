/*******************************************************************************
 * Copyright (c) 2015 Benjamin Weißenfels.
 *
 * This program is free software: you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public License
 * as published by the Free Software Foundation, either version 3
 * of the License, or (at your option) any later version.
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty
 * of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.
 * If not, see <http://www.gnu.org/licenses/>.
 *
 * Contributors:
 *     Benjamin Weißenfels <bw[at]sernet[dot]de> - initial API and implementation
 ******************************************************************************/
package sernet.verinice.rcp.search.tables;

import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.widgets.Composite;

import sernet.verinice.model.search.VeriniceSearchResultTable;
import sernet.verinice.rcp.search.SearchView;
import sernet.verinice.rcp.search.column.ColumnStoreFactory;
import sernet.verinice.rcp.search.column.IColumnStore;

/**
 * Returns a new search result table. Every time a new search is execute or the
 * columns configuration is changed this method should be called.
 *
 * Future purposes can be caching of the table, so large result sets have not to
 * be rendered again and again.
 *
 * Since the {@link SearchView} can have multiple instances this factory should
 * be static or every call has to be syncronized.
 *
 * @author Benjamin Weißenfels <bw[at]sernet[dot]de>
 *
 */
public class SearchTableViewerFactory {

    public TableViewer getSearchResultTable(VeriniceSearchResultTable vSearchResultObject, Composite parent) {
        IColumnStore columnStore = ColumnStoreFactory.getColumnStore(vSearchResultObject.getEntityTypeId());
        return new SearchResultsTableViewer(parent, columnStore, vSearchResultObject);
    }

}
