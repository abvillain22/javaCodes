/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gendemo;

/**
 *
 * @author abvil
 */
public class GenDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Gen<Integer> iOb;
        
        iOb = new Gen<>(88);
        iOb.showType();
        int v = iOb.getOb();
        System.out.println("Value of v = "+v);
        System.out.println();
        
        Gen<String> strOb = new Gen<>("Generics Test");
        strOb.showType();
        String str = strOb.getOb();
        System.out.println("value of str = "+str);
    }
    
}




