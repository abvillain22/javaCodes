/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assertdemo;

/**
 *
 * @author abvil
 */
public class AssertDemo {
    
    static int val =3;
    
    static int getnum(){
        return val--;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n;
        
        for(int i=0; i<10; i++){
            n=getnum();
            assert n>0;
            System.out.println("n is "+n);
        }
    }
    
}





