package com.google.sorting;

public class SelectionSort {
    public static void main(String args[]) {
        int arr[] = {20, 35, -15, 7, 55, 1, -22};
        selectionSort(arr, arr.length);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void selectionSort(int arr[], int n) {
        for (int lastUnsortedIndex = n - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            int largest = 0;
            for (int i = 1; i <= lastUnsortedIndex; i++) {
                if (arr[i] > arr[largest]) {
                    largest = i;
                }
            }
            swap(arr, largest, lastUnsortedIndex);
        }
    }

    public static void swap(int arr[], int x, int y) {
        if (x == y)
            return;
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
}