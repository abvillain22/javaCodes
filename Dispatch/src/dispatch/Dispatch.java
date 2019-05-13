/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dispatch;

/**
 *
 * @author abvil
 */
public class Dispatch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        
        A r;
        
        r=a;
        r.callMe();
        
        r=b;
        r.callMe();
        
        r=c;
        r.callMe();
    }
    
}
