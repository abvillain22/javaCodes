/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package findareas;

/**
 *
 * @author abvil
 */
public class Rectangle extends Figure{
    Rectangle(double a,double b){
        super(a,b);
    }
    
    double area(){
        System.out.println("Indside Area of Rectangle");
        return dim1*dim2;
    }
}
