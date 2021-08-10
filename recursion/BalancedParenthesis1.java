package com.google.recursion;

import java.util.List;
import java.util.ArrayList;

public class BalancedParenthesis1 {
    static List<String> outputList = new ArrayList<String>();
    public static void main (String args[]) {
        int n = 3;
        System.out.println("Balanced Parenthesis for n : "+n+" are below : ");
        String output ="";
        int openB = n;
        int closedB = n ;
        findBalancedParanthesis(openB,closedB,output);
        System.out.println(outputList);
    }
    public static void findBalancedParanthesis(int openB, int closedB, String output) {
        if( openB == 0 && closedB == 0) {
            outputList.add(output);
            return;
        }
        if( openB != 0 ) {
            String output1= output+"(";
            findBalancedParanthesis(openB-1,closedB,output1);
        }
        if( closedB > openB) {

            String output1= output+")";
            findBalancedParanthesis(openB,closedB-1,output1);
        }
    }
}
