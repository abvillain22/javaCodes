/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overload;

/**
 *
 * @author abvil
 */
public class Overload {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args)
    throws java.io.IOException{
        OverloadDemo ob=new OverloadDemo();
        double result,x;
        ob.test();
        //ob.test(10);
        ob.test(10,20);
        System.out.print("a = ");
        x=(double)System.in.read();
        result=ob.tests(x);
        System.out.println("result = "+result);
    }
    
}
