package com.google.strings;

public class PalindromeCheck {
    public static void main(String args[]) {
        String s1 = "dacb1ad";
        String s2 = "Racecar";
        String s3 = "hello";

        System.out.println("\""+s1 +"\"  is palindrome - "+ isPalindrome(s1));
        System.out.println("\""+s2 +"\"  is palindrome - "+ isPalindrome(s2));
        System.out.println("\""+s3 +"\"  is palindrome - "+ isPalindrome(s3));
    }
    public static boolean isPalindrome(String s){
        boolean isPalindrome = false;
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            while(i < s.length() && !((s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') || (s.charAt(i) >= 'a' && s.charAt(i) <= 'z'))) {  // can use Character.isAlphabetic(s.charAt(i))
                i++;
            }
            while( j >= 0 && ! Character.isAlphabetic(s.charAt(j))) {
                j--;
            }
            if( i < j) {
                isPalindrome = true;
                if(Character.toLowerCase(s.charAt(i)) == Character.toLowerCase(s.charAt(j))) {
                    i++;
                    j--;
                } else
                    return false;
            }
        }
        return isPalindrome;
    }
}
