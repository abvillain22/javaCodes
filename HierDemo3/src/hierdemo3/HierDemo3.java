/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hierdemo3;

/**
 *
 * @author abvil
 */
public class HierDemo3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Gen<Integer> iOb = new Gen<>(88);
        
        Gen2<Integer> iOb2 = new Gen2<>(99);
        
        Gen2<String> strOb = new Gen2<>("Generics Test");
        
        if(iOb2 instanceof Gen2<?>){
            System.out.println("iOb2 is instance of Gen2");
        }
        
        if(iOb2 instanceof Gen<?>){
            System.out.println("iOb2 is instance of Gen");
        }
        
        System.out.println();
        
        if(strOb instanceof Gen2<?>){
            System.out.println("strOb is instance of Gen2");
        }
        
        if(strOb instanceof Gen<?>){
            System.out.println("strOb is instance of Gen");
        }
        
        System.out.println();
        
        if(iOb instanceof Gen<?>){
            System.out.println("iOb is instance of Gen");
        }
        
        if(iOb instanceof Gen2<?>){
            System.out.println("iOb is instance of Gen2");
        }
        
       /*
        * the following code can't be complied
        *because generic type info does not exist at run time
        */
       
//        if(iOb2 instanceof Gen2<Integer>){
//            System.out.println("iOb2 is instance of Gen2");
//        }
    }   
}