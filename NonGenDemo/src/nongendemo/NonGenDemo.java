/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nongendemo;

/**
 *
 * @author abvil
 */
public class NonGenDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NonGen iOb;
        iOb = new NonGen(88);
        iOb.ShowType();
        int v = (Integer) iOb.getOb();
        System.out.println("value of V = "+v);
        System.out.println();
        
        NonGen strOb = new NonGen("Non-Generics test");
        strOb.ShowType();
        String str = (String) strOb.getOb();
        System.out.println("value of str = "+str);
        
        iOb = strOb;
        iOb.ShowType();
    }
    
}



