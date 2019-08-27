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
import java.util.Random;

public class Question {
    Random rand = new Random();
    
    Answers ask(){
        int prob = (int)(100*rand.nextDouble());
        if(prob<15){
            return Answers.MAYBE;
        }
        else if(prob<30){
            return Answers.NO;
        }
        else if(prob<60){
            return Answers.YES;
        }
        else if(prob<75){
            return Answers.LATER;
        }
        else if(prob<98){
            return Answers.SOON;
        }
        else{
            return Answers.NEVER;
        }
    }
}


