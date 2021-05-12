package com.google.dp;
import java.util.Arrays;

public class LCSMemoize{
    public static void main(String args[]) {
        String s1 = "abcdgh";
        String s2 = "abedfh";
        long start = System.currentTimeMillis();
        int m =   s1.length();
        int n = s2.length();
        int[][] t = new int[m+1][n+1];
        for(int[] a : t) {
            Arrays.fill( a , -1);
        }
        System.out.println("Length of  LCS : "+lcsLength(s1,s2,t,s1.length(),s2.length()));
        System.out.println("Total time taken : "+ (System.currentTimeMillis() - start) +" ms");
    }
    public static int lcsLength( String s1, String s2,int[][] t, int m, int n) {
        if( m == 0 || n == 0)
            return 0;
        if(t[m][n] != -1)
            return t[m][n];
        if( s1.charAt(m-1) == s2.charAt(n-1)) {
            return t[m][n] = 1 + lcsLength(s1,s2,t,m-1,n-1);
        } else {
            return t[m][n] = Math.max(lcsLength(s1,s2,t,m-1,n), lcsLength(s1,s2,t,m,n-1));
        }
    }
}
