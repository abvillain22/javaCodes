/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demosuper;

/**
 *
 * @author abvil
 */
public class BoxWeight extends Box{
    double weight;
    BoxWeight(BoxWeight ob){
        super(ob);
        weight = ob.weight;
    }
    
    BoxWeight(double w,double h,double d,double m){
        super(w,h,d);
        weight=m;
    }
    
    BoxWeight(){
        super();
        weight = -1;
    }
    
    BoxWeight(double len, double m){
        super(len);
        weight=m;
    }
}
