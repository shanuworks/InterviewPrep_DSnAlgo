package com.google.linkedlists;

import java.util.LinkedList;

public class ReverseList {
    public static void main(String args[]) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);
        head.next.next.next.next.next.next= new ListNode(7);
        head.next.next.next.next.next.next.next = new ListNode(8);
        head.next.next.next.next.next.next.next.next= new ListNode(9);
        head.next.next.next.next.next.next.next.next.next = new ListNode(10);

        System.out.println("Before Reversing list is : ");
        printList(head);
        System.out.println("After Reversing list is : ");
        head = reverseList(head);
        printList(head);
    }
    public static ListNode reverseList(ListNode head) {
        LinkedList<ListNode> stack = new LinkedList<ListNode>();
        ListNode current = head;
        while( current != null) {
            stack.push(current);
            current = current.next;
        }
        head = stack.peek();
        while( !stack.isEmpty()) {
            current = stack.pop();
            current.next = stack.peek();
        }
        return head;
    }
    public static void printList(ListNode head) {
        ListNode current = head;
        while(current != null ) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.print("null");
        System.out.println("");
    }
}
