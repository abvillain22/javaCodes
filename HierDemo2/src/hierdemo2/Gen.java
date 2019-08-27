/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hierdemo2;

/**
 *
 * @author abvil
 * @param <T>
 */
public class Gen<T> extends NonGen {
    T ob;
    
    Gen(T o,int i) {
        super(i);
        ob = o;
    }
    
    T getOb(){
        return ob;
    }
            
}


