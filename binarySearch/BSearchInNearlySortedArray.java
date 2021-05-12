package com.google.binarySearch;

public class BSearchInNearlySortedArray {
    public static void main(String args[]) {
        int arr[] = new int[]{10,3,40,20,50,80,70};
        int n = 80;
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
            else if( mid-1 >= start && arr[mid-1] == num)
                return mid-1;
            else if(mid+1 <= end && arr[mid+1] == num)
                return mid+1;
            else if( arr[mid] < num )
                start = mid+2;
            else
                end = mid-2;

        }
        return -1;
    }
}
