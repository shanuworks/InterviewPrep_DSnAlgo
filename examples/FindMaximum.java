package com.learning.examples;

public class FindMaximum {
 /* For a given array arr[], 
     returns the maximum j-i such
    that arr[j] > arr[i] */
 int maxIndexDiff(int arr[], int n)
 {
	 int maxDiff = 0;
     for(int j=n-1; j > 0 ; j--){
         for(int i =0 ; i < j ; i++) {
             if(arr[i] <= arr[j] && maxDiff < (j-i)) {
                 maxDiff = j-i;
                 break;
             }
         }
     }
     return maxDiff;
 }

 /* Driver program to test above functions */
 public static void main(String[] args)
 {
     FindMaximum max = new FindMaximum();
     int arr[] = { 9, 2, 3, 4, 5, 6, 7, 8, 18, 0 };
     int n = arr.length;
     int maxDiff = max.maxIndexDiff(arr, n);
     System.out.println(maxDiff);
 }
}