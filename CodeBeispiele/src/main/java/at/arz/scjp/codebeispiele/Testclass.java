/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package at.arz.scjp.codebeispiele;


/**
 *
 * @author Konrad Renner
 */
public class Testclass {

    //Abhaenigig in was fuer einer Reihenfolge der static-Blcok definiert ist, ist die Ausgabe unterschiedlich
    static {
        i = 10;
    }
    public static int i = 2;

    public Testclass(String s) {
        double f = 12 / 5.;
    }

    public static void main(String[] args) {
        System.out.println(i);
        
        String s1 = "Testing";
        String s2 = "Testing";
        String s3 = new String("Testing");
        
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1.equals(s3));
    }
}
class Nochmal extends Testclass {

    public Nochmal() {
        super(test());
    }

    public static String test() {
        return null;
    }
}
