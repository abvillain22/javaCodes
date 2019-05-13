/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teststack2;

import static java.time.Clock.system;

/**
 *
 * @author abvil
 */
public class TestStack2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Stack mystack=new Stack(5);
        Stack mystack1=new Stack(8);
        for(int i=0; i<5; ++i){
            mystack.push(i);
        }
        for(int i=0; i<8; ++i){
            mystack1.push(i);
        }
        
        System.out.println("Stack in mystack");
        for(int i=0; i<5; ++i){
            System.out.println(mystack.pop());
        }
        System.out.println("Stack in mystack1");
        for(int i=0; i<8; ++i){
            System.out.println(mystack1.pop());
        }
    }
    
}
