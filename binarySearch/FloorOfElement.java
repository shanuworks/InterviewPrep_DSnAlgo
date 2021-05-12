package com.google.binarySearch;

public class FloorOfElement {
    public static void main(String args[]) {
        int arr[] = new int[]{1, 2, 3, 4, 5, 8, 10, 11, 12, 13, 15};
        int n = 9;
        System.out.println("Floor value of "+n+" is : "+findFloor(arr, n));
    }
    public static int findFloor(int[] arr, int num) {
        int res = Integer.MIN_VALUE;
        int start = 0;
        int end = arr.length -1 ;
        while( start <= end ) {
            int mid = start + (end-start)/2;
            if( arr[mid] == num) {
                return arr[mid];
            }
            else if( arr[mid] < num ) {
                res = Math.max(arr[mid],res);
                start = mid+1;
            } else {
                end = mid-1;
            }
        }
        return res;
    }
}
