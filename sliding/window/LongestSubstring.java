package com.google.sliding.window;

import java.util.Arrays;

public class LongestSubstring {
    public static void main( String args[] ) {
        String s = "aabacbebebe";
        int k = 3 ;
        System.out.println(" Longest substring size : "+ longestSubstring( s, s.length(), k));
    }
    public static int longestSubstring( String s, int size, int k) {
        int countArr[] = new int[128];
        Arrays.fill(countArr,0);
        int count = 0;
        int longest_Substring = Integer.MIN_VALUE;
        int i = 0;
        int j = 0;
        while( j < size ) {
            char c = s.charAt(j);
            countArr[c]++;
            if( countArr[c] == 1 ) {
                count++;
            }
            if( count < k )
                j++;
            else if( count == k) {
                int windowSize = j-i+1 ;
                longest_Substring = Math.max( longest_Substring, windowSize );
                j++;
            } else if( count > k){
                while( count > k ) {
                    char c1 = s.charAt(i);
                    countArr[c1]--;
                    if(countArr[c1] == 0)
                        count--;
                    i++;
                }
                j++;
            }
        }
        return longest_Substring;
    }
}

