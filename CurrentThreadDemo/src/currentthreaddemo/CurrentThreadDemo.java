/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package currentthreaddemo;

/**
 *
 * @author abvil
 */
public class CurrentThreadDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Thread t= Thread.currentThread();
        System.out.println("Current thread : "+t);
        
        t.setName("MyThread");
        System.out.println("after name change : "+t);
        
        try{
            for(int n=5; n>0; n--){
                System.out.println(n);
                Thread.sleep(1000);
            }
        }catch(InterruptedException e){
                    System.out.println("Error : "+e);
        }
    }
    
}
