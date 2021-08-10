package com.google.sorting;

public class InsertionSort {
    public static void main(String args[]) {
        int arr[] = {20, 35, -15, 7, 55, 1, -22};
        insertionSort(arr, arr.length);
        for(int i: arr) {
            System.out.print(i +" ");
        }
    }
    public static void insertionSort(int arr[], int n){
        for(int firstUnsortedIndex = 1; firstUnsortedIndex < n ; firstUnsortedIndex++) {
            int newElement = arr[firstUnsortedIndex];
            int i ;
            for( i= firstUnsortedIndex ; i > 0 && arr[i-1]  > newElement ; i--) {
                arr[i] = arr[i-1];
            }
            if( i != firstUnsortedIndex)
                arr[i] = newElement ;
        }
    }
}
