package com.google.stacks;

import java.util.Stack;

public class ReverseStack {
    public static void main(String args[]) {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        System.out.println("Original Stack : "+stack);
        reverseStack(stack);
        System.out.println("Reversed Stack : "+ stack);
    }
    public static void reverseStack(Stack<Integer> stack) {
        if( stack.isEmpty())
            return;
        int item = stack.pop();
        reverseStack(stack);
        insertAtBottom(stack, item);
    }
    public static void insertAtBottom(Stack<Integer> stack, int  item) {
        if( stack.isEmpty())
            stack.push(item);
        else {
            int i = stack.pop();
            insertAtBottom(stack, item);
            stack.push(i);
        }
    }
}
