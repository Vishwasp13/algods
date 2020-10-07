package com.algods.strings;

public class PallindromeUsingHalfCheck {
	public static void main (String args[]) {
		System.out.println(checkPallindrome("Arora"));
	}	
	public static boolean checkPallindrome(String s) {
		s= s.toLowerCase();
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i) != s.charAt(s.length() - (i+1)))
				return false;
		}
		return true;
	}
}