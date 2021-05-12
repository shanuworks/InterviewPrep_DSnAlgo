package com.google.dp;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class MinSubsetSumDiff {
    public static void main(String args[]) {
        int num[] = new int[]{1, 3, 7, 3 };
        int n = num.length;
        int sum = Arrays.stream(num).sum();
        long start = System.currentTimeMillis();
        System.out.println("Min difference between subsets sum : "+findDifference(num, n, sum) );
        System.out.println("Total time taken : "+ (System.currentTimeMillis() - start) +" ms");

    }
    public static int findDifference(int[] num,int n, int sum) {
        List<Integer> list = subsetSum(num, n, sum);
        int min = Integer.MAX_VALUE;
        for(int i : list) {
            min = min > sum-2*i ? sum-2*i : min ;
        }
        return min;
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
        for( int j = 0 ; j <= sum/2 ; j++) {
            if(t[n][j])
                list.add(j);
        }
        return list;
    }
}
