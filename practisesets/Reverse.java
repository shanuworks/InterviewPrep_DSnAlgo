package com.google.practisesets;

public class Reverse {
	public static void main(String args[]) {
		String str = "My name is Shanu";
		System.out.println("Reversed String is:- "+ reverseString(str));
	}
	public static String  reverseString(String str) {
		StringBuilder strBuilder = new StringBuilder("");
		if(str != null ) {
			for(int i=str.length()-1; i>=0 ; i--) {
				strBuilder.append(str.charAt(i));
			}
		}
		return strBuilder.toString();
	}
}
