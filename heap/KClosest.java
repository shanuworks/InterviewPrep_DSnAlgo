package com.google.heap;

import java.util.PriorityQueue;
import java.util.Comparator;


public class KClosest {
    static class closestToX {
        private int num;
        private int diff;

        closestToX(int num, int diff){
            this.num = num;
            this.diff = diff;
        }

        Integer getNum() {
            return this.num;
        }
        Integer getDiff() {
            return this.diff;
        }
    }
    public static void main( String args[]) {
        int arr[] = new int[]{5, 6, 7, 8, 9};
        int k = 3;
        int x = 7;
        Object[] res = findKClosest(arr, arr.length, k, x);
        System.out.print(" K Closest elements : ");
        for( Object num  : res) {

            System.out.print(((closestToX)num).getNum()+ " ");
        }
    }
    public static Object[] findKClosest(int[] arr, int n , int k, int x ) {
        PriorityQueue<closestToX> pQueue = new PriorityQueue<closestToX>(k+1,new KClosestComparator());
        for( int i = 0 ; i< n ; i++) {
            pQueue.add(new closestToX(arr[i], Math.abs(arr[i] - x)));
            if(pQueue.size() > k )
                pQueue.remove();
        }
        return pQueue.toArray();
    }
}
class KClosestComparator implements Comparator<KClosest.closestToX> {
    @Override
    public int compare(KClosest.closestToX obj1, KClosest.closestToX obj2) {
        // Max Heap
        return obj2.getDiff().compareTo(obj1.getDiff());
    }
}
