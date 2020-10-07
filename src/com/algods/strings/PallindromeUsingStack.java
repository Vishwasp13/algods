package com.algods.strings;

import java.util.Stack;

public class PallindromeUsingStack {
	
	
	public static void main (String args[]) {
		System.out.println(checkPallindrome("Arora"));
	}
	
	public static boolean checkPallindrome(String input) {
		StringBuilder reversedString = new StringBuilder(input.length());
		Stack<Character> s = new Stack<>();
		input = input.toLowerCase();
		
		for(int i=0; i<input.length(); i++) {
			char value = input.charAt(i);
			if(value >= 'a' && value <= 'z' )
				s.push(value);
		}
		
		while(!s.isEmpty()) {
			reversedString.append(s.pop());
		}
		return input.equals(reversedString.toString());
	}

}
