package com.google.sliding.window;

public class LargestSubArray {
    public static void main( String args[] ) {
        int arr[] = new int[]{4, 1, 1, 1, 2, 3, 5};
        int k = 5 ;
        System.out.println(" Largest subarray size : "+ largestSubArray( arr, arr.length, k));
    }
    public static int largestSubArray( int[] arr, int size, int k) {
        int sum = 0;
        int largest_SubArray = Integer.MIN_VALUE;
        int i = 0;
        int j = 0;
        while( j < size ) {
            sum = sum + arr[j];
            if( sum < k )
                j++;
            else if( sum == k) {
                int windowSize = j-i+1 ;
                largest_SubArray = Math.max( largest_SubArray, windowSize );
                j++;
            } else if( sum > k){
                while( sum > k ) {
                    sum = sum - arr[i] ;
                    i++;
                }
                j++;
            }
        }
        return largest_SubArray;
    }
}

