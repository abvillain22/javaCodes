/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autobox;

/**
 *
 * @author abvil
 */
public class AutoBox {

    /**
     * @param args the command line arguments
     */
    
    static int m(Integer v){
        return v;
    }
    
    public static void main(String[] args) {
        Integer iOb = m(100);
        
        System.out.println(iOb);
        
    }
    
}


