package com.google.dp;

public class HouseRobberOptimized {
    public static void main( String args[]) {
        int arr[] = new int[]{1, 3, 4, 4, 3, 3, 7, 2, 3, 4, 5, 1};
        System.out.println("Max robbery amount  : "+ findMax(arr ,arr.length));
    }
    public static int findMax(int[] arr, int size){
        if(size == 0)
            return 0;
        int value1 = arr[0];
        if( size == 1)
            return value1;
        int value2 = Math.max(arr[0], arr[1]);
        if( size == 2)
            return value2;
        int maxVal = Integer.MIN_VALUE;
        for(int i = 2; i < size ; i++) {
            maxVal = Math.max(arr[i] + value1, value2);
            value1 = value2 ;
            value2 = maxVal;
        }
        return maxVal;
    }
}

