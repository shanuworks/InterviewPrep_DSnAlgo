package com.google.stacks;

import java.util.Stack;

public class SortStack {
    public static void main(String args[]) {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(30);
        stack.push(-5);
        stack.push(18);
        stack.push(14);
        stack.push(-3);
        System.out.println("Original Stack : "+stack);
        sortStack(stack);
        System.out.println("Sorted Stack : "+ stack);
    }
    public static void sortStack(Stack<Integer> stack) {
        if( stack.isEmpty())
            return;
        int item = stack.pop();
        sortStack(stack);
        insertSorted(stack, item);
    }
    public static void insertSorted(Stack<Integer> stack, int  item) {
        if( stack.isEmpty() || item > stack.peek() )
            stack.push(item);
        else {
            int i = stack.pop();
            insertSorted(stack, item);
            stack.push(i);
        }
    }
}
