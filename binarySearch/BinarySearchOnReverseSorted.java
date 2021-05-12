package com.google.binarySearch;

public class BinarySearchOnReverseSorted {
    public static void main(String args[]) {
        int arr[] = new int[]{15, 13, 9, 7, 4, 3, 1};
        int n = 3;
        int index = binarySearch(arr, n);
        int pos = index >= 0 ? index+1 : index ;
        System.out.println("Element "+n+" found at : "+pos+" pos");
    }
    public static int binarySearch(int[] arr, int num) {
        int start = 0;
        int end = arr.length -1 ;
        while( start <= end ) {
            int mid = start + (end-start)/2;
            if( arr[mid] == num)
                return mid;
            else if( arr[mid] < num )
                end = mid-1;
            else
                start = mid+1;
        }
        return -1;
    }
}
