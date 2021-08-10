package com.google.sliding.window;

import java.util.Arrays;

public class CountNoOfAnagram {
    public static void main( String args[] ) {
        String s1 = "aabaabaa";
        String s2 = "aaba";
        System.out.println("Anagram count is : "+countAnagarm(s1,s2 ));
    }
    public static int countAnagarm( String s1, String s2) {
        int size1 = s1.length();
        int size2 = s2.length();
        int i = 0;
        int j = 0;
        int count = 0;
        StringBuilder word = new StringBuilder("");
        while( j < size1 ) {
            int windowSize = j-i+1 ;
            word.append(""+s1.charAt(j));
            if( windowSize < size2 )
                j++;
            else if( windowSize == size2) {
                if( isAnagram(word.toString(), s2 ))
                    count++;
                word = new StringBuilder(word.substring(1));
                i++;
                j++;
            }
        }
        return count;
    }
    public static boolean isAnagram( String s1, String s2 ) {
        if( s1.length() != s2.length() )
            return false;
        int[] charsCount = new int[128];
        Arrays.fill(charsCount, 0);
        for( int i=0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            charsCount[c]++;
        }
        for( int i=0; i < s2.length(); i++) {
            char c = s2.charAt(i);
            charsCount[c]--;
        }
        for( int i=0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            if( charsCount[c] != 0 ) {
                return false;
            }
        }
        return true;
    }
}
