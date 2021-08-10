package com.google.sliding.window;

import java.util.Map;
import java.util.HashMap;

public class LongestSubstringWithKUnique {
    public static void main(String args[]) {
        String s = "aabacbbccaaebebeccc";
        int k = 3;
        System.out.println(" Longest substring size : " + longestSubstring(s, s.length(), k));
    }

    public static int longestSubstring(String s, int size, int k) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        int longest_Substring = Integer.MIN_VALUE;
        int i = 0;
        int j = 0;
        while (j < size) {
            char c = s.charAt(j);
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
            if (map.size() < k)
                j++;
            else if (map.size() == k) {
                int windowSize = j - i + 1;
                longest_Substring = Math.max(longest_Substring, windowSize);
                j++;
            } else if (map.size() > k) {
                while (map.size() > k) {
                    char c1 = s.charAt(i);
                    if (map.containsKey(c1)) {
                        int count = map.get(c1) - 1;
                        map.put(c1, count);
                        if (count == 0)
                            map.remove(c1);

                    }
                    i++;
                }
                j++;
            }
        }
        return longest_Substring;
    }
}