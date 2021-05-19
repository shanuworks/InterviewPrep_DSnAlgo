package com.google.linkedlists;

import java.util.LinkedList;

public class AddOneToNumber {
    public static void main(String args[]) {
        ListNode head = new ListNode(9);
        head.next = new ListNode(9);
        head.next.next = new ListNode(9);
        head.next.next.next = new ListNode(9);
        head = addOne(head);
        printList(head);
    }
    public static ListNode addOne(ListNode head) {
        LinkedList<ListNode> stack = new LinkedList<ListNode>();
        ListNode current = head;
        while(current != null) {
            stack.push(current);
            current = current.next;
        }
        int carry = 1, sum;
        while( !stack.isEmpty()) {
            sum = carry + stack.peek().data ;
            carry = (sum >= 10) ? 1: 0;
            sum = sum % 10;
            stack.pop().data  = sum ;
        }
        if( carry > 0) {
            ListNode newNode = new ListNode(1);
            newNode.next = head;
            head = newNode ;
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
    }
}

