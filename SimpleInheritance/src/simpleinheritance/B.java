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
public class B extends A {
    int k;
    
    void showk(){
        System.out.println("k : " + k);
    }
    
    void sum(){
        System.out.println("i+j+k : " + (i+j+k) );
    }
}
