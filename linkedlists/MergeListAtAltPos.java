package com.google.linkedlists;

public class MergeListAtAltPos {
    public static void main(String args[]) {
        ListNode list1_head = new ListNode(1);
        list1_head.next = new ListNode(2);
        list1_head.next.next = new ListNode(3);
        //list1_head.next.next.next = new ListNode(13);
        //list1_head.next.next.next.next = new ListNode(11);

        ListNode list2_head = new ListNode(4);
        list2_head.next = new ListNode(5);
        list2_head.next.next = new ListNode(6);
        list2_head.next.next.next = new ListNode(7);
        list2_head.next.next.next.next = new ListNode(8);

        System.out.println("Before merging list 1 is : ");
        printList(list1_head);
        System.out.println("Before merging list 2 is : ");
        printList(list2_head);
        System.out.println("After merging lists are : ");
        list2_head = mergeListAtAltPos(list1_head, list2_head);
        System.out.println("List 1 : ");
        printList(list1_head);
        System.out.println("List 2 : ");
        printList(list2_head);
    }
    public static ListNode mergeListAtAltPos(ListNode list1_head, ListNode list2_head) {
        ListNode list1_current = list1_head;
        ListNode list2_current = list2_head;
        ListNode list1_next ;
        ListNode list2_next ;
        while( list1_current != null && list2_current != null) {
            list1_next = list1_current.next;
            list2_next = list2_current.next;

            list2_current.next = list1_next;
            list1_current.next = list2_current;

            list1_current = list1_next;
            list2_current = list2_next;
        }
        list2_head = list2_current;
        return list2_head;
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
