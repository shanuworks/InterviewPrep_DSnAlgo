package com.google.linkedlists;

public class ReverseInGroupsRecursive {
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
        if( head == null)
            return null;

        ListNode current = head;
        ListNode prev = null;
        ListNode next = null;
        int counter = 0;
        while ( counter < k && current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            counter++;
        }
        if( next != null)
            head.next = reverseInGroups( next, k);
        return prev;
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
