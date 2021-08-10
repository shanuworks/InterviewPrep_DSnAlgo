package com.google.practisesets;

public class MoveZeros {
	public static void main(String args[]) {
		int arr[] = new int[] { 0, 2, 0, 0, 5, 8, 0,0,0,0, 7, 8, 0,0 };
		moveZeros(arr,  arr.length);
for(int i: arr) 
{
			System.out.print( i +" ");
		}
	}
	public static void moveZeros(int[] arr, int n) {
		int count = 0;
		for(int i=0; i<n ;i++) {
			if(arr[i] != 0) {
				if(arr[i] != arr[count])
					arr[count] = arr[i];
				count++;
			}
		}
		while(count < n)
			arr[count++] = 0;
	}
}
