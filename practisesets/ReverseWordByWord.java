package com.google.practisesets;

public class ReverseWordByWord {
	
	public static void main(String args[]) {
		String s = "Alice in      the wonderland";
		System.out.println(reverseString(s));
	}
	
	public static String reverseString(String s) {

		String word[] = s.split("\\s+");
		StringBuilder sb = new StringBuilder("");
		for(int i=word.length-1  ; i >= 0 ; i--) { 
			sb.append(word[i]+" ");
		}
		return sb.toString();

	}
}
