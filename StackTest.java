package com.ds;

public class StackTest {
    public static void main(String[] args) {
    ArrayStack stack=new ArrayStack(10);
    stack.push(new Customer(1,"Kishor","kishu"));
    stack.push(new Customer(2,"Jason","Roy"));
    stack.push(new Customer(3,"Joe","Root"));
    stack.print();
    System.out.println("Popping the top : "+ stack.pop());

    System.out.println("Peeking the top : "+stack.peek());

    stack.print();
    }
}
