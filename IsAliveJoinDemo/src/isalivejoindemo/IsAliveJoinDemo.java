/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isalivejoindemo;

/**
 *
 * @author abvil
 */
public class IsAliveJoinDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NewThread nt1;
        nt1 = new NewThread("One") {};
        
        NewThread nt2;
        nt2 = new NewThread("Two") {};
        
        NewThread nt3;
        nt3 = new NewThread("Three") {};
        
        nt1.t.start();
        nt2.t.start();
        nt3.t.start();
        
        System.out.println("Thread one is alive "+nt1.t.isAlive());
        System.out.println("Thread two is alive "+nt2.t.isAlive());
        System.out.println("Thread three is alive "+nt3.t.isAlive());
        
        try{
            nt1.t.join();
            nt2.t.join();
            nt3.t.join();
        }catch(InterruptedException e){
            System.out.println("Main Thread interrupted");
        }
        System.out.println("Thread one is alive "+nt1.t.isAlive());
        System.out.println("Thread two is alive "+nt2.t.isAlive());
        System.out.println("Thread three is alive "+nt3.t.isAlive());
        System.out.println("Main Thread Exiting");
    }
    
}
