package com.google.dp;
import java.util.Arrays;
public class LCSubstring{
    public static void main(String args[]) {
        String s1 = "abcdgh";
        String s2 = "abedfhr";
        long start = System.currentTimeMillis();
        System.out.println("Length of  LCS : "+lcsLength(s1,s2,s1.length(),s2.length()));
        System.out.println("Total time taken : "+ (System.currentTimeMillis() - start) +" ms");
    }
    public static int lcsLength( String s1, String s2, int m, int n) {
        int maxLength = Integer.MIN_VALUE;
        if( m == 0 || n == 0)
            return 0;
        int[][] t = new int[m+1][n+1];

        for(int i = 0 ; i <= m ; i++) {
            for(int j =  0 ; j <= n ; j++) {
                if( i == 0  || j == 0)
                    t[i][j] = 0;
            }
        }
        for(int i = 1 ; i <= m ; i++) {
            for(int j =  1 ; j <= n ; j++) {
                if( s1.charAt(i-1) == s2.charAt(j-1)) {
                    t[i][j] = 1 + t[i-1][j-1];
                    if( maxLength < t[i][j])
                        maxLength = t[i][j];
                } else {
                    t[i][j] = 0;
                }

            }
        }
        return maxLength;
    }
}
