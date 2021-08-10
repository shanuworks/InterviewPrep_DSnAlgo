package com.google.backtracking;

public class ValidateIPAddress {
    public static void main (String args[]) {
        String input = "1902426";
        System.out.println("All valid IP address for  : "+input+" are below : ");
        printIPAddress(input,input.length());
    }
    public static void printIPAddress(String input, int n) {
        // We have to add 3 dots to construct IPV4 address
        // First dot will go till n-4, second will go till n-3 and third till n-2
        for(int i=0; i <= n-4 ; i++ ) {
            for( int j = i+1; j <= n-3 ; j++) {
                for( int k = j+1 ; k <= n-2 ; k++) {
                    if(isValidIP(input, n, i, j, k)) {
                        StringBuilder sb = new StringBuilder(input);
                        sb.insert(i+1,'.'); // after i
                        sb.insert(j+2,'.'); // after j => as . is introduced after i
                        sb.insert(k+3,'.');
                        System.out.println(sb.toString());
                    }
                }
            }
        }
    }
    public static boolean isValidIP(String input, int n,int i, int j, int k) {
        String firstPart = input.substring(0, i+1);
        String secondPart = input.substring(i+1, j+1);
        String thirdPart = input.substring(j+1, k+1);
        String fourthPart = input.substring(k+1, n);

        if( (firstPart.length() > 0 && firstPart.length() <= 3 ) &&
                (secondPart.length() > 0 && secondPart.length() <= 3) &&
                (thirdPart.length() > 0 && thirdPart.length() <= 3) &&
                (fourthPart.length() > 0 && fourthPart.length() <= 3)) {
            if(( Integer.parseInt(firstPart) >= 0 && Integer.parseInt(firstPart) <= 255 ) && ( Integer.parseInt(secondPart) >= 0 && Integer.parseInt(secondPart) <= 255 ) &&
                    ( Integer.parseInt(thirdPart) >= 0 && Integer.parseInt(thirdPart) <= 255 ) &&
                    ( Integer.parseInt(fourthPart) >= 0 && Integer.parseInt(fourthPart) <= 255 )) {
                if( (firstPart.charAt(0) == '0' && firstPart.length() != 1) ||
                        (secondPart.charAt(0) == '0' && secondPart.length() != 1) ||
                        (thirdPart.charAt(0) == '0' && thirdPart.length() != 1) ||
                        (fourthPart.charAt(0) == '0' && fourthPart.length() != 1)) {
                    return false;
                }
                return true;
            }


        }
        return false;
    }
}
