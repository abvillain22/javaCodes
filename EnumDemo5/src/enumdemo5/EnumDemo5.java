/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enumdemo5;

/**
 *
 * @author abvil
 */

enum Answers{
    NO,YES,MAYBE,LATER,SOON,NEVER
}

public class EnumDemo5 {

    /**
     * @param args the command line arguments
     */
    static void answer(Answers result){
        switch(result){
            case NO:
                System.out.println("NO");
                break;
            case YES:
                System.out.println("YES");
                break;
            case MAYBE:
                System.out.println("MAYBE");
                break;
            case LATER:
                System.out.println("LATER");
                break;
            case SOON:
                System.out.println("SOON");
                break;
            case NEVER:
                System.out.println("NEVER");
                break;
        }
    }
    
    public static void main(String[] args) {
        Question q = new Question();
        
        answer(q.ask());
        answer(q.ask());
        answer(q.ask());
        answer(q.ask());
    }
    
}


