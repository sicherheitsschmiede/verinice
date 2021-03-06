/*******************************************************************************
 * Copyright (c) 2018 Daniel Murygin.
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
 ******************************************************************************/
package sernet.verinice.service.bp.migration;

/**
 * MigrationException is thrown if an error occurs during of the modeling in
 * ITBP from version 1.16 to 1.17
 */
public class MigrationException extends RuntimeException {

    private static final long serialVersionUID = 9175876101514246807L;

    public MigrationException(String message) {
        super(message);
    }

    public MigrationException(String message, Exception cause) {
        super(message, cause);
    }

}
