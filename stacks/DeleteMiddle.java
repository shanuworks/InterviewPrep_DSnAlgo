package com.google.stacks;

import java.util.Stack;

public class DeleteMiddle {
    public static void main(String args[]) {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(30);
        stack.push(-5);
        stack.push(18);
        stack.push(14);
        stack.push(-3);
        System.out.println("Original Stack : "+stack);
        deleteMiddle(stack, 1);
        System.out.println("Stack after deleting  middle element : "+ stack);
    }
    public static int deleteMiddle(Stack<Integer> stack, int count) {
        int mid ;
        if( stack.isEmpty()) {
            count = count -1;
            mid = count/2 + 1;
            return mid;
        }
        int item = stack.pop();
        mid = deleteMiddle(stack, count+1);
        if( mid != count)
            stack.push(item);
        return mid;
    }
}

