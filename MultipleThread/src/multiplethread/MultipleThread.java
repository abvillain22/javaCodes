/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiplethread;

/**
 *
 * @author abvil
 */
public abstract class MultipleThread implements Runnable{
    
    Thread t;
    String name;
    
    MultipleThread(String threadName){
        name=threadName;
        t=new Thread(this,threadName);
        System.out.println("New Thread : "+t);
    }
    
    @Override
    public void run(){
        try{
            for(int i=5; i>0; i--){
                System.out.println(name+" "+i);
                Thread.sleep(1000);
            }
        }catch(InterruptedException e){
            System.out.println(e);
        }
        System.out.println(name+" exiting");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MultipleThread nt1;
        nt1 = new MultipleThread("one") {};
        
        MultipleThread nt2;
        nt2 = new MultipleThread("two") {};
        
        MultipleThread nt3;
        nt3 = new MultipleThread("three") {};
        
        nt1.t.start();
        nt2.t.start();
        nt3.t.start();
        
        try{
            Thread.sleep(10000);
        }catch(InterruptedException e){
            System.out.println("Main Thread : "+e);
        }
        
        System.out.println("main Thread exiting");
    }
    
}
