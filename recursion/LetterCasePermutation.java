package com.google.recursion;

public class LetterCasePermutation {
    public static void main (String args[]) {
        String input = "a1B2";
        System.out.println("Letter case Permutation of given string : "+input+" are below : ");
        String output ="";
        printPermutation(input,output);
    }
    public static void printPermutation( String input, String output ) {
        if( input.length() == 0 ) {
            System.out.println("("+output+")");
            return;
        }

        if( Character.isAlphabetic(input.charAt(0))) {
            String output1= output+Character.toLowerCase(input.charAt(0)); //lowerc
            String output2= output+Character.toUpperCase(input.charAt(0)); //upperc

            printPermutation(input.substring(1),output1);
            printPermutation(input.substring(1),output2);
        } else {
            String output1= output+input.charAt(0);
            printPermutation(input.substring(1),output1);
        }
    }
}
