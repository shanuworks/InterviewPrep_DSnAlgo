package com.google.linkedlists;

public class RemoveDuplicates {
    public static void main(String args[]) {
        ListNode head = new ListNode(11);
        head.next = new ListNode(11);
        head.next.next = new ListNode(11);
        head.next.next.next = new ListNode(21);
        head.next.next.next.next = new ListNode(43);
        head.next.next.next.next.next = new ListNode(43);
        head.next.next.next.next.next.next= new ListNode(60);
        head.next.next.next.next.next.next.next = new ListNode(60);


        removeDuplicates(head);
    }
    public static void removeDuplicates(ListNode head) {
        ListNode current = head;
        ListNode res = head;
        while( current != null ) {
            if( current.next != null && current.data == current.next.data) {
                current = current.next;
            } else {
                res.next = current.next;
                current = current.next;
                res = current;
            }
        }
        printList(head);
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
