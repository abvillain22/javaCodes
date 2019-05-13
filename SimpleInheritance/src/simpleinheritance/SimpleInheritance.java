/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simpleinheritance;

/**
 *
 * @author abvil
 */
public class SimpleInheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        A superOb =new A();
        B subOb = new B();
        
        superOb.i=10;
        superOb.j=20;
        
        System.out.println("contents od superOb : ");
        superOb.showij();
        System.out.println();
        
        subOb.i=7;
        subOb.j=8;
        subOb.k=9;
        System.out.println("contents of subOb : ");
        subOb.showij();
        subOb.showk();
        System.out.println();
        
        System.out.println("sum of i , j and k in subOb :");
        subOb.sum();
    }
    
}
