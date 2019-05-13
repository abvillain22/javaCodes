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
public class BOX {
    private double width, height,depth;
    
    BOX(BOX ob){
        width=ob.width;
        height=ob.height;
        depth=ob.depth;
    }
    
    BOX(double w,double h,double d){
        width=w;
        height=h;
        depth=d;
    }
    
    BOX(){
        width=height=depth=-1;
    }
    
    BOX(double len){
        width=height=depth=len;
    }
    
    double volume(){
        return width*height*depth;
    }
}
