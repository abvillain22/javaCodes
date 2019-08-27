/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package annotationex2;

import java.lang.annotation.*;
import java.lang.reflect.*;
/**
 *
 * @author abvil
 */

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno{
    String str();
    int val();
}

public class AnnotationEx2 {

    @MyAnno(str = "Two Parameters", val = 19)
    public static void myMeth(String str, int i){

        AnnotationEx2 ob = new AnnotationEx2();

        try{
            Class<?> c = ob.getClass();

            Method m = c.getMethod("myMeth",String.class, int.class);

            MyAnno anno = m.getAnnotation(MyAnno.class);

            System.out.println(anno.str()+" "+anno.val());
        }catch(NoSuchMethodException e){
            System.out.println("Method Not Found");
        }
    }
        
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
       myMeth("test",10);
    }
    
}




