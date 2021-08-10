package com.google.sorting;

public class RecursiveInsertionSort1 {
    public static void main(String args[]) {
        int arr[] = {20, 35, -15, 7, 55, 1, -22};
        recursiveInsertionSort(arr, arr.length);
        for(int i: arr) {
            System.out.print(i +" ");
        }
    }
    public static void recursiveInsertionSort(int arr[], int itemsToSort)
    {
        if( itemsToSort <= 1)
            return;
        recursiveInsertionSort( arr, itemsToSort - 1);
        int newElement = arr[itemsToSort - 1];
        int i;
        for( i= itemsToSort - 1 ; i > 0 && arr[i -1] > newElement ; i --)
            arr[i] = arr[i-1];
        arr[i] = newElement;
        System.out.print("Result of call when itemsToSort is :"+ itemsToSort +"      ");
        for(int j: arr) {
            System.out.print(j +" ");
        }
        System.out.println("");
    }
}

