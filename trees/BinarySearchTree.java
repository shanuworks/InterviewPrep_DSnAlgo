package com.google.trees;

public class BinarySearchTree {
    private BSTNode root;

    // Insert Node
    public void insert( int value) {
        if( root == null)
            root = new BSTNode( value);
        else
            root.insert(value);
    }

    public void delete( int value) {
        root = delete(root, value);
    }
    private BSTNode delete(BSTNode subTreeRoot, int value) {
        if( subTreeRoot == null)
            return subTreeRoot;
        if( value < subTreeRoot.getData()) {
            subTreeRoot.setLeftChild(delete(subTreeRoot.getLeftChild(),value));
        } else if( value > subTreeRoot.getData()) {
            subTreeRoot.setRightChild(delete(subTreeRoot.getRightChild(), value));
        } else {
            // delete for case 1 and case 2
            if(subTreeRoot.getLeftChild() == null)
                return subTreeRoot.getRightChild();
            else if(subTreeRoot.getRightChild() == null)
                return subTreeRoot.getLeftChild();

// for case 3 - for 2 children we choose finding min in right subtree
// replace the value in the subtree root node with the min element from the right subtree
            subTreeRoot.setData(subTreeRoot.getRightChild().getMin());
// Delete the node that has smallest value in the right sub tree
            subTreeRoot.setRightChild(delete(subTreeRoot.getRightChild(),subTreeRoot.getData()));
        }
        return subTreeRoot;
    }



    // Get Node
    public BSTNode get(int value) {
        if( root != null)
            return root.get(value);
        return null;
    }

    // Get Min
    public int getMin() {
        if( root == null )
            return Integer.MIN_VALUE;
        else
            return root.getMin();
    }

    // Get Max
    public int getMax() {
        if( root == null )
            return Integer.MAX_VALUE;
        else
            return root.getMax();
    }

    //Traverse In Order
    public void traverseInOrder() {
        if(root != null)
            root.traverseInOrder();
    }

    //Traverse Pre Order
    public void traversePreOrder() {
        if(root != null)
            root.traversePreOrder();
    }

    // In order Tree Traversal without recursion
    public void inOrderTreeTraverse() {
        if(root != null) {
            root.inOrderTreeTraverse();
        }
    }


}
