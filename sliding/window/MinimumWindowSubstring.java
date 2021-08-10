package com.google.sliding.window;

import java.util.Map;
import java.util.HashMap;

public class MinimumWindowSubstring {
    public static void main( String args[] ) {
        String s1 = "TOTMTAPTAT";
        String s2 = "TTA";
        System.out.println(" Minimum window substring : "+ minimumSubstring( s1, s2));
    }
    public static int minimumSubstring( String s1, String s2) {
        Map<Character,Integer> map = new HashMap<Character,Integer>();
        for(int i =0 ; i < s2.length(); i++) {
            char c = s2.charAt(i);
            if( map.containsKey(c)) {
                map.put(c, map.get(c)+1);
            } else {
                map.put( c, 1);
            }

        }
        return findMinSubstring(s1, s1.length(), map);
    }
    public static int findMinSubstring( String s, int size, Map<Character,Integer> map) {
        int min_Substring = Integer.MAX_VALUE;
        int mapSize = map.size();
        int i = 0;
        int j = 0;
        while( j < size ) {
            char c = s.charAt(j);
            if( map.containsKey(c)) {
                int count = map.get(c)-1;
                map.put(c, count);
                if(count == 0)
                    mapSize--;
            }
            if( mapSize > 0 )
                j++;
            else {
                int windowSize = j-i+1 ;
                min_Substring = Math.min( min_Substring, windowSize );

                while( mapSize == 0 ) {
                    char c1 = s.charAt(i);
                    if( map.containsKey(c1)) {
                        int count = map.get(c1)+1;
                        map.put(c1, count);
                        if(count > 0)
                            mapSize++;
                    }
                    i++;
                    if(  mapSize == 0 ) {
                        windowSize = j-i+1 ;
                        min_Substring = Math.min( min_Substring, windowSize );
                    }
                }
                j++;
            }
        }
        return min_Substring;
    }
}
