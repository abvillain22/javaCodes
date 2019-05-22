/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifextend;

/**
 *
 * @author abvil
 */
public class MyClass implements B {
    
    MyClass(){}
    
    @Override
    public void meth1(){
        System.out.println("implements meth1()");
    }
    @Override
    public void meth2(){
        System.out.println("implement meth2()");
    }
    @Override
    public void meth3(){
        System.out.println("implement meth3()");
    }
}
