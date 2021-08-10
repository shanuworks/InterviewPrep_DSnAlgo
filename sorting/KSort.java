package com.google.sorting;

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
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i= 0; i < k+1; i++)
            pq.add(arr[i]);

        int index = 0;
        for (int i = k + 1; i < n; i++) {
            arr[index++] = pq.peek();
            pq.poll();
            pq.add(arr[i]);
        }
        Iterator<Integer> itr = pq.iterator();
        while (itr.hasNext()) {
            arr[index++] = pq.peek();
            pq.poll();
        }

    }
}
