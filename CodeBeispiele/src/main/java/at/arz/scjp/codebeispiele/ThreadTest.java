/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package at.arz.scjp.codebeispiele;


/**
 *
 * @author Konrad Renner
 */
public class ThreadTest implements Runnable {

    @Override
    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            //nothing
        }
        System.out.print("in ");
    }


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int s = 10;
        System.out.println(s++ - --s);
        System.out.println(++s - s--);
        System.out.println(s-- - ++s);
        System.out.println(--s - s++);
        
        byte value = 1;
        
        new Test().test(value);

        Thread t = new Thread(new ThreadTest());
        t.start();
        System.out.println("pre ");
        try {
            t.join();
        } catch (InterruptedException ex) {
            //nothing
        }
        System.out.println("post ");

    }
}
class Test {

    public void test(int test) {
        System.out.println("int");
    }

    public void test(short test) {
        System.out.println("short");
    }

    public void test(Short test) {
        System.out.println("Short");
    }

    public void test(Long test) {
        System.out.println("Long");
    }
}
