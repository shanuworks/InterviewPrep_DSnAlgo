package com.google.heap;

import java.util.PriorityQueue;

public class ConnectRopes {
    public static void main( String args[]) {
        int arr[] = new int[]{1, 2, 3, 4, 5 };
        System.out.println(" Minimum cost of connecting ropes : "+minCost(arr, arr.length));
    }
    public static int minCost(int[] arr, int n ) {

        PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();
        for( int i = 0 ; i< n ; i++) {
            pQueue.add(arr[i]);
        }
        int minCost = 0;
        while(pQueue.size() >= 2 ) {
            int currentCost = pQueue.poll() + pQueue.poll();
            minCost = minCost + currentCost;
            if( pQueue.size() > 0 )
                pQueue.add( currentCost);
        }
        return minCost;
    }
}
