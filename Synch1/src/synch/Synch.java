/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package synch;

/**
 *
 * @author abvil
 */
public class Synch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Callme target = new Callme();
        
        Caller ob1;
        ob1 = new Caller(target,"Hello") {};
        
        Caller ob2;
        ob2 = new Caller(target,"Synchronized") {};
        
        Caller ob3;
        ob3 = new Caller(target,"World") {};
        
        ob1.t.start();
        ob2.t.start();
        ob3.t.start();
        
        try{
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        }catch(InterruptedException e){
            System.out.println("Interrupted");
        }
    }
    
}


