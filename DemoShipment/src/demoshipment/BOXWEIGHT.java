/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoshipment;

/**
 *
 * @author abvil
 */
public class BOXWEIGHT extends BOX{
    double weight;
    BOXWEIGHT(){
        super();
        weight=-1;
    }
    
    BOXWEIGHT(double w,double h,double d,double m){
        super(w,h,d);
        weight=m;
    }
    
    BOXWEIGHT(BOXWEIGHT ob){
        super(ob);
        weight=ob.weight;
    }
    
    BOXWEIGHT(double len,double m){
        super(len);
        weight=m;
    }
}
