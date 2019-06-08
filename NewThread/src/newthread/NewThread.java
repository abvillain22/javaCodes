/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newthread;

/**
 *
 * @author abvil
 */
public abstract class NewThread implements Runnable {
    
    Thread t;
    
    NewThread(){
        t=new Thread(this,"Demo Thread");
        System.out.println("Child thread : "+t);
    }
    
    @Override
    public void run(){
        try{
            for(int i=5; i>0; i--){
                System.out.println("Child Thread : "+i);
                Thread.sleep(500);
            }
        }catch(InterruptedException e){
            System.out.println("Child interrupted");
        }
        System.out.println("Exiting child thread");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NewThread nt;
        nt = new NewThread() {};
        
        nt.t.start();
        try{
            for(int i=5; i>0; i--){
                System.out.println("Main Thread : "+i);
                Thread.sleep(500);
            }
        }catch(InterruptedException e){
            System.out.println("Main interrupted");
        }
        System.out.println("Exiting main thread");
        
    }
    
}
