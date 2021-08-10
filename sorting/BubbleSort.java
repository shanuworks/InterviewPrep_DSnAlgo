package com.google.sorting;

public class BubbleSort {
    public static void main(String args[]) {
        int arr[] = {20, 35, -15, 7, 55, 1, -22};
        bubbleSort(arr, arr.length);
        for(int i: arr) {
            System.out.print(i +" ");
        }
    }
    public static void bubbleSort(int arr[], int n){
        for(int lastUnsortedIndex = n-1; lastUnsortedIndex > 0 ; lastUnsortedIndex--) {
            for(int i = 0; i < lastUnsortedIndex ; i++) {
                if(arr[i] > arr[i+1]) {
                    swap(arr, i, i+1);
                }
            }
        }
    }
    public static void swap(int arr[], int x, int y) {
        if( x == y)
            return;
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
}
