package com.google.sliding.window;

import java.util.Map;
import java.util.HashMap;

public class LongestSubstringAllUniqueChar {
    public static void main( String args[] ) {
        String s = "pwqrsttuvvwwkewrks";
        System.out.println(" Longest substring size : "+ longestSubstring( s, s.length()));
    }
    public static int longestSubstring( String s, int size) {
        Map<Character,Integer> map = new HashMap<Character,Integer>();
        int longest_Substring = Integer.MIN_VALUE;
        int i = 0;
        int j = 0;
        while( j < size ) {
            char c = s.charAt(j);
            if( map.containsKey(c)) {
                map.put(c, map.get(c)+1);
            } else {
                map.put( c, 1);
            }
            if( map.size() < (j-i+1) ) {
                while( map.size() < (j-i+1) ) {
                    char c1 = s.charAt(i);
                    if( map.containsKey(c1)) {
                        int count = map.get(c1)-1;
                        map.put(c1, count);
                        if(count == 0)
                            map.remove(c1);

                    }
                    i++;
                }
                j++;
            } else if( map.size() == (j-i+1)) {
                longest_Substring = Math.max( longest_Substring, (j-i+1) );
                j++;
            }
        }
        return longest_Substring;
    }
}
