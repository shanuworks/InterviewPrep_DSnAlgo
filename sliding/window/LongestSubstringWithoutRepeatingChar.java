package com.google.sliding.window;

import java.util.List;
import java.util.ArrayList;


public class LongestSubstringWithoutRepeatingChar {
    public static void main( String args[] ) {
        String s = "pwqrstwkewrks";
        System.out.println(" Longest substring size : "+ longestSubstring( s, s.length()));
    }
    public static int longestSubstring( String s, int size) {
        List<Character> list = new ArrayList<Character>();

        int longest_Substring = Integer.MIN_VALUE;
        int i = 0;
        int j = 0;
        while( j < size ) {
            char c = s.charAt(j);
            if( ! list.contains(c)) {
                list.add( c);
                longest_Substring = Math.max( longest_Substring, list.size() );
            } else {
                while( list.contains(c) ) {
                    char c1 = s.charAt(i);
                    if( list.contains(c1))
                        list.remove( Character.valueOf(c1) );
                    i++;
                }
                list.add( c);
            }
            j++;
        }
        return longest_Substring;
    }
}

