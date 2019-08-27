/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genifdemo;

/**
 *
 * @author abvil
 */
public class GenIFDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Integer inums[] = {3,6,2,8,6};
        Character chs[] = {'b','r','p','w'};
        
        MyClass<Integer> iOb = new MyClass<>(inums){};
        MyClass<Character> cOb = new MyClass<>(chs){};
        
        System.out.println("Max value in inums = " + iOb.max());
        System.out.println("Min value in inums = " + iOb.min());
        
        System.out.println("Max value in chs = " + cOb.max());
        System.out.println("Min value in chs = " + cOb.min());
    }
    
}



