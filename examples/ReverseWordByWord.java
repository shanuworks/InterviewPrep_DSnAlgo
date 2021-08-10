package com.learning.examples;

public class ReverseWordByWord {
	
	public static void main(String args[]) {
		String s ="i like the program very much";
		
		System.out.println(reverseWord(s));
		System.out.println(reverseWords(s));

	}
	
	private static String  reverseWord(String s) {
		String wordArray[] = s.split(" ");
		StringBuffer result= new StringBuffer();
		for(int i=wordArray.length-1; i>=0;i--) {
			if(i==0)
				result.append(wordArray[i]);
			else
				result.append(wordArray[i]+" ");
		}
		return result.toString();
	}
	
	private static String reverseWords(String s) {
		String wordArray[] = s.split(" ");
		s = "";
		for(String word: wordArray) {
			s += new StringBuilder(word).reverse() + " ";
		}
		return new StringBuilder(s).reverse().toString();
		
	}

}
