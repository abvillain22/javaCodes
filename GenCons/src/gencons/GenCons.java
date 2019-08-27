/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gencons;

/**
 *
 * @author abvil
 */
public class GenCons {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GenConsDemo test = new GenConsDemo(2);
        GenConsDemo test2 = new GenConsDemo(2.2F);
        
        test.showVal();
        test2.showVal();
    }
    
}


