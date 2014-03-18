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
package at.arz.scjp.codebeispiele.konrad.cag;

import java.util.ArrayList;
import java.util.List;

/**
 * Die folgenden Beispiele skizzieren die Verwendung von Wildcards bei Generics.
 * Folgendes Prinzip hilft beim verstehen, wann welcher Typ verwendet werden
 * soll:<br>
 * <b>LESS</b> => <b>L</b>esen = <b>E</b>xtends, <b>S</b>chreiben = <b>S</b>uper
 *
 * @author Konrad Renner
 */
public class Generics {

    public static void main(String[] args) {
        List<Number> nummern = new ArrayList<>();
        nummern.add(Double.valueOf("0.1"));
        nummern.add(0);

        System.out.println("Nummer:" + new Generics().getNummer(nummern, 0));
        System.out.println("Nummer[0]:" + new Generics().getNullstes(nummern));

        List<CharSequence> sequenz = new ArrayList<>();
        new Generics().fuegeNummerHinzu(sequenz);
        System.out.println("So schauts aus:" + sequenz);
    }

    //Upper bound Wildcard
    public Number getNummer(List<? extends Number> nummer, int wert) {
        for (Number num : nummer) {
            if (num.intValue() == wert) {
                return wert;
            }
        }

        return 0;
    }

    //Lower bound Wildcard
    public void fuegeNummerHinzu(List<? super CharSequence> strings) {
        strings.add("Hallo");
        StringBuilder sb = new StringBuilder("Ich bin auch eine CharSquence");
        strings.add(sb);
    }

    //Unbounded Wildcard, gleichbedeutend wie <? extends Object>
    public Object getNullstes(List<?> liste) {
        return liste.get(0);
    }
}
