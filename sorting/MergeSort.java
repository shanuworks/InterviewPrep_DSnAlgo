package com.google.sorting;

public class MergeSort {
    public static void main(String args[]) {
        int arr[] = {20, 35, -15, 7, 4, 1, -22};
        mergeSort(arr, 0, arr.length-1 );
        for(int i: arr) {
            System.out.print(i +" ");
        }
    }
    public static void mergeSort(int arr[], int start, int end){
        if( start == end)
            return;
        int mid = ( start + end ) / 2;
        mergeSort(arr, start, mid);
        mergeSort(arr, mid+1, end);
        merge(arr, start, mid, end );

    }
    public static void merge(int arr[], int start, int mid, int end) {
        if(arr[mid] <= arr[mid+1] )
            return;
        int i = start;
        int j = mid +1;
        int tempIndex = 0;
        int tempArray[] = new int[end - start + 1];
        while ( i <= mid && j <= end)
            tempArray[tempIndex++] = arr[i] <= arr[j] ? arr[i++] : arr[j++];
        if( i <=  mid)
            System.arraycopy(arr , i , arr, start + tempIndex , mid - i + 1);
        System.arraycopy(tempArray,0 , arr, start, tempIndex);
    }
}

