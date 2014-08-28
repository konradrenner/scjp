/*
 * Copyright (C) 2014 Konrad Renner
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package at.arz.scjp.codebeispiele.konrad.basics;

import java.util.Calendar;

/**
 *
 * @author Konrad Renner
 */
public class Dates {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Calendar cal = init();
        cal.add(Calendar.DAY_OF_MONTH, 2);

        System.out.println("Datum mit add:" + cal.getTime());

        cal = init();

        cal.roll(Calendar.DAY_OF_MONTH, 2);

        System.out.println("Datum mit add:" + cal.getTime());
    }

    static Calendar init() {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 2014);
        cal.set(Calendar.MONTH, 0);
        cal.set(Calendar.DAY_OF_MONTH, 30);

        return cal;
    }
}
