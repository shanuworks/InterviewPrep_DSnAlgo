package com.google.recursion;

public class Print {
    public static void main (String args[]) {
        int N = 7;
        print(N);
    }
    public static void print(int n) {
        // Base condition
        if( n < 1 )
            return;
        //
        print(n-1);
        System.out.print( n +"  ");
    }
}
