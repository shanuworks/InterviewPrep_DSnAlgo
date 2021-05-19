package com.google.linkedlists;

class ListNode {
    int data;
    ListNode next;

    public ListNode(int data) {
        this.data = data;
    }
}

public class SumOfNodes {
    public static void main(String args[]) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(0);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next.next= new ListNode(0);
        head.next.next.next.next.next.next.next = new ListNode(3);
        head.next.next.next.next.next.next.next.next= new ListNode(2);
        head.next.next.next.next.next.next.next.next.next = new ListNode(0);

        inPlaceStore(head);
    }
    public static void inPlaceStore(ListNode head) {
        if( head != null && head.data == 0)
            head = head.next;
        ListNode current = head;
        ListNode res = head;
        int sum = 0;
        while( current != null ) {
            if( current.data != 0) {
                sum = sum + current.data;
                current = current.next;
            } else {
                res.data = sum;
                res.next = current.next;
                current = current.next;
                res = current;
                sum = 0;
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
