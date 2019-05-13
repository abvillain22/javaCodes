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
public class OverloadDemo {
    void test()
    {
        System.out.println("No Parameters");
    }
    /*void test(int a)
    {
        System.out.println("a = "+a);
    }*/
    void test(int a,int b)
    {
        System.out.println("a = "+a+" b = "+b);
    }
    double tests(double a)
    {
        System.out.println("double a = "+a);
        return a*a;
    }
}
