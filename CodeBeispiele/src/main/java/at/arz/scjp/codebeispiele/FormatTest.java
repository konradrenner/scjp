/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package at.arz.scjp.codebeispiele;

/**
 *
 * @author Konrad Renner
 */
public class FormatTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String s1 = null;
        String s2 = "TrUe";
        String s3 = "no";
        Boolean b1 = Boolean.TRUE;
        boolean b2 = false;

        //Achtung bei jedem Objekt das != Boolean ist, wird bei dieser Formattierung true geliefert (siehe API Doc)
        //Es koennen mehr Varargs angegeben werden, als Formats definiert sind, aber nicht umgekehrt
        System.out.printf("%b %b %b %b", s1, s2, s3, b1, b2);
    }
}
