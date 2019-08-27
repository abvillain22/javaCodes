/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brread;

import java.io.*;

/**
 *
 * @author abvil
 */
public class BRRead {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char c=0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Enter Characters, 'q' to quit");
        
        do{
            try{
                c = (char)br.read();
                System.out.println(c);
            }catch(IOException e){
                System.out.println(e);
            }
        }while(c!='q');
    }
    
}








