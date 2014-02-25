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

import java.util.Arrays;

/**
 * Diese Klasse zeigt die unterschiedlichen Moeglichkeiten von Bloecken in Java
 * und deren Ausführungsreihenfolge
 *
 * @author Konrad Renner
 */
public class Blocks {

    private int i = 1;
    //Initialisierung kann auch in einem initializer Block erfolgen!
    private final static String[] arr;
    //Eine final Instanzvariable muss entweder im Konstruktor oder im Initializer Block initiatlisiert werden
    private final int zahl;

    {
        System.out.println("Block initializer i:" + i);
        zahl = i;
        i = 2;
    }

    static {
        arr = new String[1];
        arr[0] = "Hallo Welt!";

        System.out.println("static block arr:" + Arrays.toString(arr));
    }
    
    public Blocks() {
        System.out.println("Konstruktor i:" + i);
        System.out.println("Konstruktor zahl:" + zahl);
        System.out.println("Konstruktor arr:" + Arrays.toString(arr));
    }

    public void doSomething() {
        int y = 0;

        {
            int x = 0;
            System.out.println("doSomething x:" + x + "; y:" + (y++));
        }

        {
            int x = 1;
            System.out.println("doSomething x:" + x + "; y:" + (++y));
        }
    }

    public static void main(String[] args) {
        new Blocks().doSomething();
    }
}
