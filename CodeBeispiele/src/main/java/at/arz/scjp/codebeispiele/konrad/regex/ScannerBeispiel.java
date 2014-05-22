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
package at.arz.scjp.codebeispiele.konrad.regex;

import java.util.Scanner;

/**
 *
 * @author Konrad Renner
 */
public class ScannerBeispiel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String input = "1 true 34 hi";
        boolean b2, b;
        int i;
        String s, hits = " ";
        Scanner s1 = new Scanner(input);
        Scanner s2 = new Scanner(input);
        while (b = s1.hasNext()) {
            s = s1.next();
            hits += s;
        }
        System.out.println("hits:" + hits);
        hits = "";
        while (b = s2.hasNext()) {
            if (s2.hasNextInt()) {
                i = s2.nextInt();
                hits += "integer";
            } else if (s2.hasNextBoolean()) {
                b2 = s2.nextBoolean();
                hits += "boolean";
            } else {
                s2.next();
                hits += "text";
            }
        }
        System.out.println("hits " + hits);


    }
}
