/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursion;

/**
 *
 * @author abvil
 */
public class Fact {
    int facto(int i){
        if(i==1){ 
        return 1;
        }
        return facto(i-1)*i;
    }
}
