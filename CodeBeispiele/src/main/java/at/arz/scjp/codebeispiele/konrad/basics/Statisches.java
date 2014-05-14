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
 *
 * @author Konrad Renner
 */
public class Statisches {

    public static void main(String[] args) {
        AA a = new AA();
        AA b = new BB();
        CC c = new CC();

        a.print();
        b.print();
        CC.print();
        c.print();
        c.print(6);
    }
}

class AA {

    public static void print() {
        System.out.println("AA.print");
    }
}

class BB extends AA {

    public static void print() {
        System.out.println("BB.print");
    }
}

class CC extends BB {

    public static void print(int i) {
        System.out.println("CC.print:" + i);
    }
}
