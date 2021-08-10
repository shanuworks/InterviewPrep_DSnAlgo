package com.google.stacks;

public class LinkedStackOperations {
    public static void main(String args[]) {
        LinkedStack stack = new LinkedStack();
        System.out.println("Initial size of stack - "+stack.size());
        System.out.println("Stack is Empty - "+stack.isEmpty());

        stack.push(18);
        stack.push(2);
        stack.push(9);

        System.out.println("Printing stack contents");
        System.out.println("Size of the stack - "+stack.size());
        stack.printStack();

        stack.push(1);
        System.out.println("Printing stack contents");
        System.out.println("Size of the stack - "+stack.size());
        stack.printStack();

        System.out.println("Stack peek - "+stack.peek());
        System.out.println("Printing stack contents");
        System.out.println("Size of the stack - "+stack.size());
        stack.printStack();

        System.out.println("Popped Element - "+stack.pop());
        System.out.println("Popped Element - "+stack.pop());

        System.out.println("Printing stack contents");
        System.out.println("Size of the stack - "+stack.size());
        stack.printStack();

    }
}
