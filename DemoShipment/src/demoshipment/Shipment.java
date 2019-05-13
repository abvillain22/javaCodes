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
public class Shipment extends BOXWEIGHT{
    double cost;
    
    Shipment(Shipment ob){
        super(ob);
        cost=ob.cost;
    
    }
    Shipment(double w,double h,double d,double m, double c){
        super(w,h,d,m);
        cost=c;
    
    }
    Shipment(){
        super();
        cost=-1;
    }
    
    Shipment(double len,double m,double c){
        super(len,m);
        cost=c;
    }
    
    
}
