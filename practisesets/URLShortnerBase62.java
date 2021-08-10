package com.google.practisesets;

public class URLShortnerBase62 {
	public static void main(String args[]) {
		System.out.println(base62(100000));
	}
	private static String base62(int x) {
		String s = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

		StringBuilder sb = new StringBuilder();
	    while (x != 0) {
	        sb.append(s.charAt((int)(x % 62)));
	        x /= 62;
	    }
	    while (sb.length() < 6) {
	        sb.append(0);
	    }
	    return sb.reverse().toString();
	}
}
