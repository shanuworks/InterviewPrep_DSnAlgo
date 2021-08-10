package com.google.sorting;

public class WaveSort {
    public static void main(String args[]) {
        int arr[] = {10, 5, 6, 3, 2, 20, 100, 80};
        waveSort(arr, arr.length);
        for(int i: arr) {
            System.out.print(i +" ");
        }
    }
    public static void waveSort( int arr[], int n) {
        for( int i = 0; i < n ; i +=2) {
            if( i != 0)
                if(arr[i] < arr[i-1])
                    swap( arr, i , i-1);
            if( arr[i] < arr[i+1])
                swap( arr, i, i+1);
        }
    }
    public static void swap( int arr[], int x, int y)
    {
        if(x == y)
            return;
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
}
