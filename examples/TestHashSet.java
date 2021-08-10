package com.learning.examples;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class TestHashSet {

	public static void main(String[] args) {
		HashSet<List<Integer>> subSets = new HashSet<List<Integer>>();
		
		List<Integer> currentSet = new ArrayList<Integer>();
		currentSet.add(1);
		subSets.add(currentSet);
		
		System.out.println(subSets);
		
		currentSet.add(2);
		System.out.println(subSets);
	}

}
