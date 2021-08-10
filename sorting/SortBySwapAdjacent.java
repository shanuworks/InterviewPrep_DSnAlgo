package com.google.sorting;

public class SortBySwapAdjacent {
    public static void main(String args[]) {
        int arr[] = {1, 2, 5, 3, 4, 6};
        int B[] = { 0, 1,1,1,0};
        boolean canBeSorted = sortBySwapAdjacent(arr, B, arr.length);
        System.out.println("Array can be sorted :- "+ canBeSorted);
        for(int i: arr) {
            System.out.print(i +" ");
        }
    }
    public static boolean sortBySwapAdjacent( int arr[], int B[], int n ) {
        for( int i = 0, j= 0; i < n-1 && j < n-1 ; i ++, j++)  {								if( B[j] == 1 && arr[i] > arr[i+1])
            swap( arr, i, i+1);
        }
        for(int i = 0; i<n ; i++) {
            if( arr[i] != i+1)
                return false;
        }
        return true ;
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
