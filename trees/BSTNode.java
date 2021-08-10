package com.google.trees;

import java.util.Stack;

public class BSTNode {

    private int data;
    private BSTNode leftChild;
    private BSTNode rightChild;

    // constructor
    public BSTNode( int data) {
        this.data = data;
    }

    // insertion in binary search tree
    public void insert(int value) {
        if( value == data)
            return;
        if( value < data) {
            if( leftChild == null)
                leftChild = new BSTNode(value);
            else
                leftChild.insert(value);
        } else {
            if( rightChild == null )
                rightChild = new BSTNode(value);
            else
                rightChild.insert(value);
        }
    }


    // Get Node
    public BSTNode get( int value) {
        if( value == data)
            return this;
        if( value < data) {
            if(leftChild != null)
                return leftChild.get(value);
        } else {
            if(rightChild != null)
                return rightChild.get(value);
        }
        return null;
    }


    // Get Min
    public int getMin() {
        if(leftChild == null)
            return data;
        else
            return leftChild.getMin();
    }

    // Get Max
    public int getMax() {
        if(rightChild == null)
            return data;
        else
            return rightChild.getMax();
    }


    // in order Traversal
    public void traverseInOrder() {
        if( leftChild != null)
            leftChild.traverseInOrder();
        System.out.print( data +", ");
        if(rightChild != null)
            rightChild.traverseInOrder();
    }

    //pre order Traversal
    public void traversePreOrder() {
        System.out.print( data +", ");
        if( leftChild != null)
            leftChild.traversePreOrder();
        if(rightChild != null)
            rightChild.traversePreOrder();
    }

    // In order Tree Traversal without recursion
    public void inOrderTreeTraverse() {
        Stack<BSTNode> stack = new Stack<BSTNode>();

        BSTNode current = this ;
        while(current != null || stack.size() > 0) {
            while( current != null) {
                stack.push(current);
                current = current.leftChild;

            }
            current = stack.pop();
            System.out.print(current.data + " ");

            current = current.rightChild;
        }
        System.out.println();
    }

    // setters and getters
    public void setData( int data){
        this.data = data;
    }
    public int getData() {
        return data;
    }
    public void setLeftChild(BSTNode leftChild) {
        this.leftChild = leftChild;
    }
    public BSTNode getLeftChild() {
        return leftChild;
    }
    public void setRightChild(BSTNode rightChild) {
        this.rightChild = rightChild;
    }
    public BSTNode getRightChild() {
        return rightChild;
    }

    // toString()
    @Override
    public String toString() {
        return "Data : "+ data ;
    }
}
