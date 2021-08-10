package com.google.trees;

public class ConstructBinaryTree {
    public static void main(String args[]) {
        int preOrder[] = new int[]{1,2,4,5,3,6};
        int inOrder[] = new int[]{4,2,5,1,3,6};

        BinaryTree tree = new BinaryTree();
        tree = construct(tree, preOrder, inOrder,0);

        System.out.println("Level Order Traversal of the constructed tree is :");
        //tree.levelOrderTraversal();

    }
    public static BinaryTree construct(BinaryTree tree, int preOrder[], int inOrder[], int start) {
        if(preOrder.length==0 || inOrder.length == 0 || preOrder.length != inOrder.length)
            return tree;
        //tree.insert(preOrder[start]);
        return tree;
    }
}
