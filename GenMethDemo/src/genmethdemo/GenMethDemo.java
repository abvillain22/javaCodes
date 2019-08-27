/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genmethdemo;
/**
 *
 * @author abvil
 */
public class GenMethDemo {
    
    static <T extends Comparable<T>, V extends T> boolean isIn(T x, V[] y){
        for (V y1 : y) {
            if (x.equals(y1)) {
                return true;
            }
        }
        return false;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Integer nums[] = {1,2,3,4,5};
        
        System.out.println("2 is in nums ? " + isIn(2,nums));
        System.out.println("7 is in nums ? " + isIn(7,nums));
        
        String str[] = {"one","two","three","four"};
        
        System.out.println("one is in str ? " + isIn("one",str));
        System.out.println("seven is in str ? " + isIn("seven",str));
    }
    
}




