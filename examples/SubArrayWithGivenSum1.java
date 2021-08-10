package com.learning.examples;

import java.util.*;

public class SubArrayWithGivenSum1 {
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
	    int sum = arr[0];
	    int l =0 ;
        for(int j = l+1; j < n ; j++ ){
            sum += arr[j];           
            while (sum > s && l < n-1){
                sum -= arr[l];
                l++;
           }
            if(sum == s){
                System.out.println((l+1)+" "+(j+1));
                return;
            }
        }	
	    System.out.println("-1");
	}
}