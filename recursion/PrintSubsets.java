package com.google.recursion;

public class PrintSubsets {
    public static void main (String args[]) {
        String input = "abc";
        System.out.println("Subsets of string : "+input+" are below : ");
        String output ="";
        printSubsets(input,output);
    }
    public static void printSubsets( String input, String output ) {
        // Base condition
        if( input.length() == 0 ) {
            System.out.println("{"+output+"}");
            return;
        }

// Induction
        String output1 = output; // Not considered the character
        String output2 = output + input.charAt(0); // Consider the character

        // Hypothesis
        printSubsets(input.substring(1),output1);
        printSubsets(input.substring(1),output2);
    }
}
