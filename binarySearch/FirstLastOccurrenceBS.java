package com.google.binarySearch;

public class FirstLastOccurrenceBS {
    public static void main(String args[]) {
        int arr[] = new int[]{1,2,3,4,5,6,7,8,10};
        int n = 10;
        int index = findFirstOccurrence(arr, n);
        int pos = index >= 0 ? index+1 : index ;
        System.out.println("Element "+n+" first occurrence found at : "+pos+" pos");
        index = findLastOccurrence(arr, n);
        pos = index >= 0 ? index+1 : index ;
        System.out.println("Element "+n+" last occurrence found at : "+pos+" pos");
    }
    public static int findFirstOccurrence(int[] arr, int num) {
        int res = -1;
        int start = 0;
        int end = arr.length -1 ;
        while( start <= end ) {
            int mid = start + (end-start)/2;
            if( arr[mid] == num) {
                res = mid;
                end = mid-1;
            }
            else if( arr[mid] < num )
                start = mid+1;
            else
                end = mid-1;
        }
        return res;
    }
    public static int findLastOccurrence(int[] arr, int num) {
        int res = -1;
        int start = 0;
        int end = arr.length -1 ;
        while( start <= end ) {
            int mid = start + (end-start)/2;
            if( arr[mid] == num) {
                res = mid;
                start = mid+1;
            }
            else if( arr[mid] < num )
                start = mid+1;
            else
                end = mid-1;
        }
        return res;
    }

}
