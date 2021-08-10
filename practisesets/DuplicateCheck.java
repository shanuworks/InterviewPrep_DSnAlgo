package com.google.practisesets;
import java.util.Set;
import java.util.HashSet;
public class DuplicateCheck {
	public static void main(String args[]) {
		int arr[] = new int[] { 1, 2, 4, 6, 5, 0, 7, 8, 9 };
		System.out.println("Contains Duplicate : "+duplicateCheck(arr,  arr.length));
	}
	public static boolean duplicateCheck(int arr[], int n) {
		Set set = new HashSet();
		for(int i=0; i<n; i++) {
			if(set.contains(arr[i]))
return true;
else
set.add(arr[i]); 
		}	
		return false;
	}
}

