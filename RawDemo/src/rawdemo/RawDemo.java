/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rawdemo;

/**
 *
 * @author abvil
 */
public class RawDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Gen<Integer> iOb = new Gen<>(88);
        Gen<String> strOb = new Gen<>("Generics Test");
        Gen raw = new Gen(98.5);
        
        double d = (Double)raw.getOb();
        System.out.println("value : "+d);
    }
    
}


