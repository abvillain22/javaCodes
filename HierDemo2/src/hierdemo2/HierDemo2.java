/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hierdemo2;

/**
 *
 * @author abvil
 */
public class HierDemo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Gen<String> w = new Gen<>("Value is",99);
        
        System.out.print(w.getOb() + " = ");
        System.out.println(w.getNum());
    }
    
}
