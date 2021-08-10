package com.google.recursion;

public class Factorial {
    public static void main (String args[]) {
        int N = 5;
        System.out.println(factorial(N));
    }
    public static int factorial(int n) {
        // Base condition
        if( n == 0 )
            return 1;

        // Hypothesis & Induction
        return n * factorial(n-1);
    }
}
