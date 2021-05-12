package com.google.binarySearch;

public class NoOfRotation {
    public static void main(String args[]) {
        int arr[] = new int[]{2,2,3,1,1};
        System.out.println("Rotation Count : "+findRotationCount(arr));
    }
    public static int findRotationCount(int[] arr) {
        int start = 0;
        int end = arr.length -1 ;
        if(arr.length == 0 || arr.length == 1 || arr[start] < arr[end] )
            return 0;
        while( start <= end ) {
            int mid = start + (end-start)/2;
            if(start < mid && arr[mid-1] > arr[mid])
                return mid;
            if(mid < end && arr[mid+1] < arr[mid])
                return mid+1;
            if( arr[start] <= arr[mid] )
                start = mid+1;
            else if(arr[mid] <= arr[end])
                end = mid-1;

        }
        return -1;
    }
}

