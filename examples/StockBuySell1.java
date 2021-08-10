package com.learning.examples;

import java.util.*;  

public class StockBuySell1 { 
  
static int max_profit(int a[],int b[],int n,int fee) 
{ 
	b[0] = 0;
	b[1] = 1 ;
	int r = 1;
	int sum = 0;
	for( int i = n-1; i > 0; i--) {
		int l = 0;
		int profit = a[r] - a[l] - fee ;
		if(profit > 0) {
			sum = sum + profit;
		}
		
	}
  
return 0; 
} 
  
// Driver code 
public static void main(String args[]) 
{ 
    int arr[] = { 6, 1, 7, 2, 8, 4 }; 
    int n = arr.length; 
    int[] b = new int[2]; 
    int tranFee = 2; 
  
    max_profit(arr, b, n, tranFee); 
  
    System.out.println(b[0]+", "+b[1]); 
  
} 
} 