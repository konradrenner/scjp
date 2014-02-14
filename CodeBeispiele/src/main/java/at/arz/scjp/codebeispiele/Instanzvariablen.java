/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package at.arz.scjp.codebeispiele;


/**
 *
 * @author Konrad Renner
 */
public class Instanzvariablen {

    public int a;
}
class Zweite extends Instanzvariablen {

    public int a = 5;

    public void print() {
        System.out.println(this.a + ", super=" + super.a);
    }
}

class Dritte extends Zweite {

    static Animals animals;

    public int a = 10;

    @Override
    public void print() {
        System.out.println(this.a + ", super=" + super.a);
    }

    public static void main(String[] args) {
        Zweite v1 = new Dritte();
        Zweite v2 = new Zweite();


        v1.print();
        v2.print();
        System.out.println(v1.a);
        System.out.println(v2.a);

        System.out.println(animals.DOG.sound);
        
        int i = 0;
        
        test(i);
    }
    
    public static void test(Object o) {
        System.err.println("test1");
    }
    
    public static void test(Integer... t) {
        System.err.println("test2");
    }
}

enum Animals {

    DOG("woof"),
    CAT("miau");
    String sound;

    Animals(String value) {
        sound = value;
    }
}
