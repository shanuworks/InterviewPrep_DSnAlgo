package com.google.binarySearch;

public class CeilOfElement {
    public static void main(String args[]) {
        int arr[] = new int[]{1, 2, 3, 4, 5, 8, 10, 11, 12, 13, 15};
        int n = 11;
        System.out.println("Ceil value of "+n+" is : "+findCeil(arr, n));
    }
    public static int findCeil(int[] arr, int num) {
        int res = Integer.MAX_VALUE;
        int start = 0;
        int end = arr.length -1 ;
        while( start <= end ) {
            int mid = start + (end-start)/2;
            if( arr[mid] == num) {
                return arr[mid];
            }
            else if( arr[mid] < num ) {
                start = mid+1;
            } else {
                res = Math.min(arr[mid],res);
                end = mid-1;
            }
        }
        return res;
    }
}
