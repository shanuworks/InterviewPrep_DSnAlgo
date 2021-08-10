package com.google.practisesets;

public class LongestWord {
	public static void main(String args[]) {
		String s = "My name is Shanu NitinSoname ";
		System.out.println(longestWord(s));
	}
	public static String longestWord(String s) {
		String word[] = s.split(" ");
		int len = 0;
		int currentWordLen = 0;
		String longestWord = "";
for(int i=0; i<word.length ; i++) {
	currentWordLen  = word[i].length();
	if( len < currentWordLen) {
		len = currentWordLen;
		longestWord = word[i];
	}
		
}
return longestWord;
}
}
