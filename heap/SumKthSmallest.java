package com.google.heap;

import java.util.PriorityQueue;
import java.util.Collections;

public class SumKthSmallest {
    public static void main( String args[]) {
        int arr[] = new int[]{7, 10, 4, 3, 20, 15, 35};
        int k1 = 3;
        int k2 = 7;
        if( k1 > k2 ) {
            int temp = k1;
            k1 = k2 ;
            k2 = temp;
        }
        System.out.println(" Sum : "+findSum(arr, arr.length, k1, k2));
    }
    public static int findSum(int[] arr, int n , int k1, int k2 ) {
        PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>(k2+1, Collections.reverseOrder());
        for( int i = 0 ; i< n ; i++) {
            pQueue.add(arr[i]);
            if(pQueue.size() > k2 )
                pQueue.remove();
        }
        pQueue.poll();
        int sum = 0;
        while( pQueue.size() > 0 && pQueue.size() != k1 ) {
            sum = sum + pQueue.poll();
        }
        return sum;
    }
}
