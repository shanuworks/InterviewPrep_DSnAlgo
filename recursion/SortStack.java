package com.google.recursion;

import java.util.Stack;
import java.util.Iterator;
public class SortStack {
    public static void main (String args[]) {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(8);
        stack.push(2);
        stack.push(5);
        stack.push(7);
        stack.push(1);

        System.out.print("Stack before sorting : ");
        Iterator<Integer> itr = stack.iterator();
        while(itr.hasNext()) {
            System.out.print(itr.next()+" ");
        }
        System.out.println("");
        sort(stack);
        System.out.print("Stack after sorting : ");
        itr = stack.iterator();
        while(itr.hasNext()) {
            System.out.print(itr.next()+" ");
        }
        System.out.print("Peek:"+stack.peek());

    }
    public static void sort(Stack<Integer> stack) {
        // Base condition
        if( stack.size() == 1 )
            return;
        // Hypothesis
        int temp = stack.pop();
        sort(stack);

// Induction
        insert(stack, temp);
    }
    public static void insert(Stack<Integer> stack, int temp){
        // Base condition
        if(  stack.size() == 0 || stack.peek() <= temp ) {
            stack.push(temp);
            return;
        }
        // Hypothesis
        int val = stack.pop();
        insert(stack, temp );

        // Induction
        stack.push(val);
    }
}
