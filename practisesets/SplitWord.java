package com.google.practisesets;

import java.util.ArrayList;
import java.util.List;

public class SplitWord {

	public static void main(String[] args) {
		
		List<String> dictionary = new ArrayList<String>();
		dictionary.add("apple");
		dictionary.add("pen");
		dictionary.add("applepen");
		dictionary.add("pine");
		dictionary.add("pineapple");
		
		String s = "pineapplepenapple";
		
		List<String> result = new ArrayList<String>();

		splitWord(dictionary,s,s.length(), result,0,0);
	}
	
	public static void splitWord(List<String> dictionary, String word, int n, List<String> currentList, int i , int j){
		// Base condition
		if( j == n ) {
			if( i == n) {
				System.out.println(currentList);
				return;
			} else {
				return;
			}
		} 
		if( j > n) {
			return;
		}
		String currWord = word.substring(i,j+1);
		if(dictionary.contains(currWord)) {
			currentList.add(currWord);
			splitWord(dictionary,word,n,currentList,j+1,j+1); //
			
			currentList.remove(currWord);
			splitWord(dictionary,word,n,currentList,i,j+1);
				
		} else {
			splitWord(dictionary,word,n,currentList,i,j+1);
		}
	}
}