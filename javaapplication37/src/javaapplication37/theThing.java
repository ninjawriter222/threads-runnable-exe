package javaapplication37;

import java.util.*;

/**
 *
 * @author Poozer
 */
public class theThing implements Runnable {
    String name;
    int time;
    Random random = new Random();
    
    public theThing(String z){
        name = z;
        time = random.nextInt(999);
    }
    
    public void run(){
        try{
        System.out.printf("%s is sleeping for %d\n", name, time);
        Thread.sleep(time);
        System.out.printf("%s is done\n", name);
        
    }catch (Exception e){}
    }
}
