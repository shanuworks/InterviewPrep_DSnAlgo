package com.google.dp;

public class LCS{
    public static void main(String args[]) {
        String s1 = "abcdgh";
        String s2 = "abedfh";
        long start = System.currentTimeMillis();
        System.out.println("Length of  LCS : "+lcsLength(s1,s2, s1.length(), s2.length()) );
        System.out.println("Total time taken : "+ (System.currentTimeMillis() - start) +" ms");
    }
    public static int lcsLength( String s1, String s2, int m, int n) {
        if( m == 0 || n == 0)
            return 0;
        if( s1.charAt(m-1) == s2.charAt(n-1))
            return 1 + lcsLength(s1,s2,m-1,n-1);
        else
            return Math.max(lcsLength(s1,s2,m-1,n), lcsLength(s1,s2,m,n-1));
    }
}
