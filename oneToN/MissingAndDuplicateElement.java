package com.google.oneToN;

public class MissingAndDuplicateElement {
    public static void main( String args[] ) {
        int arr[] = new int[]{2, 3, 1, 5, 4,3};
        int[] res = findMissingAndDuplicate(arr, arr.length );
        System.out.println(" Missing Number : "+ res[0] );
        System.out.println(" Duplicate Number : "+ res[1] );
    }
    public static int[] findMissingAndDuplicate(int[] arr, int size) {
        int[] res = new int[2];
        for(int i = 0; i < size ;) {
            if( arr[i] != arr[arr[i] - 1 ] ) {
                swap(arr, i, arr[i]-1);
            } else {
                i++;
            }
        }
        int i = 0;
        while(i < size && arr[i] == i+1) {
            i++;
        }
        if( i < size ) {
            res[0] = i+1;
            res[1] = arr[i];
        }
        return res;
    }
    public static void swap(int[] arr, int i , int j){
        int temp = arr[i] ;
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

