/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hierdemo;

/**
 *
 * @author abvil
 */
public class Gen <T>{
    
    T ob;
    
    Gen(T o){
        ob = o;
    }
    
    T getOb(){
        return ob;
    }
}


