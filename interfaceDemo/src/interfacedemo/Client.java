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
public class Client implements Callback{
    @Override
    public void callback(int p){
        System.out.println("callback called with "+p);
    }
}
