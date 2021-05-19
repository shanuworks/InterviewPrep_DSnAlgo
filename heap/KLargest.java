package com.google.heap;

import java.util.PriorityQueue;

public class KLargest {
    public static void main( String args[]) {
        int arr[] = new int[]{7, 10, 4, 3, 20, 15};
        int k = 3;
        Object[] res = findKLargest(arr, arr.length, k);
        System.out.print(" K Largest elements : ");
        for( Object num  : res) {
            System.out.print(num + " ");
        }
    }
    public static Object[] findKLargest(int[] arr, int n , int k ) {
        PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>(k+1);
        for( int i = 0 ; i< n ; i++) {
            pQueue.add(arr[i]);
            if(pQueue.size() > k )
                pQueue.remove();
        }
        return pQueue.toArray();
    }
}
