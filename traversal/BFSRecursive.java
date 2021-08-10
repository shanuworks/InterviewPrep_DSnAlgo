package com.google.traversal;

import java.util.List;
import java.util.Queue;
import java.util.LinkedList;
import java.util.ArrayList;

public class BFSRecursive {
    public static void main(String args[]) {
        Node root = new Node(9);
        root.left = new Node(4);
        root.right = new Node(20);
        root.left.left = new Node(1);
        root.left.right = new Node(6);
        root.right.left = new Node(15);
        root.right.right = new Node(170);

        List<Integer> list = new ArrayList<Integer>();
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);
        list = bfsRecursive(queue, list);
        for( int i : list)
            System.out.print( i + " ");
    }
    public static List bfsRecursive(Queue<Node> queue, List<Integer> list ) {
        if( queue.size() <= 0 )
            return list;
        Node currentNode = queue.remove();
        list.add(currentNode.data);
        if( currentNode.left != null)
            queue.add(currentNode.left);
        if( currentNode.right != null)
            queue.add(currentNode.right);

        return bfsRecursive(queue, list);
    }
}
