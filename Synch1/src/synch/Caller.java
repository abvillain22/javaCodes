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
public abstract class Caller implements Runnable{
    String msg;
    Callme target;
    Thread t;
    
    public Caller(Callme targ,String s){
        target = targ;
        msg = s;
        t = new Thread(this);
    }
    
    @Override
    public void run(){
        target.call(msg);
    }
}


