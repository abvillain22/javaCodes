/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boundsdemo;

/**
 *
 * @author abvil
 * @param <T>
 */
public class Stats<T extends Number> {
    T[] nums;
    
    Stats(T[] o){
        nums = o;
    }
    
    double average(){
        double sum=0.0;
        
        for (T num : nums) {
            sum += num.doubleValue();
        }
        
       return sum/nums.length;
    }
}


