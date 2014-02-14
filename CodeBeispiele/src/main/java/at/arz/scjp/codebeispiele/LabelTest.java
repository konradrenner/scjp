/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package at.arz.scjp.codebeispiele;

/**
 *
 * @author Konrad Renner
 */
public class LabelTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int i = 0;

        http://www.google.at
        while (i < 10) {
            System.out.println("http i:" + i);
            if (i == 2) {
                i += 8;
                continue http;
            }
            i++;
        }

        doschleife:
        do {
            System.out.println("doschleife i:" + i);
            if (i == 2) {
                break doschleife;
            }
            i--;
        } while (i > 0);

    }
}
