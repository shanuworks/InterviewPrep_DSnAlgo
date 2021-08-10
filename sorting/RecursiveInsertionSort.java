package com.google.sorting;

public class RecursiveInsertionSort {
    public static void main(String args[]) {
        int arr[] = {20, 35, -15, 7, 55, 1, -22, 50, -15, 55, 60,7,20};
        recursiveInsertionSort(arr, 1, arr.length);
        for(int i: arr) {
            System.out.print(i +" ");
        }
    }
    public static void recursiveInsertionSort(int arr[], int firstUnsortedIndex, int n)
    {
        if( firstUnsortedIndex >= n)
            return;
        int newElement = arr[firstUnsortedIndex] ;
        int i =getNewElementIndex(arr,firstUnsortedIndex, newElement);
        if( i != firstUnsortedIndex)
            arr[i] = newElement ;

        recursiveInsertionSort( arr, firstUnsortedIndex + 1, n);
    }
    public static int getNewElementIndex(int []arr,int i,int newElement){
        if( i <= 0 || arr[i-1] <= newElement)
            return i;
        else {  // if( i > 0 && arr[i-1] > newElement)
            arr[i] = arr[i-1];
            return getNewElementIndex(arr, i-1, newElement);
        }
    }
}
