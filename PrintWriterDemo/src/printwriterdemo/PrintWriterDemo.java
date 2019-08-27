/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package printwriterdemo;

import java.io.PrintWriter;

/**
 *
 * @author abvil
 */
public class PrintWriterDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PrintWriter pw = new PrintWriter(System.out,true);
        
        pw.println("this is String");
        
        int i=-7;
        pw.println(i);
        
        double d =  4.56e-7;
        pw.println(d);
    }
    
}


