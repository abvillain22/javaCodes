/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enumdemo4;

/**
 *
 * @author abvil
 * 
 **/

enum Apple{
    Jonathan(10),GoldenDen(9),RedDel,Winesap(15),Cortland(8);
    int price;
    Apple(int p){
        price = p;
    }
    
    Apple(){
        price = -1;
    }
    
    int getPrice(){
        return price;
    }
}

public class EnumDemo4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        for(Apple ap:Apple.values()){
            System.out.println(ap + " costs "+ap.getPrice()+" cents");
        }
    }
    
}






