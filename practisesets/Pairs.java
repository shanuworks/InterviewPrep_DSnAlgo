package com.google.practisesets;

import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;
public class Pairs {
	public static void main(String args[]) {
		int num[] = new int[] {3, 8, 2, 6, 7, 9};
		int sum = 13;
		int res[] =findPair(num, sum);
System.out.println("Pairs : "+ res[0] +" "+ res[1]);
	}
public static int[] findPair(int[] arr, int sum) {
	int[] pairs = new int[2];
	Arrays.fill(pairs, -1);
	Set<Integer> hset = new HashSet<Integer>();
	for(int i=0; i<arr.length; i++) {
		if(arr[i] > sum)
			continue;
		else {
if(hset.contains(sum - arr[i])) {
pairs[0]= sum- arr[i]; 
pairs[1]= arr[i];
	return pairs;
} else {
	hset.add(arr[i]);
}
		}
	}
	return pairs;
}
}
