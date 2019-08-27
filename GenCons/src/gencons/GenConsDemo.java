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
public class GenConsDemo {
    private double val;
    
    <T extends Number> GenConsDemo(T arg){
        val = arg.doubleValue();
    }
    
    void showVal(){
        System.out.println("val : "+val);
    }
}


