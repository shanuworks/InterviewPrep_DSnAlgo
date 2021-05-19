package com.google.heap;

import java.util.PriorityQueue;
import java.util.Comparator;
import java.util.Map;
import java.util.HashMap;
import java.util.Map.Entry;

public class TopKFrequent {
    public static void main( String args[]) {
        int arr[] = new int[]{1,1,1,1,3,3,3,3,3,2,2,4};
        int k = 3;
        Object[] res = findKFrequent(arr, arr.length, k);
        System.out.print("Top K frequent elements : ");
        for( Object num  : res) {
            System.out.print(((Map.Entry)num).getKey()+ " ");
        }
    }
    public static Object[] findKFrequent(int[] arr, int n , int k ) {
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		/*
		PriorityQueue<Map.Entry<Integer,Integer>> pQueue = new PriorityQueue<Map.Entry<Integer,Integer>>(k+1,new Comparator<Map.Entry<Integer,Integer>>(){
	@Override
	public int compare(Map.Entry<Integer,Integer> obj1, Map.Entry<Integer,Integer> obj2) {
		// Min Heap
		return obj1.getValue() - obj2.getValue();
	}

});
*/
// the above line priority queue creation can be reduced to below code in java 8
        PriorityQueue<Map.Entry<Integer,Integer>> pQueue = new PriorityQueue<Map.Entry<Integer,Integer>>(k+1, (a,b) -> a.getValue().compareTo(b.getValue()));

        for( int i = 0 ; i< n ; i++) {
            if( map.containsKey(arr[i])) {
                map.put( arr[i], map.get(arr[i])+1);
            } else {
                map.put( arr[i], 1);
            }
        }
        for(Map.Entry entry : map.entrySet()) {
            pQueue.add(entry);
            if(pQueue.size() > k )
                pQueue.remove();
        }
        return pQueue.toArray();
    }
}
