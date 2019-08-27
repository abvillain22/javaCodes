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
public class GenCons {
    private double val;
    private String str;
    
    <T extends Number> GenCons(T args, String a){
        val = args.doubleValue();
        str = a;
    }
    
    void showVal(){
        System.out.println("val = " + val);
        System.out.println("str = " + str);
    }
}




