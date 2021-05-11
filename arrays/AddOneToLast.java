package com.google.arrays;

public class AddOneToLast {
    public static void main( String args[]) {
        int[] arr = { 8, 9, 9, 9 };
        int[] res = addOneToLast( arr, arr.length- 1);
        for( int i : res) {
            System.out.print( i +"  ");
        }
    }
    public static int[] addOneToLast( int arr[], int n) {
        if( n <= -1) {
            int newArr[] = new int[arr.length + 1];
            newArr[0] = 1;
            System.arraycopy(arr, 0,newArr, 1, arr.length);
            return newArr;
        }
        else if( arr[n] > 9)
            return arr;
        else if( arr[n] < 9) {
            arr[n] = arr[n] + 1;
            return arr;
        }
        else {
            arr[n] = 0 ;
            return addOneToLast( arr , n-1);
        }
    }
}
