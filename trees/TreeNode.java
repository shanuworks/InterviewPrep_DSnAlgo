package com.google.trees;

public class TreeNode{
    private int data;
    private TreeNode leftChild;
    private TreeNode rightChild;

    // setters and getters
    public void setData( int data){
        this.data = data;
    }
    public int getData() {
        return data;
    }
    public void setLeftChild(TreeNode leftChild) {
        this.leftChild = leftChild;
    }
    public TreeNode getLeftChild() {
        return leftChild;
    }
    public void setRightChild(TreeNode rightChild) {
        this.rightChild = rightChild;
    }
    public TreeNode getRightChild() {
        return rightChild;
    }

    // toString()
    @Override
    public String toString() {
        return "Data : "+ data ;
    }

}
