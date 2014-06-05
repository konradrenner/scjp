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
package at.arz.scjp.codebeispiele.konrad.collection;

import java.util.NavigableMap;
import java.util.TreeMap;

/**
 *
 * @author Konrad Renner
 */
public class SubMaps {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(0, "null");
        map.put(1, "eins");
        map.put(2, "zwei");
        map.put(3, "drei");
        map.put(4, "vier");

        try {
            NavigableMap<Integer, String> subMap = map.subMap(0, true, 4, false);
            System.out.println(subMap);
            System.out.println(subMap.size());
            System.out.println(subMap.subMap(0, 3));
            System.out.println(subMap.subMap(0, true, 3, false));
            System.out.println(subMap.subMap(0, true, 3, false).size());
        } catch (IllegalArgumentException ex) {
            System.out.println("Exception:" + ex.getMessage());
        }
    }
}
