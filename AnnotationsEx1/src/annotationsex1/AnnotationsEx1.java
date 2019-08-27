/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package annotationsex1;

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

public class AnnotationsEx1 {
    
    @MyAnno(str="Annotation Example",val=100)
    public static void myMeth(){
        AnnotationsEx1 ob = new AnnotationsEx1();
        
        try{
            Class<?> c = ob.getClass();
            
            Method m = c.getMethod("myMeth");
            
            MyAnno anno = m.getAnnotation(MyAnno.class);
            
            System.out.println(anno.str()+" "+anno.val());
        }catch(NoSuchMethodException e){
            System.out.println("Method not found");
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        myMeth();
    }
    
}


