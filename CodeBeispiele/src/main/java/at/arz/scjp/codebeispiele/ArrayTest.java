/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package at.arz.scjp.codebeispiele;

import java.util.Arrays;

/**
 *
 * @author Konrad Renner
 */
public class ArrayTest {

    public static void main(String[] args) {
        //Die Klammern koennen vorne oder hinten bei der Variable stehen, es muss immer nur die erste Ebene initialisiert werden
        String[] arr[] = new String[3][];
        arr[0] = new String[2];

        System.out.println(Arrays.toString(arr[0]));
        System.out.println(arr[1]);
        System.out.println(Arrays.toString(arr[2]));
        System.out.println("---------------");
        
        int[][] intArr = new int[2][2];
        
        System.out.println(Arrays.toString(intArr[0]));
        System.out.println(Arrays.toString(intArr));
    }
}
