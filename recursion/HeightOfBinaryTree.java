package com.google.recursion;

public class HeightOfBinaryTree {
    static class Node {
        private int data;
        private Node left;
        private Node right;

        Node(int data) {
            this.data = data;
        }
    }
    public static void main (String args[]) {
        Node root = new Node(9);
        root.left = new Node(4);
        root.right = new Node(20);
        root.left.left = new Node(1);
        root.left.right = new Node(6);
        root.left.left.left = new Node(8);
        root.right.left = new Node(15);
        root.right.right = new Node(170);

        System.out.println("Height of the tree : "+ findHeight(root));
    }
    public static int findHeight(Node root) {
        // Base condition
        if( root == null )
            return 0;

// Hypothesis
        int lheight = findHeight( root.left );
        int rheight = findHeight( root.right );

        // Induction
        return 1+ Math.max(lheight,rheight) ;
    }
}

