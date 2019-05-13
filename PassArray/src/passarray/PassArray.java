/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passarray;

/**
 *
 * @author abvil
 */
public class PassArray {

    /**
     * @param args the command line arguments
     */
    
    static void vaTest(int v[]){
        System.out.print("number of args : "+v.length + " Contents : ");
        for(int x : v){
            System.out.print(x + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int n1[] =  {1};
        int n2[] = {1,2,3};
        int n3[]= {};
        vaTest(n1);
        vaTest(n2);
        vaTest(n3);
    }
    
}
