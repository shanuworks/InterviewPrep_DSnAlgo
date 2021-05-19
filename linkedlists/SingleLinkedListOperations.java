package com.google.linkedlists;

public class SingleLinkedListOperations {
    public static void main(String args[]) {
        SingleLinkedList linkedlist = new SingleLinkedList();

        System.out.println("Before Insertion-Linked List is empty - "+linkedlist.isEmpty());

        linkedlist.addToFront(15);
        linkedlist.addToFront(10);
        linkedlist.addToFront(5);
        linkedlist.addToEnd(20);
        linkedlist.addToEnd(25);
        linkedlist.addToEnd(30);

        System.out.println("After Insertion-Linked List is empty - "+linkedlist.isEmpty());
        System.out.println("Linked List size - "+linkedlist.getSize());
        linkedlist.printList();

        System.out.println("Removing the data from front");
        System.out.println(linkedlist.removeFromFront());
        System.out.println("After removing - Linked List size - "+linkedlist.getSize());
        linkedlist.printList();

        System.out.println("Removing the data from end");
        System.out.println(linkedlist.removeFromEnd());
        System.out.println("After removing - Linked List size - "+linkedlist.getSize());
        linkedlist.printList();

        linkedlist.addAtIndex(2, 90);
        System.out.println("After adding the data- Linked List size - "+linkedlist.getSize());
        linkedlist.printList();

        System.out.println("Removing the data from Index");
        System.out.println(linkedlist.removeFromIndex(2));
        System.out.println("After removing - Linked List size - "+linkedlist.getSize());
        linkedlist.printList();

        System.out.println("Reversing the linked list...");
        System.out.println("Before reversing - Linked List Head - "+linkedlist.getHead());
        System.out.println("Before reversing - Linked List Tail - "+linkedlist.getTail());
        linkedlist.reverse();
        System.out.println("After reversing - Linked List size - "+linkedlist.getSize());
        linkedlist.printList();
        System.out.println("After reversing - Linked List Head - "+linkedlist.getHead());
        System.out.println("After reversing - Linked List Tail - "+linkedlist.getTail());

        linkedlist.removeFromEnd();
        linkedlist.removeFromEnd();
        linkedlist.removeFromEnd();
        linkedlist.removeFromEnd();

        linkedlist.printList();

        System.out.println("Calling sorted insert method on various data...");

        linkedlist.insertSorted(67);
        linkedlist.printList();

        linkedlist.insertSorted(1);
        linkedlist.printList();

        linkedlist.insertSorted(-8);
        linkedlist.printList();

        linkedlist.insertSorted(-20);
        linkedlist.printList();

        linkedlist.insertSorted(100);
        linkedlist.printList();

        linkedlist.insertSorted(45);
        linkedlist.printList();

        System.out.println("After sorted insert - Linked List Head - "+linkedlist.getHead());
        System.out.println("After sorted insert - Linked List Tail - "+linkedlist.getTail());

    }
}


