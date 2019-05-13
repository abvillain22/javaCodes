/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packagedemo;
import p1.*;

/**
 *
 * @author abvil
 */
public class PackageDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Protection obj1 = new Protection();
        Derived obj2 = new Derived();
        SamePackage obj3 = new SamePackage();
    }
    
}
