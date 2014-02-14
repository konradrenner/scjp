/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package at.arz.scjp.codebeispiele;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Konrad Renner
 */
public class RegexTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String text = "ab34ef";
        String pattern = "\\d*";


        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(text);
        boolean b = false;
        while (b = m.find()) {
            System.out.println("Pos:" + m.start() + "; Group" + m.group());
        }

    }
}
