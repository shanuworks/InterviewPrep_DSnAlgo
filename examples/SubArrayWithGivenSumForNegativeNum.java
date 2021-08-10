package com.learning.examples;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SubArrayWithGivenSumForNegativeNum {
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
		Map<Integer,Integer> map = new HashMap<Integer, Integer>();
	    int curr_sum = 0;
	    int start = 1;
	    for(int i = 0 ; i < n; i++) {
	    	curr_sum += arr[i];
	    	if(curr_sum - s == 0) {
	    		System.out.println(start+" "+(i+1));
	    		return;
	    	}
	    	if(map.containsKey(curr_sum-s)) {
	    		System.out.println((map.get(curr_sum-s)+2)+" "+(i+1));
	    		return;
	    	} 
	    	map.put(curr_sum, i);	
	    	
	    }
	    System.out.println("-1");
	}

}
