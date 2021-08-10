package com.google.practisesets;

import java.util.Arrays;

public class MS2 {

	public static void main(String[] args) {
		Object[] myobjects = {new Integer(12), new String("foo"), new Integer(5), new Boolean(true)};
		Arrays.sort(myobjects);
		
		for(int i = 0; i < myobjects.length; i++) {
			System.out.print(myobjects[i].toString());
			System.out.print(" ");
		}
	}
}
