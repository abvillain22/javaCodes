/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tinyedit;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author abvil
 */
public class TinyEdit {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args)throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str[] = new String[100];
        final String STOP="stop";
        
        System.out.println("Enter lines of text");
        System.out.println("Enter stop to quit");
        
        for(int i=0; i<100; ++i){
            str[i]=br.readLine();
            if(str[i].equals(STOP)) break;
        }
        
        for(int i=0; i<100; ++i){
            if(str[i].equals(STOP)) break;
            System.out.println(str[i]);
        }
    }
    
}





