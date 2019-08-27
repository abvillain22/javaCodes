/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hierdemo;

/**
 *
 * @author abvil
 * @param <T>
 * @param <V>
 */
public class Gen2<T,V> extends Gen<T> {
    V ob2;
    
    Gen2(T o, V o2){
        super(o);
        
        ob2 = o2;
    }
    
    V getOb2(){
        return ob2;
    }
}


