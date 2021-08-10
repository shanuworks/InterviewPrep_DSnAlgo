package com.google.stacks;

import java.util.EmptyStackException;

public class ArrayStack {
    private Integer[] stack;
    private int top;

    public ArrayStack(int capacity) {
        stack = new Integer[capacity];
        top = 0;
    }

    public int size() {
        return top;
    }

    public boolean isEmpty() {
        return top == 0;
    }

    public boolean isFull() {
        return top == stack.length;
    }

    public void push(int data) {
        if(isFull()) {
            System.out.println("Stack is full - Resizing in progress...");
            Integer[] newArray = new Integer[2 * stack.length];
            System.arraycopy(stack, 0,newArray,0,stack.length);
            stack = newArray;
        }
        stack[top++] = data;
    }

    public int pop() {
        if(isEmpty()) {
            System.out.println("Nothing to pop...");
            throw new EmptyStackException();
        }
        int poppedItem = stack[--top];
        stack[top] = null;
        return poppedItem;
    }

    public int peek() {
        if(isEmpty()) {
            System.out.println("Nothing to pop...");
            throw new EmptyStackException();
        }
        return stack[top-1];
    }

    public void printStack() {
        for(int i = top-1; i >= 0; i--){
            System.out.println(stack[i]);
        }
    }

}
