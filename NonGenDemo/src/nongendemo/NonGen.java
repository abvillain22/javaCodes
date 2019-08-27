/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nongendemo;

/**
 *
 * @author abvil
 */
public class NonGen {
    Object ob;
    
    NonGen(Object o){
        ob=o;
    }
    
    Object getOb(){
        return ob;
    }
    
    void ShowType(){
        System.out.println("Type of ob is = "+ob.getClass().getName());
    }
}


