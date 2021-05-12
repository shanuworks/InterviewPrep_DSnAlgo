package com.google.dp;

public class ScrambledString {
    public static void main( String args[]) {
        String a = "great";
        String b = "egeat";
        System.out.println("Both are scrambled : "+ checkIfSrambled(a,b));
    }
    public static boolean checkIfSrambled(String a, String b) {
        if( a.length() != b.length())
            return false;
        if( a.equals(b))
            return true;
        if( a.length() <= 1 || b.length() <= 1)
            return false;
        int n = a.length();
        boolean flag = false;
        for(int i= 1 ; i < n ; i++) {
            boolean condIfSwapped = checkIfSrambled(a.substring(0,i),b.substring(n-i,n)) && checkIfSrambled(a.substring(i,n),b.substring(0,n-i)) ;

            boolean condIfNotSwapped = checkIfSrambled(a.substring(0,i),b.substring(0,i)) && checkIfSrambled(a.substring(i,n),b.substring(i,n)) ;

            if(condIfSwapped || condIfNotSwapped ) {
                flag = true;
                break;
            }
        }
        return flag;
    }
}
