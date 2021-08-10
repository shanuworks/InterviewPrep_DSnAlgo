package com.google.stacks;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedStack {
    private LinkedList<Integer> stack;

    public LinkedStack() {
        stack = new LinkedList<Integer>();
    }
    public int size() {
        return stack.size();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public void push(int data){
        stack.push(data);
    }

    public Integer pop() {
        return stack.pop();
    }

    public Integer peek() {
        return stack.peek();
    }

    public void printStack() {
        ListIterator<Integer> list = stack.listIterator();
        while(list.hasNext()) {
            System.out.println( list.next());
        }
    }
}
