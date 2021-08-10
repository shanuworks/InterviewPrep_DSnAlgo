package com.google.recursion;

public class PermutationWithCaseChange {
    public static void main (String args[]) {
        String input = "ABC";
        System.out.println("Permutation of given string : "+input+" with case change are below : ");
        String output ="";
        printPermutation(input,output);
    }
    public static void printPermutation( String input, String output ) {
        // Base condition
        if( input.length() == 0 ) {
            System.out.println("("+output+")");
            return;
        }

// Induction
        String output1=""; // Flip Case
        if( Character.isLowerCase(input.charAt(0)))
            output1 = output+Character.toUpperCase(input.charAt(0));
        else
            output1 = output+Character.toLowerCase(input.charAt(0));

        String output2 = output +input.charAt(0); // Don't change the case

        // Hypothesis
        printPermutation(input.substring(1),output1);
        printPermutation(input.substring(1),output2);
    }
}
