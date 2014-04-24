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

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 *
 * @author Konrad Renner
 */
public class Serialisierung {

    public static void main(String... args) throws Exception {
        B b = new B();

        ObjectOutputStream save = new ObjectOutputStream(new FileOutputStream("datafile"));
        save.writeObject(b);
        save.flush();


        ObjectInputStream restore = new ObjectInputStream(new FileInputStream("datafile"));
        B z = (B) restore.readObject();

        System.err.println("instanz:" + (b == z));
        System.err.println("b.i:" + b.i);
        System.err.println("b.z:" + z.i);
    }
}

class A {

    final int i;

    public A() {
        System.out.println("AHA");
        i = 1;
    }

    public A(String bernd) {
        System.out.println("A");
        i = 0;
    }
}

class B extends A implements Serializable {

    public B() {
        super("Hi Tom");
        System.out.println("B");
    }
}
