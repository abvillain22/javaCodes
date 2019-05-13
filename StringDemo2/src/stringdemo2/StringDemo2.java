/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringdemo2;

/**
 *
 * @author abvil
 */
public class StringDemo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String strobj1 = "First String";
        String strobj2 = "Second String";
        String strobj3 = strobj1;
        
        System.out.println("Length of strobj1 = "+strobj1.length());
        
        System.out.println("char at index 3 in strobj1 = "+strobj1.charAt(3));
        
        if(strobj1.equals(strobj2)){
            System.out.println("strobj1==strobj2");
        }
        else{
            System.out.println("strobj1!=strobj2");
        }
        
        
        if(strobj1.equals(strobj3)){
            System.out.println("strobj1==strobj3");
        }
        else{
            System.out.println("strobj1!=strobj3");
        }
    }
    
}
