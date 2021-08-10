package com.learning.examples;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String args[]) {
		findGroups(;
	}
	private static findGroups(List<List<String>>  input) {
		

		List<String> groups = new ArrayList<String>();

		for(List<String> list : input) {
			if(!groups.contains(list.get(0)) || !groups.contains(list.get(1))) {
				groups.add(list.get(0));
				groups.add(list.get(1))
			}
		}
		return null;
	}
}


nokia -> Alcatel Lucent  Siemens ->


1. In the market, suppose, there are no of companies which are associated in pairs.  	Nokia -> Alcatel Lucent 	Nokia -> Siemens 	 	Walmart -> Flipkart 	Flipkart -> PhonePe 	Myntra->Flipkart 	Flipkart -> Jabong 	 	Uber -> Uber Eats  Uber Eats -> Zomato