package com.google.faq;

public class MaximizeDistanceToClosest {
    public static void main( String args[]) {
        int arr[] = new int[]{1 , 1};
        System.out.println("Max Dist : "+ findMaxDist(arr,arr.length));
    }
    public static int findMaxDist(int[] arr, int n){
        int maxDist = Integer.MIN_VALUE;
        int prevOccupiedIndex = -1;
        int countVacantSeats = 0;
        for(int i = 0; i < n ; i++ ) {
            if( arr[i] == 1) {
                if( prevOccupiedIndex != -1 ) {
                    int currDist = (countVacantSeats + 1 )/ 2;
                    maxDist = Math.max(maxDist , currDist);
                } else {
                    maxDist = Math.max(maxDist , countVacantSeats);
                }
                prevOccupiedIndex = i;
                countVacantSeats = 0;
            } else {
                countVacantSeats++;
                if( i == n-1 )
                    maxDist = Math.max(maxDist , countVacantSeats);
            }
        }
        return maxDist;
    }
}
