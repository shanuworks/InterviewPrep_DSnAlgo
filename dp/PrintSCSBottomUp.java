package com.google.dp;

public class PrintSCSBottomUp{
    public static void main(String args[]) {
        String s1 = "abcde";
        String s2 = "ababcde";
        long start = System.currentTimeMillis();
        System.out.println(" LCS : "+lcsLength(s1,s2,s1.length(),s2.length()));
        System.out.println("Total time taken : "+ (System.currentTimeMillis() - start) +" ms");
    }
    public static String lcsLength( String s1, String s2, int m, int n) {
        StringBuilder lcs = new StringBuilder();
        if( m == 0 || n == 0)
            return lcs.toString();
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
                } else {
                    t[i][j] = Math.max(t[i-1][j],t[i][j-1]);
                }

            }
        }
        int i = m;
        int j = n;
        while( i > 0 && j > 0) {
            if( s1.charAt(i-1) == s2.charAt(j-1) ) {
                lcs.append(s1.charAt(i-1));
                i--;
                j--;
            } else {
                if( t[i][j-1] > t[i-1][j]) {
                    lcs.append(s2.charAt(j-1));
                    j--;
                } else {
                    lcs.append(s1.charAt(i-1));
                    i--;
                }
            }
        }
        while( i > 0) {
            lcs.append(s1.charAt(i-1));
            i--;
        }
        while( j > 0) {
            lcs.append(s2.charAt(j-1));
            j--;
        }
        return lcs.reverse().toString();
    }
}
