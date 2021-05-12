package com.google.dp;

import java.util.Arrays;

public class MCMMemoize {
    public static void main( String args[]) {
        int arr[] = {40, 20, 30, 10, 30};
        int[][] t = new int[arr.length][arr.length];
        for(int[] a:t) {
            Arrays.fill(a,-1);
        }
        System.out.println("Min cost of  multiplication : "+ minCost( arr ,t,1, arr.length - 1) );
    }
    public static int minCost(int[] arr, int[][] t, int i, int j){
        int minCost = Integer.MAX_VALUE;
        if( i >= j)
            return 0;
        if(t[i][j] != -1)
            return t[i][j];
        for( int k = i ; k < j ; k++) {
            int tempCost = minCost(arr, t,i , k ) + minCost( arr, t,k+1 , j ) + arr[i-1] * arr[k] * arr[j];
            if( tempCost < minCost)
                minCost = tempCost;
        }
        return t[i][j] = minCost;
    }
}




