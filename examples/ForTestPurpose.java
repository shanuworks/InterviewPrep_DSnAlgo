package com.learning.examples;

import java.util.List;

import com.google.common.collect.Lists;

public class ForTestPurpose {

	public static void main(String[] args) {
		List<String> lstGeofences = null;
		
		for(String s : lstGeofences) {
			System.out.println("Entry exists.");
		}
		System.out.println("Entry doesn't exists.");
		
		for(List<String> driverList : Lists.partition(lstGeofences, 100)) {
			
		}

	}

}
