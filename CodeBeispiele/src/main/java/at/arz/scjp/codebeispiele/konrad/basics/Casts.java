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

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Konrad Renner
 */
public class Casts {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Number integer = 5;
        Number zahl = null;

        Integer i = (Integer) zahl;
        System.out.println("Gecasted:" + i);

        try {
            Double d = (Double) integer;
        } catch (ClassCastException e) {
            System.out.println("Exception");
        }

        if (zahl instanceof Integer) {
            System.out.println("Ist ein Integer");
        } else {
            System.out.println("Ist kein Integer:" + zahl);
        }

        List<Number> ma = new ArrayList<Number>();
        List<Integer> mc = new ArrayList<Integer>();
        System.out.print(ma instanceof List);
        System.out.print(ma instanceof ArrayList);
        System.out.print(mc instanceof List);
        System.out.print(mc instanceof ArrayList);
    }
}
