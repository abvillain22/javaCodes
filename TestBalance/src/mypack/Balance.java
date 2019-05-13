/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypack;

/**
 *
 * @author abvil
 */
public class Balance {
    
    String name;
    double bal;
    
    public Balance(String n,double b){
        name=n;
        bal=b;
    }
    
    public void show(){
        System.out.println(name + " : $ " + bal);
    }
    
}
