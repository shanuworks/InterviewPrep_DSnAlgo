package com.learning.examples;

import java.util.*;

public class SubArrayWithGivenSum {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		if(sc.hasNext()) {
		    int t = sc.nextInt();
		
		    while (t > 0 && t >= 1 && t <= 100) {
		        int n = sc.nextInt();
		        int s = sc.nextInt();
		        int arr[] = new int[n];
		    
		        for(int i=0; i < n ; i++){
		            arr[i] = sc.nextInt();
		        }
		        subArrayWithGivenSum(arr, n, s);
		        t--;
		    }
	    }
	}
	private static void subArrayWithGivenSum(int arr[], int n, int s){
	    if(arr[0] == s){
	        System.out.println("1 1");
	        return;
	    }
	    for(int i=0; i<n-1; i++ ){
	    	int sum = arr[i];
	        for(int j = i+1; j < n ; j++ ){
	            sum += arr[j];
	            if(sum == s){
	                System.out.println((i+1)+" "+(j+1));
	                return;
	            }
	            while (sum > s && i < n-1){
	                sum -= arr[i];
	                i++;
	                if(sum == s){
	                    System.out.println((i+1)+" "+(j+1));
	                    return;
	                }
	           }
	        }
	    }
	     System.out.println("-1");
	}
}