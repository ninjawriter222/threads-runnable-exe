package javaapplication37;

/**
 *
 * @author Poozer
 */
public class Devin {

    public static void main(String[] args) {
        
        Thread t1 = new Thread (new theThing("one"));
        Thread t2 = new Thread (new theThing("two"));
        Thread t3 = new Thread (new theThing("three"));
        Thread t4 = new Thread (new theThing("four"));
        
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        
    }
}