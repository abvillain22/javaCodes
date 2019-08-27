/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package valuesandvaluesoffun;

/**
 *
 * @author abvil
 */

enum Apple{
    Jonathan,GoldenDen,RedDel,Winesap,Cortland
}

public class ValuesAndValuesOfFun {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Apple ap;
        
        System.out.println("Here are all Apple Constants");
        
        Apple allapples[]=Apple.values();
        
        for(Apple a : allapples){
            System.out.println(a);
        }
        
        ap = Apple.valueOf("Winesap");
        System.out.println("ap contains : "+ap);
    }
    
}




