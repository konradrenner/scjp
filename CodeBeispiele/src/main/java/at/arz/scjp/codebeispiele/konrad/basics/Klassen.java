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

import java.io.Serializable;

/**
 *
 * @author Konrad Renner
 */
public class Klassen {

    enum Woerter {

        TEST("TEST") {
            @Override
            public String lowerCase() {
                return "test";
            }
        }, HALLO("Hallo") {
            @Override
            public String lowerCase() {
                return "hi";
            }
        };
        private final String value;

        private Woerter(String s) {
            value = s;
        }

        public String getValue() {
            return value;
        }


        public abstract String lowerCase();
    }
    public static final String EINS = "TEST";
    public static final String ZWEI = "Hallo";


    public static void main() {
        Auto a = new Volkswagen();
        Fahrzeug f = new Volkswagen();
        System.out.println("f.getFarbe():" + f.getFarbe());

        String s = "TEST";

        Woerter.valueOf(s).lowerCase();

        if (Klassen.EINS.equals(s)) {
            //safsdfsdfs
        } else if (Klassen.ZWEI.equals(s)) {
        }

        Fahrzeug fahr = new Fahrzeug() {
            @Override
            public int getFarbe() {
                return -1;
            }
        };

    }

    public void doSomething() {
        new InnerKlasse();
    }

    public static class InnerKlasse {
    }
}

interface Fahrzeug{

    int getFarbe();
}

interface Test extends Serializable{
}

abstract class Auto implements Fahrzeug, Test {

    int reifen = 4;
    final String marke;

    public Auto() {
        marke = initMarke();
    }

    public int getReifen() {
        return reifen;
    }

    public String getMarke() {
        return marke;
    }

    abstract String initMarke();
}
class Volkswagen extends Auto {

    @Override
    public String initMarke() {
        return "Volkswagen";
    }

    @Override
    public int getFarbe() {
        return 0;
    }
}
