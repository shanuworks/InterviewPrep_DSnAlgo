package com.learning.examples;

public class ShortestMidPointDistance {
	
	final static String _distance;
	static{
		StringBuilder sb = new StringBuilder();
		sb.append("Hi this is shanu I am working with Azuga at graphics ");
		sb.append("Before Azuga I worked with GlobalLogic ");
		sb.append("I was deployed at google location in GlobalLogic ");
		sb.append("graphics few are miss location at ");
		sb.append("new few graphics work location bangalore at ");
		sb.append("family time graphics shanu in at.");
		_distance = sb.toString();
	}
	
	public static void main(String args[]) {
		findMinimumDistance(_distance,"at","graphics");
	}
	
	public static void findMinimumDistance(String distance, String word1, String word2) {
		double shortest = distance.length();
		double word1Loc = 0;
		double word2Loc = 0;
		int index =0;
		String words[] = distance.split(" ");
		for(String word: words) {
			boolean match = false;
			if(word.equalsIgnoreCase(word1)) {
				match = true;
				index++;
				word1Loc = index + (word.length()/2);
			} else if(word.equalsIgnoreCase(word2)) {
				match = true;
				index++;
				word2Loc = index + (word.length()/2);
			}
			if(word1Loc > 0 && word2Loc > 0) {
				double current = word2Loc - word1Loc;
				if(current < shortest) {
					shortest = current;
				}
			}
			if(index != 0 && !match) {
				index = index + word.length()+1;
			} else {
				index += word.length();
			}
		}
		System.out.println("Shortest :: "+shortest);
		
	}

}
