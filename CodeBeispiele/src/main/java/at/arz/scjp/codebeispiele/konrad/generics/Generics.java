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

package at.arz.scjp.codebeispiele.konrad.generics;

import java.util.ArrayList;

/**
 *
 * @author Konrad Renner
 */
public class Generics {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Typisiert<? super Number> i = null;

        Typisiert<? extends Number> juhu = i.juhu(i);

        ArrayList<? super B> arr = new ArrayList<A>();

        Typisiert<Integer> typen = null;

        arr.add(new C());
    }

}

class Nummernsack<T> {

    private T nummer;

    public Nummernsack(T nummer) {
        this.nummer = nummer;
    }

    public T getNummer() {
        return nummer;
    }

}

abstract class Typisiert<K extends Number> {
    public abstract <K> K useMe(Object o);

    public abstract <V extends K> Typisiert<V> uses();

    public abstract <K> Typisiert<? extends Number> juhu(Typisiert<? super Number> var);

    public abstract <K> Typisiert<? super Number> juhu2(Typisiert<? extends Number> var);
}

class A {
}

class B extends A {
}

class C extends B {
}
