package com.google.dp;

public class MatrixChainMultiplication {
    public static void main( String args[]) {
        int arr[] = {40, 20, 30, 10, 30};
        System.out.println("Min cost of  multiplication : "+ minCost( arr ,1, arr.length - 1) );
    }
    public static int minCost(int[] arr, int i, int j){
        int minCost = Integer.MAX_VALUE;
        if( i >= j)
            return 0;
        for( int k = i ; k < j ; k++) {
            int tempCost = minCost(arr, i , k ) + minCost( arr, k+1 , j ) + arr[i-1] * arr[k] * arr[j];
            if( tempCost < minCost)
                minCost = tempCost;
        }
        return minCost;
    }
}
