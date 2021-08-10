package com.google.dp;
import java.util.stream.IntStream;
import java.util.Arrays;
public class EqualSumPartition {
    public static void main(String args[]) {
        int num[] = new int[]{1, 8, 11, 6};
        int n = num.length;
        int sum = IntStream.of(num).sum();
        //int sum1= Arrays.stream(num).sum();
        if( sum % 2 != 0) {
            System.out.println("Two Subset with equal sum exists : False , as the sum is Odd" );
            return;
        }
        long start = System.currentTimeMillis();
        System.out.println("Two Subset with equal sum exists : "+subsetExists(num, n, sum/2) );
        System.out.println("Total time taken : "+ (System.currentTimeMillis() - start) +" ms");

    }
    public static boolean subsetExists(int[] num,int n, int sum) {
        boolean[][] t = new boolean[n+1][sum+1];
        for(int i=0; i <= n; i++) {
            for(int j=0; j <= sum; j++) {
                if( i == 0)
                    t[i][j] = false;
                if( j == 0)
                    t[i][j] = true;
            }
        }
        for( int i = 1 ; i < t.length ; i++) {
            for(int j=1; j < t[i].length ; j++) {
                if( num[i-1] <= j ) {
                    t[i][j] = t[i-1][j-num[i-1]]  || t[i-1][j];
                } else {
                    t[i][j] = t[i-1][j];
                }
            }
        }
        return t[n][sum];
    }
}
