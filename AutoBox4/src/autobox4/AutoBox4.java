/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autobox4;

/**
 *
 * @author abvil
 */
public class AutoBox4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Boolean b = true;
        
        if(b) System.out.println("b is true");
        
        Character ch = 'x';
        char ch2 = ch;
        
        System.out.println("ch2 is = "+ch2);
    }
    
}


