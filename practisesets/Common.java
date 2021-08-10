package com.google.practisesets;

import java.util.Arrays;

public class Common {
	private static int asciiList[] = new int[128];
	public static void main(String args[]) {
		Arrays.fill(asciiList, 0);
		char ch1[] = new char[] {'a','b','c','d','A'};
		char ch2[] = new char[] {'x','y','z','A'};
		System.out.println(containsCommonItem(ch1, ch2));
		for(int i=0; i < asciiList.length ; i++ ) {
			System.out.println(i+" " +(char)i + " "+ asciiList[i]);
		}
}
public  static boolean containsCommonItem(char ch1[], char ch2[]) {
	for(int i=0; i< ch1.length; i++) {
		asciiList[ch1[i]]++;
	}
for(int i=0; i< ch2.length; i++) {
	if(asciiList[ch2[i]] != 0) 
		return true;
}
return false;
}
}
