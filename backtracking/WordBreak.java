package com.google.backtracking;

import java.util.List;
import java.util.ArrayList;

public class WordBreak {
    public static void main (String args[]) {
        String input = "heaven";
        List<String> dictionary = new ArrayList<String>();
        dictionary.add("hea");
        dictionary.add("a");
        dictionary.add("ab");
        dictionary.add("ven");

        System.out.print("Word : "+input+" can be segmented  into dictionary words : ");
        System.out.println(canBeSegmented(input,input.length(),0,0,dictionary));
    }
    public static boolean canBeSegmented(String word,int n,  int i, int j, List<String> dictionary) {
        // Base condition
        if( j == n ) {
            if( i == n) {
                return true;
            }
            return false;
        }
        if( dictionary.contains(word.substring(i,j+1))) {
            // Split if 2nd string is available in dictionary
            if(canBeSegmented(word,n,j+1,j+1,dictionary)) {
                return true; // split successful
            }
            // Do not split if 2nd string is not present in dictionary
            return canBeSegmented(word,n,i,j+1,dictionary);
        } else {
            return canBeSegmented(word,n,i,j+1,dictionary);
        }
    }
}
