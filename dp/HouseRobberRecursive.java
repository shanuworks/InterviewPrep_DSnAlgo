package com.google.dp;

public class HouseRobberRecursive {
    public static void main( String args[]) {
        int arr[] = new int[]{5, 3, 4, 11, 2};
        System.out.println("Max robbery amount  : "+ findMax(arr ,arr.length));
    }
    public static int findMax(int[] arr, int size){
        if(size == 0)
            return 0;
        else if( size == 1)
            return arr[0];
        else {
            return stealFromHouse(arr, 0);
        }
    }
    public static int stealFromHouse(int[] arr, int index) {
        if( index >= arr.length)
            return 0;
        return Math.max(arr[index] + stealFromHouse(arr, index+2) , stealFromHouse(arr,index+1) );
    }
}

