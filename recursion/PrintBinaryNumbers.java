package com.google.recursion;

import java.util.List;
import java.util.ArrayList;

public class PrintBinaryNumbers {
    static List<String> outputList = new ArrayList<String>();
    public static void main (String args[]) {
        int n = 4;
        System.out.println("All n : "+n+" digits binary numbers are below : ");
        String output ="";
        int oneC = 0;
        int zeroC= 0 ;
        findBinaryNumber(n,oneC,zeroC,output);
        System.out.println(outputList);
    }
    public static void findBinaryNumber(int n, int oneC, int zeroC, String output) {
        if( n == 0) {
            outputList.add(output);
            return;
        }
        String output1= output+"1";
        findBinaryNumber(n-1,oneC+1,zeroC,output1);
        if( oneC > zeroC ) { // We can check oneC != zeroC condition as well
            String output2= output+"0";
            findBinaryNumber(n-1,oneC,zeroC+1,output2);
        }
    }
}
