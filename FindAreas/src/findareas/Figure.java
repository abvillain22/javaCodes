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
public class Figure {
    double dim1,dim2;
    
    Figure(double a,double b){
        dim1 = a;
        dim2 = b;
    }
    
    double area(){
        System.out.println("Area of Figure is undefined");
        return 0;
    }
}
