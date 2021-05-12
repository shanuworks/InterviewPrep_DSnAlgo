package com.google.dp;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class CountOfSubsetSumWithGivenDiff {
    public static void main(String args[]) {
        int num[] = new int[]{2, 3, 5, 6, 7, 10};
        int n = num.length;
        int sum = Arrays.stream(num).sum();
        int diff = 1;
        long start = System.currentTimeMillis();
        System.out.println("Count of subsets with the given diff : "+countOfSubset(num, n, sum, diff) );
        System.out.println("Total time taken : "+ (System.currentTimeMillis() - start) +" ms");

    }
    public static int countOfSubset(int[] num,int n, int sum, int diff) {
        List<Integer> list = subsetSum(num, n, sum);
        int count = 0;
        for(int i : list) {
            count = Math.abs(sum-2*i) == diff ? count+1:count ;
        }
        return count;
    }
    public static List<Integer> subsetSum(int[] num,int n, int sum) {
        List<Integer> list = new ArrayList<Integer>();
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
        for( int j = 0 ; j <= sum ; j++) {
            if(t[n][j])
                list.add(j);
        }
        return list;
    }

}
