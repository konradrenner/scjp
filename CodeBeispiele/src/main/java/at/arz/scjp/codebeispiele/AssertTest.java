/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package at.arz.scjp.codebeispiele;

/**
 *
 * @author Konrad Renner
 */
public class AssertTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int j = 6;

        assert (++j > 7);
        assert (++j > 8) : "hi";
        assert (j > 10) : j = 12;
        //Kompiliert nicht, weil die Methode nichts returned
        //assert (j == 12) : doStuff();
        assert (j == 12) : new AssertTest();

    }

    static void doStuff() {
    }
}
