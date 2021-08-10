package com.google.recursion;

public class PrintNto1 {
    public static void main (String args[]) {
        int N = 7;
        print(N);
    }
    public static void print(int n) {
        // Base condition
        if( n < 1 )
            return;

        // Induction
        System.out.print( n +"  ");

        // Hypothesis
        print(n-1);
    }
}
