package com.google.practisesets;

public class Knapsack2 {
	private static int[][] t = new int[10][10];
	public static void main(String args[]) {
	int wt[]  =new int[] {1, 8 , 3,  9}; 
		int val[] = new int[] {3, 2, 8, 7};
		int weight = 8;
		int size = 4;
		long start = System.currentTimeMillis();
		System.out.println("Maximum Profit : "+maximizeProfit(wt, val, weight, size) );
System.out.println("Total time taken : "+ (System.currentTimeMillis() - start) +" ms");
	}
	public static int maximizeProfit( int wt[], int val[], int w, int n) 
	{
		for(int i = 0; i <= n ; i++) 
		{
			for(int j=0 ; j <= w ; j++) 
		{
				if(i ==0 || j== 0)
					t[i][j] = 0;
			}
		}
		for(int i = 1; i <= n ; i++) 
		{
			for(int j=1 ; j <= w ; j++) 
			{
				if(wt[i-1] <= j) 
					t[i][j] = Math.max(val[i-1] + t[i-1][j-wt[i-1]], t[i-1][j]);
				else 
					t[i][j] = t[i-1][j];
			}
		}
		return t[n][w];
	}
}
