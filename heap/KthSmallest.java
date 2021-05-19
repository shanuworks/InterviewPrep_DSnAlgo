package com.google.heap;

import java.util.PriorityQueue;
import java.util.Collections;

public class KthSmallest {
    public static void main( String args[]) {
        int arr[] = new int[]{7, 10, 4, 3, 20, 15};
        int k = 4;
        System.out.println(" Kth Smallest : "+findKthSmallest(arr, arr.length, k));
    }
    public static int findKthSmallest(int[] arr, int n , int k ) {
        PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>(k+1,Collections.reverseOrder());
        for( int i = 0 ; i< n ; i++) {
            pQueue.add(arr[i]);
            if(pQueue.size() > k )
                pQueue.remove();
        }
        return pQueue.peek();
    }
}
