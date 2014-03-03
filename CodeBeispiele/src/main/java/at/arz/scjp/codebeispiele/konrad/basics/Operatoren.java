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

/**
 * Auflistung verschiedener Möglichkeiten zur Verwendung von Operatoren
 *
 * @author Konrad Renner
 */
public class Operatoren {
    public static void main(String[] args) {
        int i = 2;

        i *= i + 1; //Equivalent mit i = i * (i+5)

        System.out.println("i:" + i);

        Number n = Integer.valueOf(i);
        //if(n instanceof String){} => Compilefehler, da nicht gleiche Vererbungshierarchie
        Object o = (Object) n;
        if (o instanceof Integer) {
            System.out.println("Hallo instanceof");
        }

        {
            boolean b = o instanceof String;
            System.out.println("o instanceof String:" + b);
        }

        //Modulo Operator
        //Es gilt immer: 
        //Wenn zahl % divisor = x ist, und zahl / divisor = y ist, dann gilt: zahl = divisor*y + x.
        i = 2;
        int j = 4;
        System.out.println("Ganzzahlige Division (wird immer abgerundet): " + (i / j));
        System.out.println("Divisionsrest, Modulo, Modulus: " + (i % j));
        System.out.println("Rueckwaerts: " + (((i / j) * j) + (i % j)));


        System.out.println("Hi, " + i + 2);
        System.out.println(i + 2 + " HI");

        //Wichtig ist hier die Unterscheidung zwischen prefix und postfix!
        int x = 0;
        int z = 1;
        int y = 2;
        if (z == x++) {
            System.out.println("unreachable");
        } else if (y == ++x) {
            System.out.println("Hallo!");
        }

        //Hier ists Wurst, Erhoehung immer bevor neuem Durchlauf!
        for (int b = 0; b < 2; ++b) {
            System.out.println("b:" + b);
        }

        int b = z++ + ++z;
        //int b= z++ +++z; => nicht moeglich!

        o = null;

        try {
            if (o == null | o.toString().length() == 0) {
                System.out.println("Unreachable");
            }
        } catch (NullPointerException e) {
            // bei not short curcuit logischen operatoren, werden IMMER beide Seiten ausgewertet
            System.out.println("Reachable:" + e.getMessage());
        }

        if (o == null || o.toString().length() == 0) {
            System.out.println("Nur erster Ausdruck wurde ausgewertet");
        }

        //Bei XOR (exclusive OR) darf nur 1 der beiden Ausdruecke true sein
        i = 5;
        x = 6;

        boolean erg = (i < x) ^ (x > i);
        System.out.println("erg:" + erg);
        erg = (i > x) ^ (x > i);
        System.out.println("erg:" + erg);
    }
}
