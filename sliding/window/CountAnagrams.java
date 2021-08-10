package com.google.sliding.window;

import java.util.HashMap;
import java.util.Map;

public class CountAnagrams {
    public static void main( String args[] ) {
        String s1 = "forxxorfxdofr";
        String s2 = "for";
        System.out.println("Anagram count is : "+countAnagarm(s1,s2 ));
    }
    public static int countAnagarm( String s1, String s2) {
        int anagramCount = 0;
        int size1 = s1.length();
        int size2 = s2.length();
        Map<Character,Integer> map = new HashMap<Character,Integer>();

        for( int i=0; i < size2; i++) {
            Character c = s2.charAt(i);
            if( map.containsKey( c)) {
                Integer counter = map.get(c);
                map.put( c, ++counter);
            } else {
                map.put( c, 1);
            }
        }

        int i = 0;
        int j = 0;
        int count = map.size();
        while( j < size1 ) {
            int windowSize = j-i+1 ;
            Character c1 = s1.charAt(j);
            if( map.containsKey(c1)) {
                Integer counter = map.get(c1);
                map.put( c1, --counter);
                if( counter == 0)
                    count--;
            }
            if( windowSize < size2 )
                j++;
            else if( windowSize == size2) {
                if( count == 0)
                    anagramCount++;
                Character c2 = s1.charAt(i);
                if( map.containsKey( c2)) {
                    Integer counter = map.get(c2);
                    map.put( c2, ++counter);
                    if( counter > 0 )
                        count++;
                }
                i++;
                j++;
            }
        }
        return anagramCount;
    }
}

