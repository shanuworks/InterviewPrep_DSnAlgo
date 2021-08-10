package com.google.recursion;

public class KthSymbolGrammar {
    public static void main (String args[]) {
        int N = 5;
        int K = 17;
        System.out.println(findKthSymbol(N, K));
    }
    public static int findKthSymbol(int N, int K) {
        // Base condition
        if( N == 1 && K == 1)
            return 0;
        int len = (int)(Math.pow( 2 , N-1 ));
        int mid = len / 2;
        if( K > len || K <= 0 )
            return -1;
        // Hypothesis & Induction
        if( K <= mid) {
            return findKthSymbol(N-1,K);
        } else {
            return findKthSymbol(N-1,K-mid) ^ 1; // XOR with 1 -> 0 ^ 1(diff) = 1 & 1^1(same) = 0
        }
    }

}
