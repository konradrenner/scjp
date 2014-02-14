/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package at.arz.scjp.codebeispiele;

/**
 *
 * @author Konrad Renner
 */
public class OperatorenTest {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        Long x = 42L;
        Long y = 44L;
        System.out.print(" " + 7 + 2 + " ");
        System.out.print(foo() + x + 5 + " ");
        System.out.println(x + y + foo());

        int index = 1;
        int[][] arr = {{5}, {2, 4, 5}};

        System.out.println(arr[index++][index++]);

    }

    static String foo() {
        return "foo";
    }
//Compilefehler
//    static void weitereTests1() {
//        float f1 = 2.3f;
//        float[][] f2 = {{42.0f}, {1.7f, 2.3f}, {2.6f, 2.7f}};
//        float[] f3 = {2.7f};
//        Long x = 42L;
//        if (f1 == f2) {
//            System.out.println("true");
//        }
//
//    }

    static void weitereTests2() {
        float f1 = 2.3f;
        float[][] f2 = {{42.0f}, {1.7f, 2.3f}, {2.6f, 2.7f}};
        float[] f3 = {2.7f};
        Long x = 42L;
        if (f1 == f2[2][1]) {
            System.out.println("true");
        }

    }

    static void weitereTests3() {
        float f1 = 2.3f;
        float[][] f2 = {{42.0f}, {1.7f, 2.3f}, {2.6f, 2.7f}};
        float[] f3 = {2.7f};
        Long x = 42L;
        if (x == f2[0][0]) {
            System.out.println("true");
        }

    }
// Compilefehler
//    static void weitereTests4() {
//        float f1 = 2.3f;
//        float[][] f2 = {{42.0f}, {1.7f, 2.3f}, {2.6f, 2.7f}};
//        float[] f3 = {2.7f};
//        Long x = 42L;
//        if (f1 == f2[1,1]) {
//            System.out.println("true");
//        }
//
//    }

    static void weitereTests5() {
        float f1 = 2.3f;
        float[][] f2 = {{42.0f}, {1.7f, 2.3f}, {2.6f, 2.7f}};
        float[] f3 = {2.7f};
        Long x = 42L;
        if (f3 == f2[2]) {
            System.out.println("true");
        }

    }
}
