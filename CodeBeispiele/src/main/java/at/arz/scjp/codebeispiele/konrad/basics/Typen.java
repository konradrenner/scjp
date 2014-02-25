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

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * Verwendung und casts der primitiven Datentypen und deren Wrapper-Klassen,
 * inkl. Boxing. Weiters werden volatile und transient Modifier behandelt
 *
 * @author Konrad Renner
 */
public class Typen {

    //Nur die Deklaration von volatile macht die Variable nicht Thread-safe => zB sind increment, decrement nicht atomar!
    //Volatile bedeutet nur, dass der Objektzustand bzw. Wert nach erfolgreichen aendern eines Threads, sofort allen Threads zugaenglich gemacht wird (die Threads aktualiseren ihre internen caches)
    private volatile int a;
    //Diese Deklaration ist Thread-safe, weil der Zugriff auf den primitiven Datentyp boolean immer atomar ist!
    private volatile boolean flag;

    public static void main(String[] args) throws IOException {
        
        doTransientExample();

        //Auto Boxing
        Integer i = 10;
        System.out.println("i:" + i);
        //Auto Unboxing
        int idx = i;
        System.out.println("idx:" + idx);

        //Jeder Primitive Datentyp hat in Java eine Wrapper-Klasse!
        Boolean bool = null;
        try {
            boolean little = bool;
        } catch (NullPointerException npe) {
            System.out.println("Beim Auto Unboxing kann es zu NPE kommen!");
        }
        
        Integer[] arr = new Integer[0];
        int[] arrZwei = new int[0];
        int[][] arrDrei = new int[2][];
        
        doSomething(idx);
        doSomething(i);
        doSomething((short) idx);
        doSomething(arr);
        doSomething(arrZwei);
        doSomething(0, 5, 6);
        doSomething(arrDrei);


        String a = "sdfd";
        //Der folgende Code ist auskommentiert, weil er nicht kompilieren wuerde (Integer und String stehen nicht in einer Vererbungshierarchie und koennen somit mit instanceof nicth verglichen werden
        //if(a instanceof Integer)
        //    System.out.println("");
    }

    public static void doSomething(int in) {
        System.out.println("int");
    }

    public static void doSomething(Object in) {
        System.out.println("Object");
    }

    public static void doSomething(Object[] in) {
        System.out.println("Object[]");
    }

    public static void doSomething(short in) {
        System.out.println("short");
    }

    public static void doSomething(long[] in) {
        System.out.println("long[]");
    }

    public static void doSomething(Integer... in) {
        System.out.println("Integer...");
    }


    public static void doTransientExample() throws IOException {
        TransientExample example = new TransientExample();
        System.out.println("Transient Beispiel Start, " + example);
        //Das ist das try-with-Ressources Feature von Java 7, falls bei der Pruefung so ein Code kommt, gibts Compile Fehler!!! Aber es geht hier um die Serialisierung, deshalb verwend ich das so
        File file = new File("/home/koni/Temp/transient.example");
        if (!file.exists()) {
            file.createNewFile();
        }
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
            oos.writeObject(example);
        } catch (IOException e) {
            e.printStackTrace();
        }

        Object readObject = null;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("/home/koni/Temp/transient.example")))) {
            readObject = ois.readObject();
        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        System.out.println("Transient Beispiel Ende, " + readObject);
    }
}

class TransientExample implements Serializable {

    private transient int i = 5;
    private int x = 5;

    @Override
    public String toString() {
        return "TransientExample{" + "i(transient value)=" + i + ", x=" + x + '}';
    }
}
