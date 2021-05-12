package com.google.dp;

public class PalindromePartitioning {
    public static void main( String args[]) {
        String s = "abdfg";
        System.out.println("Min no of  partition : "+ minPartition( s ,0, s.length() - 1) );
    }
    public static int minPartition(String s, int i, int j){
        int minPartition = Integer.MAX_VALUE;
        if( i >= j)
            return 0;
        if(isPalindrome(s, i , j)){
            return 0;
        }
        for( int k = i ; k < j ; k++) {
            int tempPartition = minPartition(s, i , k ) + minPartition( s, k+1 , j ) +1;
            if( tempPartition < minPartition)
                minPartition =tempPartition;
        }
        return minPartition;
    }
    public static boolean isPalindrome(String s, int i, int j) {
        while( i < j ) {
            if( s.charAt(i) == s.charAt(j)) {
                i++;
                j--;
            } else
                return false;
        }
        return true;
    }
}



