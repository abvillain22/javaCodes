/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package askme;

/**
 *
 * @author abvil
 */
public class AskMe implements SharedConstants {

    /**
     * @param args the command line arguments
     */
    
    static void answer(int result){
        switch(result){
            case NO:
                System.out.println("No");
                break;
            case YES:
                System.out.println("Yes");
                break;
            case MAYBE:
                System.out.println("Maybe");
                break;
            case LATER:
                System.out.println("Later");
                break;
            case SOON:
                System.out.println("Soon");
                break;
            case NEVER:
                System.out.println("Never");
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
