/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package annoex3;

/**
 *
 * @author abvil
 */

import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno{
    String str();
    int val();
}

@Retention(RetentionPolicy.RUNTIME)
@interface What{
    String description();
}

@What(description = "An annotation test class")
@MyAnno(str = "Meta2", val = 99)

public class AnnoEx3 {

    /**
     * @param args the command line arguments
     */
    
    @What(description = "An annotation test method")
    @MyAnno(str="Testing", val = 100)
    public static void myMeth(){
        AnnoEx3 ob = new AnnoEx3();
        
        try{
            Annotation annos[] = ob.getClass().getAnnotations();
            
            System.out.println("All annoations for Meta2 : ");
            for(Annotation a : annos){
                System.out.println(a);
            }
            
            System.out.println();
            
            Method m = ob.getClass().getMethod("myMeth");
            annos = m.getAnnotations();
            
            System.out.println("All annotations for myMeth : ");
            for(Annotation a : annos){
                System.out.println(a);
            }
        }catch(NoSuchMethodException e){
            System.out.println("Method not found");
        }
    }
    
    public static void main(String[] args) {
        myMeth();
    }
    
}






