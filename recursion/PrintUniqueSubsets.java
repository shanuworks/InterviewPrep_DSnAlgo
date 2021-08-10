package com.google.recursion;

import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class PrintUniqueSubsets {

    static Set<String> outputSet = new HashSet<String>();
    public static void main (String args[]) {
        String input = "abc";
        System.out.println("Subsets of string : "+input+" are below : ");
        String output ="";
        printSubsets(input,output);
        System.out.println(outputSet);
        TreeSet<String> treeSet = new TreeSet<String>(outputSet);
        System.out.println("Print in lexicographic order using treeset - "+treeSet);
        List<String> sortedList = new ArrayList<String>(outputSet);
        Collections.sort(sortedList);
        System.out.println("Print in lexicographic order using sorted list- "+sortedList);
    }
    public static void printSubsets( String input, String output ) {
        // Base condition
        if( input.length() == 0 ) {
            outputSet.add(output);
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
