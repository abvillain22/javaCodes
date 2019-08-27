/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brreadlines;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author abvil
 */
public class BRReadLines {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String str=null;
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Enter lines of Text");
        System.out.println("Enter stop to quit");
        
        do{
            try{
                str = br.readLine();
                System.out.println(str);
            }catch(IOException e){
                System.out.println(e);
            }
        }while(!"stop".equals(str));
    }
    
}


