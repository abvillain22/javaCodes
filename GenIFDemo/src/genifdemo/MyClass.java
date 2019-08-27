/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genifdemo;

/**
 *
 * @author abvil
 * @param <T>
 */
public abstract class MyClass<T extends Comparable<T>> implements MinMax<T> {
    T[] vals;
    
    MyClass(T[] o){
        vals =o;
    }
    
    /**
     *
     * @return
     */
    @Override
    public T min(){
        T v = vals[0];
        
        for (T val : vals) {
            if (val.compareTo(v) < 0) {
                v = val;
            }
        }
        
        return v;
    }
    
    @Override
    public T max(){
        T v = vals[0];
        
        for(T val : vals){
            if(val.compareTo(v)>0){
                v = val;
            }
        }
        
        return v;
    }
}


