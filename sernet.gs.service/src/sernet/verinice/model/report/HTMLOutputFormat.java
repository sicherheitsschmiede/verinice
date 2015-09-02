/*******************************************************************************
 * Copyright (c) 2010 Robert Schuster <r.schuster@tarent.de>.
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
 *     Robert Schuster <r.schuster@tarent.de> - initial API and implementation
 ******************************************************************************/
package sernet.verinice.model.report;

import java.io.Serializable;

import sernet.verinice.interfaces.report.IOutputFormat;


public class HTMLOutputFormat extends AbstractOutputFormat implements IOutputFormat, Serializable {

	/**
     * 
     */
    private static final long serialVersionUID = 20141007L;

    @Override
	public String getFileSuffix() {
		return "html";
	}

	@Override
	public String getId() {
		return "html";
	}

	@Override
	public String getLabel() {
		return "Hypertext Markup Language (HTML)";
	}

    /* (non-Javadoc)
     * @see sernet.verinice.model.report.AbstractOutputFormat#isRenderOutput()
     */
    @Override
    public boolean isRenderOutput() {
        return true;
    }
}
