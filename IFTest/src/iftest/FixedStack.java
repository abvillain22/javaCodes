/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iftest;

/**
 *
 * @author abvil
 */
public class FixedStack implements IntStack{
    private final int stck[];
    private int tos;
    
    FixedStack(int size){
        stck = new int[size];
        tos=-1;
    }
    
    @Override
    public void push(int item){
        if(tos==stck.length-1){
            System.out.println("stack is full");
        }
        else{
            stck[++tos]=item;
        }
        
    }
    @Override
    public int pop(){
        if(tos<0){
            System.out.println("Stack underflow");
            return 0;
        }
        else{
            return stck[tos--];
        }
    }
}
