package com.google.practisesets;

public class LargestSum {
	public static void main(String args[]) {
int arr[] = new int[] { -2, -3, 4, -1, -2, 1, 5, 8, -3};
		int n = 8;
		findLargestSum(arr,  arr.length);
	}
	public static void findLargestSum(int arr[], int n) {
		int current_max = 0;
int largest_sum = Integer.MIN_VALUE;	
int start = 0, end = 0, s = 0;
for(int i=0; i< n; i++) {
	current_max = current_max + arr[i];
	if(current_max < 0) {
		current_max = 0;
		s = i +1;
	}
	else if( largest_sum < current_max) {
		largest_sum = current_max;
		start = s;
		end = i;
	}
}
System.out.println("Maximum Sum : "+largest_sum);
System.out.println("Start Index : "+start + " End Index : "+end);
}
}


