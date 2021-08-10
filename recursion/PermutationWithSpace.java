package com.google.recursion;

public class PermutationWithSpace {
    public static void main (String args[]) {
        String input = "ABC";
        System.out.println("Permutation of given string : "+input+" are below : ");
        String output =""+input.charAt(0);
        printPermutation(input.substring(1),output);
    }
    public static void printPermutation( String input, String output ) {
        // Base condition
        if( input.length() == 0 ) {
            System.out.println("("+output+")");
            return;
        }

// Induction
        String output1 = output+input.charAt(0);; // No Space
        String output2 = output +" "+input.charAt(0); // With Space

        // Hypothesis
        printPermutation(input.substring(1),output1);
        printPermutation(input.substring(1),output2);
    }
}
