package com.google.binarySearch;

public class AllocateMinPage {
    public static void main(String args[]) {
        int arr[] = new int[]{10, 20, 30, 40, 50};
        int n = arr.length;
        int k = 3;
        System.out.println("Min page : "+findMinPage(arr, n, k));
    }
    public static int findMinPage(int[] arr, int size, int k) {
        int minPage = -1;
        if( size < k )
            return minPage;
        int start = findMax(arr, size);
        int end = findSum(arr, size);
        while( start <= end) {
            int mid = start + ( end - start ) / 2 ;
            if( isValid(arr, size,k,mid )) {
                minPage = mid ;
                end = mid -1 ;
            } else {
                start = mid + 1;
            }
        }
        return minPage;
    }
    public static int findSum(int[] arr, int n) {
        int sum = 0;
        for(int i=0; i < n ; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }
    public static int findMax(int[] arr, int n) {
        int max = Integer.MIN_VALUE;
        for(int i=0; i < n ; i++) {
            max = Math.max(max, arr[i]);
        }
        return max;
    }
    public static boolean isValid( int[] arr, int size, int k , int maxPage ) {
        int student = 1;
        int sum = 0 ;
        for( int i = 0 ; i < size; i++ ) {
            sum = sum + arr[i];
            if( sum > maxPage ){
                sum = arr[i];
                student ++;
            }
            if( student > k )
                return false;
        }
        return true;
    }
}

