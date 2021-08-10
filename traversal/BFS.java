package com.google.traversal;

import java.util.List;
import java.util.Queue;
import java.util.LinkedList;
import java.util.ArrayList;

public class BFS {
    public static void main(String args[]) {
        Node root = new Node(9);
        root.left = new Node(4);
        root.right = new Node(20);
        root.left.left = new Node(1);
        root.left.right = new Node(6);
        root.right.left = new Node(15);
        root.right.right = new Node(170);

        List<Integer> list = bfs(root);
        for( int i : list)
            System.out.print( i + " ");
    }
    public static List bfs(Node root) {
        List<Integer> list = new ArrayList<Integer>();
        if( root == null)
            return list;
        Node currentNode = root;
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(currentNode);
        while( queue.size() > 0) {
            currentNode = queue.remove();
            list.add(currentNode.data);
            if( currentNode.left != null)
                queue.add(currentNode.left);
            if( currentNode.right != null)
                queue.add(currentNode.right);
        }
        return list;
    }
}

