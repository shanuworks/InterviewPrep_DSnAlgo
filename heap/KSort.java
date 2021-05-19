package com.google.heap;

import java.util.PriorityQueue;
import java.util.Iterator;

public class KSort {
    public static void main(String args[]) {
        int arr[] = {6, 5, 3, 2, 8, 10, 9 };
        int k = 3;
        kSort(arr, arr.length, k);
        for(int i: arr) {
            System.out.print(i +" ");
        }
    }
    public static void kSort(int arr[], int n, int k) {
        // k+1 size as the correct item will be k distance apart from the current index
        PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>(k+1);
        int index = 0;
        for( int i = 0 ; i< n ; i++) {
            pQueue.add(arr[i]);
            if(pQueue.size() == k+1 )
                arr[index++] = pQueue.remove();
        }
        Iterator<Integer> itr = pQueue.iterator();
        while (itr.hasNext()) {
            arr[index++] = pQueue.peek();
            pQueue.poll();
        }
    }
}

