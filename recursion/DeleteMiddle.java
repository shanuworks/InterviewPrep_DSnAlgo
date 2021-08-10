package com.google.recursion;

import java.util.Stack;
import java.util.Iterator;

public class DeleteMiddle {
    public static void main (String args[]) {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(8);
        stack.push(2);
        stack.push(5);
        stack.push(7);
        stack.push(1);

        System.out.print("Stack before deleting middle element : ");
        Iterator<Integer> itr = stack.iterator();
        while(itr.hasNext()) {
            System.out.print(itr.next()+" ");
        }
        System.out.println("");
        deleteMiddle(stack, stack.size()/2+1);
        System.out.print("Stack after deleting middle element : ");
        itr = stack.iterator();
        while(itr.hasNext()) {
            System.out.print(itr.next()+" ");
        }

    }
    public static void deleteMiddle(Stack<Integer> stack, int k) {
        // Base condition
        if( k == 1 ) {
            stack.pop();
            return;
        }
        // Hypothesis
        int temp = stack.pop();
        deleteMiddle(stack, k-1);

// Induction
        stack.push(temp);
    }
}
