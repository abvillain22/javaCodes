/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teststack2;

/**
 *
 * @author abvil
 */
public class Stack {
    private final int stck[];
    private int tos;
    Stack(int size){
        stck=new int[10];
        tos =-1;
    }
    void push(int item)
    {
        if(tos==stck.length-1)
        {
            System.out.println("Stack is full");
        }
        else{
            stck[++tos]=item;
        }
    }
    int pop(){
        if(tos<0){
            System.out.println("Stack Underflow");
            return 0;
        }
        return stck[tos--];
    }
}
