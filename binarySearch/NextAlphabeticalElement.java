package com.google.binarySearch;

public class NextAlphabeticalElement {
    public static void main(String args[]) {
        char arr[] = new char[]{'a', 'c', 'e', 'f','f', 'h'};
        char c = 'f';
        System.out.println("Next  char of "+c+" is : "+findNextChar(arr, c));
    }
    public static char findNextChar(char[] arr, char c) {
        int start = 0;
        int end = arr.length -1 ;
        char res ='#' ;
        while( start <= end ) {
            int mid = start + (end-start)/2;
            if( arr[mid] == c ) {
                start = mid+1;
            }
            else if( arr[mid] < c ) {
                start = mid+1;
            } else if(arr[mid] > c ){
                res = arr[mid];
                end = mid-1;
            }
        }
        return res;
    }
}
