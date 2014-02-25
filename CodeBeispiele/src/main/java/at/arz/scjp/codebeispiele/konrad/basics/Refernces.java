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

import java.util.Date;

/**
 * Pass-by-value Konzept, this und super Keywords
 *
 * @author Konrad Renner
 */
public class Refernces {

    //Datum ist nicht immutable!!!
    final Date datum;

    public Refernces() {
        this.datum = new Date(System.currentTimeMillis());
        System.out.println("References datum:" + datum);
    }
    
    public void doSomething(Date date) {
        date.setTime(123);
        System.out.println("doSomething date:" + date);

        date = new Date(System.currentTimeMillis());
        System.out.println("doSomething date:" + date);
    }

    public void doSomething(int index) {
        System.out.println("doSomething index:" + index);
        index++;
        System.out.println("doSomething index:" + index);
        index = 5;
        System.out.println("doSomething index:" + index);
    }

    public static void main(String[] args) {
        new Subclass();
        new Subclass(456);
        new Subclass(new Date(123));

        int index = -1;
        new Refernces().doSomething(index);
        System.out.println("after doing index:" + index);

        Date date = new Date(System.currentTimeMillis());
        new Refernces().doSomething(date);
        System.out.println("after doing date:" + date);
    }
}

class Subclass extends Refernces {

    Date datum;

    public Subclass() {
        //Dieser Aufruf muss, falls es in der Elternklasse einen Standardkonstruktor gibt nicht explizit erfolgen
        super();
        System.out.println("Subclass datum:" + datum);
        System.out.println("Subclass super.datum:" + super.datum);
    }

    public Subclass(long time) {
        this(new Date(time));
        System.out.println("Subclass mit long datum:" + datum);
        System.out.println("Subclass mit long super.datum:" + super.datum);

    }

    public Subclass(Date datum) {
        datum = datum;
        System.out.println("Subclass mit Date datum:" + datum);
        System.out.println("Subclass mit Date this.datum:" + this.datum);
        System.out.println("Subclass mit Date super.datum:" + super.datum);
    }
}
