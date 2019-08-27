/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genconsdemo;

/**
 *
 * @author abvil
 */
public class GenConsDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GenCons test = new GenCons(100,"Abhay");
        GenCons test2 = new GenCons(88.88,"Arjun");
        
        test.showVal();
        test2.showVal();
    }
    
}



