/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package showfile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author abvil
 */
public class ShowFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i;
        FileInputStream fin = null;
        final String FILE_NAME = "ShowFile.java";
        
        try{
            fin = new FileInputStream(FILE_NAME);
        }catch(FileNotFoundException e){
            System.out.println(e);
        }
        
        try{
            do{
                i=fin.read();
                if(i==-1){
                    System.out.println((char)i);
                }
            }while(i!=-1);
        }catch(IOException e){
            System.out.println("Error Reading File");
        }
        
        try{
            fin.close();
        }catch(IOException e){
            System.out.println(e);
        }
    }
    
}



