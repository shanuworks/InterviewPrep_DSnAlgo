package com.google.dp;

import java.util.Arrays;

public class PalindromePartitioningMemoize {
    public static void main( String args[]) {
        String s = "abcbaaakaa";
        int[][] t = new int[s.length()][s.length()];
        for(int[] a:t) {
            Arrays.fill(a,-1);
        }
        System.out.println("Min no of  partition : "+ minPartition( s ,t,0, s.length() - 1) );
    }
    public static int minPartition(String s,int[][] t, int i, int j){
        int minPartition = Integer.MAX_VALUE;
        if( i >= j)
            return 0;
        if(t[i][j] != -1)
            return t[i][j];
        if(isPalindrome(s, i , j)){
            return t[i][j] = 0;
        }
        for( int k = i ; k < j ; k++) {
            int left,right ;
            if( t[i][k] != -1)
                left = t[i][k];
            else {
                left = minPartition(s,t, i , k );
                t[i][k] = left;
            }
            if( t[k+1][j] != -1)
                right = t[k+1][j];
            else {
                right = minPartition( s,t, k+1 , j );
                t[k+1][j] = right;
            }
            int tempPartition = left + right +1;
            if( tempPartition < minPartition)
                minPartition =tempPartition;
        }
        return t[i][j] = minPartition;
    }
    public static boolean isPalindrome(String s, int i, int j) {
        while( i < j ) {
            if( s.charAt(i) != s.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
}

