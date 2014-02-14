/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package at.arz.scjp.codebeispiele;

/**
 *
 * @author Konrad Renner
 */
public class SwitchTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i = 5;

        switch (i) {
            case 5:
                System.out.println("case 5");
            case 3:
                System.out.println("case 3");
                break;
            default:
                System.out.println("default");
        }

        System.out.println("-------------------");

        i = 7;
        switch (i) {
            default:
                System.out.println("default");
            case 3:
                System.out.println("case 3");
            case 5:
                System.out.println("case 5");
        }

        System.out.println("-------------------");

        switch (i) {
            default:
                System.out.println("default");
                break;
            case 3:
                System.out.println("case 3");
            case 5:
                System.out.println("case 5");
        }
    }
}
