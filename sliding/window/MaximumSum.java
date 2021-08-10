package com.google.sliding.window;

public class MaximumSum {
    public static void main( String args[] ) {
        int arr[] = new int[]{2, 5, 1, 8, 2, 9, 1};
        int k = 3 ;
        System.out.println(" Maximum Sum : "+ findMaxSum( arr, arr.length, k));
    }
    public static int findMaxSum( int[] arr, int size, int k) {
        int sum = 0;
        int max_Sum = Integer.MIN_VALUE;
        int i = 0;
        int j = 0;
        while( j < size ) {
            sum = sum + arr[j];
            int windowSize = j-i+1 ;
            if( windowSize < k )
                j++;
            else if( windowSize == k) {
                max_Sum = Math.max( max_Sum, sum );
                sum = sum - arr[i] ;
                i++;
                j++;
            }
        }
        return max_Sum;
    }
}

