package com.google.binarySearch;

public class BSInSortedRotatedArray {
    public static void main(String args[]) {
        int arr[] = new int[]{6,7,8,9,1,2,3,4,5};
        int n = 5;
        int index = binarySearch(arr, n);
        int pos = index >= 0 ? index+1 : index ;
        System.out.println("Element "+n+" found at : "+pos+" pos");
    }
    public static int binarySearch(int[] arr, int num) {
        int start = 0;
        int end = arr.length -1 ;
        while( start <= end ) {
            int mid = start + (end-start)/2;
            if( arr[mid] == num )
                return mid;
            else if( arr[start] <= arr[mid]) {
                if(arr[start] <= num && num <= arr[mid])
                    end = mid - 1;
                else
                    start = mid+1;
            } else if(arr[mid] <= arr[end]) {
                if(arr[mid] <= num && num <= arr[end])
                    start = mid+1;
                else
                    end = mid-1;
            }
        }
        return -1;
    }
}
