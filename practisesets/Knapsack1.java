package com.google.practisesets;

import java.util.Arrays;

public class Knapsack1 {
	
	private static int[][] t = new int[10][10];
	public static void main(String args[]) {
	int wt[]  =new int[] {1, 8 , 3,  9}; 
		int val[] = new int[] {3, 2, 8, 7};
		int weight = 8;
		int size = 4;
		for (int[]a : t) {
	        Arrays.fill(a, -1);
	    }
		long start = System.currentTimeMillis();
		System.out.println("Maximum Profit : "+maximizeProfit(wt, val, weight, size) );
		System.out.println("Total time taken : "+ (System.currentTimeMillis() - start) +" ms");
	}
	public static int maximizeProfit( int wt[], int val[], int w, int n) {
		if(w == 0 || n == 0) 
			return 0;
		if(wt[n-1] <= w ) {
			if(t[n][w] != -1)
				return t[n][w];
			else {
				t[n][w] = Math.max(val[n-1] + maximizeProfit(wt,val,w-wt[n-1],n-1), maximizeProfit(wt, val, w, n-1) );
				return t[n][w];

			}  		
		} else {
			t[n][w] = maximizeProfit(wt,val, w, n-1);
			return t[n][w];
		}
	}



}
