/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autobox3;

/**
 *
 * @author abvil
 */
public class AutoBox3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Integer iOb = 100;
        Double dOb = 98.6;
        
        dOb = iOb+dOb;
        
        System.out.println("dOb after expression = "+dOb);
    }
    
}


