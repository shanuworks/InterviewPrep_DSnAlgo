package com.google.practisesets;

public class RotateArray4 {
	public static void main(String args[]) {
		int arr[] = new int[] { 1, 2, 3, 4, 5, 6, 7 };
		int k = 7;
		rotate(arr,  arr.length, k);
for(int i: arr) 
{
			System.out.print( i +" ");
		}
	}
	public static void rotate(int[] arr, int n, int k) {
		if(k == 0 || n == 0) 
			return;
		else if(k == n)
			return;
		else {
if(k > n)
				k = k % n;
			reverse(arr, 0, k);
			reverse(arr,k+1,n-1);
			reverse(arr,0,n-1);
		}				
	}
	public static void reverse(int[] arr, int start, int end) {
		int temp = 0;
		while(start < end) {
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}
}
