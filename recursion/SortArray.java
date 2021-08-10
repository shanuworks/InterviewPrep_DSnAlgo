package com.google.recursion;

public class SortArray {
    public static void main (String args[]) {
        int arr[] = new int[]{8, 3, 7, 6, 1, 5, 9};
        System.out.print("Array before sorting : ");
        for( int i : arr ) {
            System.out.print(i+" ");
        }
        System.out.println("");
        sort(arr, arr.length);
        System.out.print("Array after sorting : ");
        for( int i : arr ) {
            System.out.print(i+" ");
        }
    }
    public static void sort(int[] arr, int size) {
        // Base condition
        if( size == 1 )
            return;
        // Hypothesis
        int temp = arr[size-1];
        sort(arr, size-1);

// Induction
        insert(arr, size-1, temp);
    }
    public static void insert(int[] arr, int size, int temp){
        // Base condition
        if( size == 0 || arr[size-1] <= temp ) {
            arr[size] = temp;
            return;
        }
        // Hypothesis
        int val = arr[size-1];
        insert( arr, size-1, temp );
        arr[size] = val;
    }
}
