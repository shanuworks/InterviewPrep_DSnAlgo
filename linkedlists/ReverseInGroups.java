package com.google.linkedlists;

public class ReverseInGroups {
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

        int k = 3; // reverse every k nodes

        System.out.println("Before Reversing list is : ");
        printList(head);
        System.out.println("After Reversing list is : ");
        head = reverseInGroups(head, k);
        printList(head);
    }
    public static ListNode reverseInGroups(ListNode head, int k) {
        if( head == null || k <= 0)
            return head;
        ListNode current = head;
        ListNode prev = null;
        ListNode next = current;
        ListNode end = head;
        ListNode start = null;
        int counter = 1;
        while( current != null  && counter <= k ) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            if( counter == k || current == null ) {
                if( start == null)
                    start = prev ;
                if( prev != start) {
                    head.next = prev;
                    head = end;
                }
                end = current;
                counter = 0;
                prev = null;
            }
            counter++;

        }
        head = start;
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
