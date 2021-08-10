package com.google.practisesets;

public class LargestSum1 {
	public static void main(String args[]) {
int arr[] = new int[] { -2, -3, 4, -1, -2, 1, 5,-3};
		int n = 8;
		findLargestSum(arr,  arr.length);
	}
	public static void findLargestSum(int arr[], int n) {
		int current_max = arr[0];
int largest_sum = arr[0];	
int start = 0, end = 0, s=0;
for(int i=1; i< n; i++) {
	if( arr[i] >  current_max + arr[i] ) {
		current_max = arr[i];
		s = i;
	} else {
current_max = current_max + arr[i] ;
	}
	if(current_max > largest_sum ) {
		largest_sum = current_max;
		start = s;
		end = i;
	}
}
System.out.println("Maximum Sum : "+largest_sum);
System.out.println("Start Index : "+start);
System.out.println("End Index : "+end);
}
}



