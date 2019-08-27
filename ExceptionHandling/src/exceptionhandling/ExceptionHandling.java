/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionhandling;

/**
 *
 * @author abvil
 */
public class ExceptionHandling {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           int d,a;
           try{
               d=0;
               a=12/d;
               System.out.println("a = "+a);
           }
           catch(ArithmeticException e){
               System.out.println("Exception : "+e);
           }
    }
    
}
