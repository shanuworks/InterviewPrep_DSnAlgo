package com.google.dp;

public class HouseRobber {
    public static void main( String args[]) {
        int arr[] = new int[]{2,15,9,3,20};
        System.out.println("Max robbery amount  : "+ findMax(arr ,arr.length));
    }
    public static int findMax(int[] arr, int size){
        int[] house = new int[size];
        if(size == 0)
            return 0;
        else if( size == 1)
            return arr[0];
        else {
            house[0] = arr[0];
            house[1] = Math.max( arr[0], arr[1]);
            for(int i = 2; i < size ; i++) {
                house[i] = Math.max(arr[i] + house[i-2], house[i-1]);
            }
            return house[size-1];
        }
    }
}
