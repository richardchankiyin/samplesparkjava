package com.richard.app;

public class ReverseString {

	public String reverse(String input) {
		if (input == null) {
			return null;
		}
		int length = input.length();
		StringBuilder strB = new StringBuilder(length);
		for (int i = length - 1; i >= 0; i--) {
			strB.append(input.charAt(i));
		}
		return strB.toString();
	}
	
}
