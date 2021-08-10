package com.google.practisesets;

public class RotateArray3 {
	public static void main(String args[]) {
		int arr[] = new int[] { 1, 2, 3, 4, 5, 6, 7 };
		int k = 3;
		int res[] = rotate(arr,  arr.length, k);
for(int i: res) 
{
			System.out.print( i +" ");
		}

	}
	public static int[] rotate(int[] arr, int n, int k) {
		if(k == 0 || n == 0) 
			return arr;
		else if(k == n)
			return arr;
		else {
if(k > n)
				k = k - n * (k/n);
			int temp[] = new int[k];
			int j = 0;
			for(int i = n-k ; i < n ; i++) {
				temp[j] = arr[i];
				j++;
			}
			 j = n-1;
for(int i = n-k-1; i >= 0 && j > 0  ; i--,j--) {
				arr[j] = arr[i];
			}
for(int i=0; i<temp.length;i++) {
	arr[i] = temp[i];
}
			return arr;
		}				
	}
}
