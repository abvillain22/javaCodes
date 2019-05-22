/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacedemo;

/**
 *
 * @author abvil
 */
public class AnotherClient implements Callback {
    @Override
    public void callback(int p){
        System.out.println("Another version of callback");
        System.out.println("p squared is "+(p*p));
    }
    
}
