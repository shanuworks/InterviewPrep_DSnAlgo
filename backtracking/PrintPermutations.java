package com.google.backtracking;

public class PrintPermutations {
    public static void main (String args[]) {
        String input = "abc";
        String output = input;
        System.out.println("Permutations of string : "+input+" are below : ");
        printPermutations(input.length(),0, output);
    }
    public static void printPermutations( int len, int pos, String output) {
        // Base condition
        if( pos == len-1 ) {
            System.out.println(output);
            return;
        }
        // No swaps when i is equal to pos
        printPermutations( len, pos+1, output);
        int i = pos+1 ;
// Swap pos char with all the  ith char where i starts with pos+1 and goes till len-1
        while( i <= len-1 ) {
            output = swap(output, pos, i);
            printPermutations( len, pos+1, output);
            output=swap(output, pos, i);//Backtrack to the old state,reswap the values
            i++;
        }
    }
    public static String swap(String output, int start, int end) {
        if( output.charAt(start) != output.charAt(end)) {
            char temp = output.charAt(start);
            StringBuilder sb = new StringBuilder(output);
            sb.setCharAt(start, output.charAt(end));
            sb.setCharAt(end, temp);
            output = sb.toString();
        }
        return output;
    }
}
