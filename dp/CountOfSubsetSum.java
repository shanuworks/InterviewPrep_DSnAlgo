package com.google.dp;

public class CountOfSubsetSum {
    public static void main(String args[]) {
        int num[] = new int[]{3, 3, 3, 3};
        int n = num.length;
        int sum = 6;
        long start = System.currentTimeMillis();
        System.out.println("Count of subsets with the given sum : "+countOfSubset(num, n, sum) );
        System.out.println("Total time taken : "+ (System.currentTimeMillis() - start) +" ms");

    }
    public static int countOfSubset(int[] num,int n, int sum) {
        int[][] t = new int[n+1][sum+1];
        for(int i=0; i <= n; i++) {
            for(int j=0; j <= sum; j++) {
                if( i == 0)
                    t[i][j] = 0;
                if( j == 0)
                    t[i][j] = 1;
            }
        }
        for( int i = 1 ; i < t.length ; i++) {
            for(int j=1; j < t[i].length ; j++) {
                if( num[i-1] <= j ) {
                    t[i][j] = t[i-1][j-num[i-1]]  + t[i-1][j];
                } else {
                    t[i][j] = t[i-1][j];
                }
            }
        }
        return t[n][sum];
    }
}
