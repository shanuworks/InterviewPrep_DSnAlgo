/*
 * Given an array of integers and the absolute difference between two consecutive elements is 1 A [ ] = { -2, -1, 0, 1, 2, 1, 0, 1, 2, 3, 4, 5, 4, 3, 2, 1, 0, 1, 2, 3, 4 } Find the all A[ i ] where 
A[ i ] > A[ i - 1 ] AND A[ i ] > A[ i + 1 ] 
OR 
A[ i ] < A[ i - 1 ] AND A[ i ] < A[ i + 1 ] 
Output: 2, 0, 5, 0
 */

// -2 -1 0 1 2 1

//1 2 3 2 3 => 1 
/*
n=5
mid = 2
0 to 2
3 to 4

//o/p -> 2

-2 -1 0 1 2 1

low=3
high=5
mid = 4
*/

package com.google.practisesets;

public class TestProgram {

	public static void main(String[] args) {
		int[] arr= new int[] {6,5,4,3,2,1};
		
		int num = findLocalMinimaMaxima(arr, arr.length);
		System.out.println("Num :"+num);

	}
	private static int findLocalMinimaMaxima(int[] arr, int n) {
		if(n < 3)
			return -1;
		int low = 0;
		int high = n-1;
		while( low < high) {
			int mid = low + (high-low)/2 ;
			if( arr[mid] < arr[mid-1] ) {
				return arr[mid];
			} else if(arr[mid+1] < arr[mid]) {
				return arr[mid];
			} 
			if(arr[low] < arr[mid]) {
				low = mid+1;
			} else {
				high = mid ;
			}
		}		
		return -1;
		
	}
	
}

int binarySearch(int[] arr, int low, int high, int num) {
	if( low > high) {
		return -1;
	}
	int mid = low + high-low/2;
	if( arr[mid] == num) {
		return mid;
	} else if( num < arr[mid])
			return binarySearch(arr,low, mid-1,num);
	else
		return binarySearch(arr,mid+1, high,num);
}

int[] arr  arr[0]
character[] chars
int i;
