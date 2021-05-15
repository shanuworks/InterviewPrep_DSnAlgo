package com.google.graph;

import java.util.Queue;
import java.util.List;
import java.util.LinkedList;
import java.util.ArrayList;

public class LevelOfNode {
    public static void main(String args[]) {
        int vCount = 8;
        List<List<Integer>> adjacencyList = new ArrayList<List<Integer>>();

        for(int i =0; i<=vCount; i++)
            adjacencyList.add(new ArrayList<Integer>());

        adjacencyList.get(0).add(1);
        adjacencyList.get(0).add(1);

        adjacencyList.get(0).add(1);
        adjacencyList.get(0).add(2);
        adjacencyList.get(1).add(3);
        adjacencyList.get(1).add(4);
        adjacencyList.get(1).add(5);
        adjacencyList.get(2).add(5);
        adjacencyList.get(2).add(6);
        adjacencyList.get(6).add(7);

        printLevels(adjacencyList, vCount, 0);
    }
    public static void printLevels(List<List<Integer>> adjacencyList, int vCount, int vertex){
        int level[] = new int[vCount];
        boolean visited[] = new boolean[vCount];
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(vertex);
        level[vertex] = 0;
        visited[vertex] = true;
        while( queue.size() > 0) {
            vertex = queue.remove();
            for( int i=0; i< adjacencyList.get(vertex).size() ; i++) {
                int adjacentVertex = adjacencyList.get(vertex).get(i);
                if(!visited[adjacentVertex]) {
                    queue.add(adjacentVertex);
                    level[adjacentVertex] = level[vertex] + 1;
                    visited[adjacentVertex] = true;

                }
            }

        }
        // display all nodes and their levels
        System.out.println( "Nodes  Level");
        for (int i = 0; i < vCount; i++)
            System.out.println(" " + i +" --> " + level[i] );


    }
}
