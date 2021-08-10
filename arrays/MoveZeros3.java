package com.google.arrays;

public class MoveZeros3 {
    public static void main(String args[]) {
        int arr[] = new int[] { 0, 2, 0, 0, 5, 8, 0,0,0,0, 7, 8, 0,0};
        moveZeros(arr,  arr.length);
        for(int i: arr)
        {
            System.out.print( i +" ");
        }
    }
    public static void moveZeros(int[] arr, int n) {
        int i = 0;
        while( i < n && arr[i] > 0)
            i++;
        int j = i+1;
        while(j < n){
            while( j < n &&  arr[j] == 0 )
                j++;
            if( i < n && j < n )
                swap(arr,i,j);
            i++;
            j++;
        }
    }
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
