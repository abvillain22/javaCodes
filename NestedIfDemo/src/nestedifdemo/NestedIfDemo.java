/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nestedifdemo;

/**
 *
 * @author abvil
 */
public class NestedIfDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        A.NestedIF nif = new B();
        
        boolean a = nif.isNotNegative(10);
        System.out.println(a);
        
        boolean b = nif.isNotNegative(-12);
        System.out.println(b);
            
    }
    
}
