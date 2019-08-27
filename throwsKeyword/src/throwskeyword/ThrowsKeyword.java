/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package throwskeyword;

/**
 *
 * @author abvil
 */
public class ThrowsKeyword {

    /**
     * @param args the command line arguments
     */
    
    static void throwone() throws IllegalAccessException{
        System.out.println("Inside throwone");
        throw new IllegalAccessException("Demo");
    }
    
    public static void main(String[] args) {
        try{
            throwone();
        }
        catch(IllegalAccessException e){
            System.out.println("Caught : "+e);
        }
    }
    
}
