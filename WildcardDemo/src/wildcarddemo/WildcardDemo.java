/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wildcarddemo;

/**
 *
 * @author abvil
 */
public class WildcardDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Integer inums[] = {1,2,3,4,5};
        Stats<Integer> iOb = new Stats<>(inums);
        double v = iOb.average();
        System.out.println("iOb average is = "+v);
        System.out.println();
        
        Double dnums[]={1.1,2.2,3.3,4.4,5.5};
        Stats<Double> dOb = new Stats<>(dnums);
        double w = dOb.average();
        System.out.println("dOb average is  = "+w);
        System.out.println();
        
        Float fnums[] = {1.0F,2.0F,3.0F,4.0F,5.0F};
        Stats<Float> fOb = new Stats<>(fnums);
        double z = fOb.average();
        System.out.println("fnums average is = "+z);
        System.out.println();
        
        System.out.println("average of inum & dnum are equal ? "+iOb.sameAvg(dOb));
        System.out.println("average of inum & fnum are equal ? "+iOb.sameAvg(dOb));
    }
    
}





