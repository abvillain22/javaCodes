/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commandline;

/**
 *
 * @author abvil
 */
public class CommandLine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for(int i=0; i<args.length; ++i){
            System.out.println("args["+i+"] = "+args[i]);
        }
    }
    
}
