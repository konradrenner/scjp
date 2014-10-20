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

package at.arz.scjp.codebeispiele.konrad.basics.package2;

import java.io.Serializable;

/**
 *
 * @author Konrad Renner
 */
public class Nochmal {

    public static void printFirst(Serializable... va) {
        System.out.print("Integer:" + va[0]);
    }

    public static void printFirst(Integer... va) {
        System.out.print("Integer:" + va[0]);
    }

//    public static void printFirst(int[] va) {
//        System.out.print("Integer:" + va[0]);
//    }

    public static void printFirst(int... aa) {
        System.out.print("int:" + aa[0]);
    }

    public static void printFirst(int aa) {
//        System.out.print("int:" + aa[0]);
    }

    public static void printFirst(Object[] arr) {
        //nix
    }

    public static void printFirst(Number... aa) {
        System.out.print("int:" + aa[0]);
    }

    public static void main(String args[]) {
        printFirst(3);

        String s = new String(new char[]{0});
    }
}
