package com.google.trees;

public class BSTOperations {
    public static void main( String args[]) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(25);
        tree.insert(20);
        tree.insert(15);
        tree.insert(27);
        tree.insert(30);
        tree.insert(29);
        tree.insert(26);
        tree.insert(22);
        tree.insert(32);
        tree.insert(17);

        tree.traverseInOrder();
        System.out.println();
        System.out.println(tree.get(27));
        System.out.println(tree.get(17));
        System.out.println(tree.get(171));

        System.out.println("Minimum Value : " +tree.getMin());
        System.out.println("Maximum Value : " +tree.getMax());

        System.out.println("Deleting 17");
        tree.delete(17);

        System.out.println("In Order Traversal");
        tree.traverseInOrder();
        System.out.println();

        System.out.println("Pre Order Traversal");
        tree.traversePreOrder();
        System.out.println();

        // call inOrderTreeTraverse from BinaryTree class
        System.out.println("In order traversal without recursion");
        tree.inOrderTreeTraverse();

    }
}
