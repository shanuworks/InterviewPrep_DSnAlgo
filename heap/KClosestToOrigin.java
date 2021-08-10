package com.google.heap;

import java.util.PriorityQueue;
import java.util.Comparator;


public class KClosestToOrigin {
    static class closestToOrigin {
        private int xCord;
        private int yCord;
        private int distFromOrigin;

        closestToOrigin(int xCord, int yCord, int distFromOrigin){
            this.xCord = xCord;
            this.yCord = yCord;
            this.distFromOrigin = distFromOrigin;
        }

        Integer getXCord() {
            return this.xCord;
        }
        Integer getYCord() {
            return this.yCord;
        }
        Integer getDistFromOrigin() {
            return this.distFromOrigin;
        }
    }
    public static void main( String args[]) {
        int arr[][] = new int[][]{{1,3},{-2,2}};
        int k = 1;
        Object[] res = findKClosest(arr, k);
        System.out.print(" K Closest points to origin : ");
        for( Object num  : res) {
            closestToOrigin c = ((closestToOrigin)num);
            System.out.print(c.getXCord()+ "  "+c.getYCord());
            System.out.println("");
        }
    }
    public static Object[] findKClosest(int[][] arr, int k ) {
        PriorityQueue<closestToOrigin> pQueue = new PriorityQueue<closestToOrigin>(k+1,new KClosestToOriginComparator());
        for( int i = 0 ; i< arr.length ; i++) {
            int dist = (int)(Math.pow(arr[i][0],2) + Math.pow(arr[i][1] , 2)) ;
            pQueue.add(new closestToOrigin(arr[i][0], arr[i][1], dist));
            if(pQueue.size() > k )
                pQueue.remove();
        }
        return pQueue.toArray();
    }
}
class KClosestToOriginComparator implements Comparator<KClosestToOrigin.closestToOrigin> {
    @Override
    public int compare(KClosestToOrigin.closestToOrigin obj1, KClosestToOrigin.closestToOrigin obj2) {
        // Max Heap
        return obj2.getDistFromOrigin().compareTo(obj1.getDistFromOrigin());
    }
}
