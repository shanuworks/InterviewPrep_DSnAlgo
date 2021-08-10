package com.google.practisesets;

public class Knapsack {
	public static void main(String args[]) {
		int wt[]  ={1, 8 , 3,  9}; 
		int val[] = {3, 2, 8, 7};
		int weight = 8;
		int size = 4;
		long start = System.currentTimeMillis();
		System.out.println("Maximum Profit : "+ maximizeProfit(wt, val, weight, size) );
		System.out.println("Total time taken : "+ (System.currentTimeMillis() - start)+" ms");
}
public static int maximizeProfit( int wt[], int val[], int w, int n) {
	if(w == 0 || n == 0) 
		return 0;
	if(wt[n-1] <= w) 
		return Math.max( val[n-1] + maximizeProfit(wt,val, w - wt[n-1], n-1) , maximizeProfit(wt,val,w,n-1));
else
	return maximizeProfit(wt,val,w,n-1);

}
}
