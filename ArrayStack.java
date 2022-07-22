package com.ds;

import java.util.EmptyStackException;

public class ArrayStack {
    private Customer[] stack;
    private int top;

    public ArrayStack(int capacity){
        stack=new Customer[capacity];
    }
    public void push(Customer customer){
        if(top==stack.length){
            //Need to resize the backing array
            Customer[] newArray=new Customer[2*stack.length];
            System.arraycopy(stack,0,newArray,0,stack.length);
            stack=newArray;
        }
        stack[top++]=customer;
    }

    public Customer pop(){
        if(isEmpty()){
            throw new EmptyStackException();
        }

            Customer customer=stack[--top];
            stack[top]=null;
            return customer;

    }

    public Customer peek(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return stack[top-1];
    }
    private boolean isEmpty() {
        return top==0;
    }

    private int size(){
        return top;
    }

    public void print(){
        for (int i=top-1;i>=0;i--){
            System.out.println(stack[i]);
        }
    }
}
