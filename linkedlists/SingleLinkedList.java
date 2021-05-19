package com.google.linkedlists;

public class SingleLinkedList {
    private Node head;
    private Node tail;
    private int size = 0;

    //prepend operation
    public void addToFront(int data) {
        Node newNode = new Node(data);
        newNode.setNext(head);
        head = newNode;
        size++;
        if( tail == null) {
            tail = head;
        }
    }

    //append operation
    public void addToEnd(int data) {
        Node newNode = new Node(data);
        if( tail == null ) {
            tail = newNode ;
            head = tail;
        } else{
            tail.setNext(newNode);
            tail = newNode;
        }
        size++;
    }

    //insert at index
    public void addAtIndex(int index, int data) {
        if( index < 0 )
            return;
        else if( index == 0)
            addToFront(data);
        else if(index >= size)
            addToEnd(data);
        else {
            int counter = 0;
            Node current = head ;
            while ( counter != index-1 ) {
                current = current.getNext();
                counter++;
            }
            Node newNode = new Node(data);
            newNode.setNext(current.getNext());
            current.setNext(newNode);
            size++;
        }
    }

    //insert the elements in sorted order
    public void insertSorted(int data) {
        if(isEmpty() || head.getData() >= data ) {
            addToFront(data);
            return;
        }
        Node current = head;
        while( current != null && current.getNext() != null && current.getNext().getData() <= data ) {
            current = current.getNext();
        }
        if( current.getNext() == null) {
            addToEnd(data);
            return;
        }
        Node newNode = new Node(data);
        newNode.setNext(current.getNext());
        current.setNext(newNode);
        size++;
        current = null;

    }



    //removeFromFront
    public Node removeFromFront() {
        if(isEmpty())
            return null;
        Node removedNode = head;
        if( tail == head)
            tail = tail.getNext();
        head = head.getNext();
        size--;
        removedNode.setNext(null);
        return removedNode;
    }

    //removeFromEnd
    public Node removeFromEnd() {
        if(isEmpty())
            return null;
        Node removedNode = tail;
        if( head == tail ) {
            head = null;
            tail = null;
        } else {
            Node current = head;
            while(current.getNext() != tail)
                current = current.getNext();
            current.setNext(null);
            tail = current;
        }
        size--;
        removedNode.setNext(null);
        return removedNode;
    }

    // remove from index
    public Node removeFromIndex(int index) {
        if( index < 0 )
            return null;
        else if( index == 0)
            return removeFromFront();
        else if(index >= size)
            return removeFromEnd();
        else {
            int counter = 0;
            Node current = head;
            while( counter != index-1) {
                current = current.getNext();
                counter++;
            }
            Node removedNode = current.getNext();
            current.setNext(removedNode.getNext());
            size--;
            removedNode.setNext(null);
            return removedNode;
        }
    }

    // Reverse the linked list
    public void reverse() {
        if(isEmpty() || this.size == 1)
            return;
        else {
            Node current = head;
            Node prev = null;
            Node next = head;
            while( current != null ) {
                next = current.getNext();
                current.setNext(prev);
                prev = current;
                current = next;
            }
            tail = head;
            head = prev;
            prev = null;
        }
    }

    // get size
    public int getSize() {
        return size;
    }

    //get Head
    public Node getHead() {
        return head;
    }

    //get Tail
    public Node getTail() {
        return tail;
    }

    public boolean isEmpty() {
        return head==null;
    }

    public void printList() {
        System.out.println("Printing List of size : "+size);
        System.out.print("HEAD -> ");
        Node current = head;
        while(current != null ) {
            System.out.print(current.getData() + " -> ");
            current = current.getNext();
        }
        System.out.print("null");
        System.out.println();
    }

}
