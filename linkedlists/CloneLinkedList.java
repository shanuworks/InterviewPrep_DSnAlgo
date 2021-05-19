package com.google.linkedlists;

import java.util.Map;
import java.util.HashMap;

public class CloneLinkedList {
    static class Node {
        private int data;
        private Node next;
        private Node random;

        Node(int data) {
            this.data = data;
        }
    }
    public static void main(String args[]) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        head.random = head.next.next;
        head.next.random = head;
        head.next.next.random = head.next;
        head.next.next.next. random = head.next;

        System.out.println("Original Linked List before cloning:");
        printList(head);

        System.out.println("");

        Node clonedListHead = clone(head);

        System.out.println("Original Linked List after cloning:");
        printList(head);
        System.out.println("");

        System.out.println("Cloned Linked List :");
        printList(clonedListHead);

    }
    public static Node clone(Node head) {
        if( head == null)
            return head;
        Node current = head;
        Node clonedListHead = null;
        Node prev = null;
        Node orignalPrev = null;
        Map<Node,Node> originalMapping = new HashMap<Node,Node>();
        while( current != null ) {
            originalMapping.put(current, current.next);
            Node node = new Node( current.data);
            node.random = current;
            if(clonedListHead == null) {
                clonedListHead = node ;
                prev = clonedListHead;
            } else {
                prev.next = node ;
                prev = node;
            }
            orignalPrev = current;
            current = current.next;
            orignalPrev.next = node ;
        }
        current = clonedListHead;
        while( current != null) {
            current.random = current.random.random.next;
            current = current.next;
        }
        current = head;
        while( current != null && originalMapping.containsKey(current)) {
            current.next = originalMapping.get(current);
            current = current.next;
        }
        return clonedListHead;
    }

    public static void printList(Node head) {
        Node current = head;
        System.out.print("Next Pointers :");
        while(current != null ) {
            System.out.print("Address :"+current +" Data :"+current.data + " -> ");
            current = current.next;
        }
        System.out.print("null");
        System.out.print("    ");
        System.out.print("Random Pointers :");
        current = head;
        while( current != null) {
            System.out.print("Address :"+current +" Data : "+current.data + " -> " + "Address :"+current.random +" Data:"+current.random.data +"  ");
            current = current.next;
        }
    }

}
