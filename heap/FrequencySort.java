package com.google.heap;

import java.util.PriorityQueue;
import java.util.Map;
import java.util.HashMap;

public class FrequencySort {
    public static void main( String args[]) {
        int arr[] = new int[]{3,3,3,3,1,1,1,1,2,2,4};
        frequencySort(arr, arr.length);
    }
    public static void frequencySort(int[] arr, int n ) {
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        // Max Heap
        PriorityQueue<Map.Entry<Integer,Integer>> pQueue = new PriorityQueue<Map.Entry<Integer,Integer>>((a,b) -> b.getValue().compareTo(a.getValue()));

        for( int i = 0 ; i< n ; i++) {
            if( map.containsKey(arr[i])) {
                map.put( arr[i], map.get(arr[i])+1);
            } else {
                map.put( arr[i], 1);
            }
        }
        for(Map.Entry entry : map.entrySet()) {
            pQueue.add(entry);
        }
        while( pQueue.size() > 0 ) {
            Map.Entry<Integer,Integer> entry = pQueue.poll();
            int count = 0;
            while(count < entry.getValue() ) {
                System.out.print(entry.getKey() +"  ");
                count++;
            }
        }
    }
}
