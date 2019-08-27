/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autobox2;

/**
 *
 * @author abvil
 */
public class AutoBox2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Integer iOb1,iOb2;
        int i;
        
        iOb1=100;
        
        ++iOb1;
        System.out.println("After ++iOb1 = "+iOb1);
        
        iOb2 = iOb1+(iOb1/3);
        System.out.println("iOb2 after expression = "+iOb2);
        
        i = iOb1+(iOb1/3);
        System.out.println("i after expression = "+i);
    }
    
}


