package com.google.practisesets;

public class Merge {
	public static void main(String args[]) {
		int arr1[] = new int[] {0, 3, 4,31};
		int arr2[] = new int[] {4, 6, 30};
		int mergedArray[] = mergeArray(arr1, arr2);
		
		for(int i: mergedArray) 
		{
			System.out.print( i +" ");
		}
	}
	public static int[] mergeArray(int arr1[], int arr2[]) {
		int k =0;
		int i = 0;
		int j = 0;
		int result[] = new int[arr1.length + arr2.length] ;
		if(arr1.length == 0 && arr2.length != 0)
			return arr2;
		if(arr1.length != 0 && arr2.length == 0)
			return arr1;
		for( ; i< arr1.length && j < arr2.length ; ) {
			if(arr1[i] <= arr2[j] ) {
				result[k] = arr1[i];
				k++;
				i++;
			} else {
				result[k] = arr2[j];
				k++;
				j++;
			}	
		}
		while( i < arr1.length) {
			result[k] = arr1[i];
			i++;
			k++;
		}
		while(j < arr2.length) {
			result[k] = arr2[j];
			j++;
			k++;
		}
		return result;
	}
}

