package com.google.binarySearch;

public class PeakElement {
    public static void main(String args[]) {
        int arr[] = new int[]{1, 10, 8, 7, 6, 5, 4, 2};
        int index = findPeak(arr);
        int pos = index >= 0 ? index+1 : index ;
        System.out.println("Peak element found at : "+pos+" pos");
    }
    public static int findPeak(int[] arr) {
        int start = 0;
        int end = arr.length -1 ;
        while( start <= end ) {
            int mid = start + (end-start)/2;
            if( mid > 0 && mid <  arr.length -1  ) {
                if( arr[mid] > arr[mid-1] &&  arr[mid] > arr[mid+1])
                    return mid;
                else if(arr[mid-1] > arr[mid])
                    end = mid - 1;
                else
                    start = mid + 1;
            } else if(mid == 0){
                if( arr[0] > arr[1] )
                    return 0;
                else
                    return 1;
            } else if( mid == arr.length -1 ) {
                if( arr[arr.length -1]  > arr[arr.length -2])
                    return arr.length -1;
                else
                    return arr.length -2;
            }
        }
        return -1;
    }
}
