
package com.google.recursion;

public class TowerOfHanoi {
    static int count = 0;
    public static void main (String args[]) {
        int n = 4 ;
        int s = 1;
        int h = 2;
        int d = 3;
        System.out.println("Steps to move the plates to destination: ");
        printSteps(n, s, h, d);
        System.out.println("No. of steps required: "+count);
    }
    public static void printSteps( int n, int source, int helper, int destination ) {
        count++;
        // Base condition
        if( n == 1 ) {
            System.out.println(" Moved plate "+n +" from "+source+" to "+destination);
            return;
        }
        // Hypothesis
        printSteps(n-1,source,destination,helper); // move n-1 plate to from src to helper

// Induction
        System.out.println(" Moved plate "+n +" from "+source+" to "+destination);
        printSteps(n-1,helper,source,destination); // move n-1 plate from helper to dest
    }
}
