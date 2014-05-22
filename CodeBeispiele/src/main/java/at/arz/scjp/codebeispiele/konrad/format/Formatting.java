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
package at.arz.scjp.codebeispiele.konrad.format;

import java.math.BigDecimal;
import java.text.DecimalFormat;

/**
 *
 * @author Konrad Renner
 */
public class Formatting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int zahl = 5;
        float floating = -2F;
        BigDecimal decimal = BigDecimal.valueOf(3.2);

        //%[arg_index$][flags][width][.precision]conversion char
        System.out.printf("Int: %2$+05d , Float: %1$-,7.2f, Decimal: %3f", floating, zahl, decimal);

        System.out.println("");

        double d = 1289978799345.67890;
        DecimalFormat df = new DecimalFormat("###,##0.00");
        System.out.println(df.format(d));
    }
}
