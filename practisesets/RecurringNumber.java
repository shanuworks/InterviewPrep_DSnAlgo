package com.google.practisesets;
import java.util.HashSet;
import java.util.Set;
public class RecurringNumber {
	public static void main(String args[]) {
int arr[] = new int[] { 2, 5,1, 8, 3, 9, 11, 12, 4};
		int n = 9;
		firstRecurringNumber(arr,  arr.length);
	}
	public static void firstRecurringNumber(int arr[], int n) {
		Set set = new HashSet();
		for(int i=0;i<n;i++) {
			if(set.contains(arr[i])) {
				System.out.println("First Recurring Num :- " + arr[i]);
				break;
			} else 
				set.add(arr[i]);

		}
	}
}
