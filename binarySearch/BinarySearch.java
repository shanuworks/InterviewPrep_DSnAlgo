package com.google.binarySearch;

public class BinarySearch {
    public static void main(String args[]) {
        int arr[] = new int[]{1,2,3,4,5,6,7,8,9};
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
            if( arr[mid] == num)
                return mid;
            else if( arr[mid] < num )
                start = mid+1;
            else
                end = mid-1;

        }
        return -1;
    }
}
