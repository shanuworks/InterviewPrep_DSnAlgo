package com.google.backtracking;

public class PrintPermutationsWithSpace {
    public static void main (String args[]) {
        String input = "abc";
        String output =input;
        System.out.println("Permutations with spaces of string : "+input+" are below : ");
        printPermutations(input.length(),0, output);
    }
    public static void printPermutations(int len, int pos, String output) {
        // Base condition
        if( pos == len-1 ) {
            System.out.println(output);
            return;
        }
        printPermutations( len, pos+1, output);
        StringBuilder sb = new StringBuilder(output);
        sb.insert(pos+1,' ');
        output = sb.toString();
        printPermutations( len+1, pos+2, output);
        // No need to backtrack here as output is passed by value not by reference
    }
}
