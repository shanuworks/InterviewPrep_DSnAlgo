package com.google.linkedlists;

public class Node {
    private int data;
    private Node next;

    //Constructor
    public Node( int data){
        this.data = data;
    }

    // setters and getters
    public void setData(int data) {
        this.data = data;
    }
    public int getData() {
        return data;
    }
    public void setNext(Node next) {
        this.next = next;
    }
    public Node getNext() {
        return next;
    }

    @Override
    public String toString() {
        return data+" " ;
    }
}
