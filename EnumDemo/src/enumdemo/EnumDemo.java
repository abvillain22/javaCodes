/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enumdemo;

/**
 *
 * @author abvil
 */

enum Apple{
    Jonathan, GoldenDel, RedDel, Winesap, Cortland
}

public class EnumDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Apple ap;
        ap = Apple.RedDel;
        
        System.out.println("Value of ap : "+ap);
        System.out.println();
        
        ap = Apple.GoldenDel;
        
        if(ap==Apple.GoldenDel){
            System.out.println("ap contain GoldenDel");
            System.out.println();
        }
        
        switch(ap){
            case Jonathan:
                System.out.println("Jonathan is red");
                break;
            case GoldenDel:
                System.out.println("GoldenDel Delicious is yellow");
                break;
            case RedDel:
                System.out.println("Red Delicious is red");
                break;
            case Winesap:
                System.out.println("Winesap is red");
                break;
            case Cortland:
                System.out.println("Cortland is red");
                break;
        }
    }
    
}










