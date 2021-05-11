package com.google.arrays;

public class SegregateElements {
    public static void main(String args[]) {
        int arr[] = new int[] {0,1,1,1,1,0,0,0,1,0,0,1,1,1,0,1,1};
        segregateElements(arr,  arr.length);
        for(int i: arr) {
            System.out.print(i +" ");
        }
    }
    public static void segregateElements(int arr[], int n) {
        int i = 0;
        int j = n-1;
        while( i < j) {
            while( arr[i] == 0 && i < j)
                i++;
            while( arr[j] == 1 && i < j)
                j--;
            if( i < j) {
                arr[i] = 0;
                arr[j] = 1;
                i++;
                j--;
            }
        }
    }
}
