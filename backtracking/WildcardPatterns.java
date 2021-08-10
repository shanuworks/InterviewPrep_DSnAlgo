package com.google.backtracking;

public class WildcardPatterns {
    public static void main (String args[]) {
        String input = "sum";
        String regex = "*";
        System.out.println("Given word "+input+ " matches the regex "+regex+" : " + checkPattern(input,regex,0,0));
    }
    public static boolean checkPattern(String word, String regex, int i, int j) {
        // Base condition
        if( i == word.length() && j == regex.length()) {
            return true;
        }
        if( i == word.length() ) { // for s=sum n regex=sum*****
            return checkforAllStar(regex, j);
        }
        if(j == regex.length()) {
            return false;
        }
        char c = regex.charAt(j);
        if( Character.isAlphabetic(c)) {
            if(word.charAt(i) == c){
                return checkPattern(word,regex,i+1,j+1);
            } else {
                return false;
            }
        } else if(c == '?') {
            return checkPattern(word,regex,i+1,j+1);
        } else if(c == '*') {
            return checkPattern(word,regex,i+1,j) || checkPattern(word,regex,i,j+1);
        }
        return false;
    }
    public static boolean checkforAllStar(String regex, int j){
        while( j < regex.length()) {
            if( regex.charAt(j) !='*')
                return false;
            j++;
        }
        return true;
    }
}
