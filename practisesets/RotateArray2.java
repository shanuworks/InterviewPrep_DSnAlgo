package com.google.practisesets;

public class RotateArray2 {
	public static void main(String args[]) {
		int arr[] = new int[] { 1, 2, 3, 4, 5, 6, 7 };
		int k = 24;
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
			while( k > 0) {
int temp = arr[n-1];
				for(int i = n-2 ; i >= 0 ; i--) {
					arr[i+1] = arr[i] ;
				}
				arr[0] = temp;
				k--;
			}
			return arr;
		}				
	}
}
