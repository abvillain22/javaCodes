/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boxdemo;

/**
 *
 * @author abvil
 */
public class BoxDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Box mybox=new Box();
        mybox.d=10.0;
        mybox.h=10.0;
        mybox.w=10.0;
        double vol;
        vol=mybox.h*mybox.w*mybox.d;
        System.out.println("volume is = "+vol);
    }
    
}
