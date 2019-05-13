/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passob;

/**
 *
 * @author abvil
 */
public class PassOb {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Test o1=new Test(100,200);
        Test o2=new Test(100,200);
        Test o3=new Test(100,2);
        
        System.out.println("is o1==o2 ? "+o1.equalto(o2));
        System.out.println("is o1==o3 ? "+o1.equalto(o3));
    }
    
}
