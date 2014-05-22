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
package at.arz.scjp.codebeispiele.konrad.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Konrad Renner
 */
public class PatternMatcher {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        String theText = "Hallo ich bin ein lustiger TEXTich";
//        Pattern compiled = Pattern.compile("ich");
//        Matcher matcher = compiled.matcher(theText);
//
//        while (matcher.find()) {
//            System.out.println("Start-Index:" + matcher.start());
//            System.out.println("End-Index:" + matcher.end());
//            System.out.println("Group:" + matcher.group());
//        }

        String theText = "Hallo ich bin ein lustiger TEXTich";
        Pattern compiled = Pattern.compile("[ohn]\\s[i-l]");
        Matcher matcher = compiled.matcher(theText);

        while (matcher.find()) {
            System.out.println("Start-Index:" + matcher.start());
            System.out.println("End-Index:" + matcher.end());
            System.out.println("Group:" + matcher.group());
        }
    }
}
