/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkginstanceof;

/**
 *
 * @author abvil
 */
public class InstanceOf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();
        
        if(a instanceof A){
            System.out.println("a is instance of A");
        }
        
        if(b instanceof B){
            System.out.println("b is instance of B");
        }
        
        if(c instanceof C){
            System.out.println("c is instance of C");
        }
        
        if(a instanceof C){
            System.out.println("a can be cast to C");
        }
        
        System.out.println();
        
        A ob;
        
        ob=d;
        System.out.println("ob now refers to d");
        
        if(ob instanceof D){
            System.out.println("ob is instance of D");
        }else{
            System.out.println("ob cannot be cast to D");
        }
        
        if(ob instanceof A){
            System.out.println("ob can be cast to A");
        }
        
        System.out.println();
        
        if(a instanceof Object){
            System.out.println("a may be cast to Object");
        }
        
        if(d instanceof A){
            System.out.println("d can be cast to A");
        }else{
            System.out.println("d cannot be cast to A");
        }
        
        if(a instanceof D){
            System.out.println("a can be cast to D");
        }else{
            System.out.println("a cannot be cast to D");
        }
    }
}




