/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enumdemo3;

/**
 *
 * @author abvil
 */

enum Apple{
    Jonathan(10),GoldenDel(9),RedDel(12),Winesap(15),Cortland(8);
    private final int price;
    
    Apple(int p){
        price = p;
    }
    
    int getPrice(){
        return price;
    }
}

public class EnumDemo3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Apple ap;
        System.out.println("Winesap costs = "+Apple.Winesap.getPrice()+" cents");
        System.out.println("All apple prices");
        
        for(Apple a : Apple.values()){
            System.out.println(a+" costs = "+a.getPrice()+" cents");
        }
    }  
}



