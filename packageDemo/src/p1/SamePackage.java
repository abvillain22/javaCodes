/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1;

/**
 *
 * @author abvil
 */
public class SamePackage {
    public SamePackage(){
        Protection p = new Protection();
        System.out.println("same package constructor");
        System.out.println("n = " + p.n);
        System.out.println("n_pub = " + p.n_pub);
        System.out.println("n_pro = " + p.n_pro);
    }
    
}
