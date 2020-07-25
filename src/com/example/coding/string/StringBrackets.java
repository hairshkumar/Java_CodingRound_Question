package com.example.coding.string;

public class StringBrackets {

	public static void main(String[] args) {
		isWellFormed("[[]]");
		isWellFormed("[[[]]]]");
	}

	public static void isWellFormed(String s) {
		int openBracket = countBracket(s, '[');
		int closeBracket = countBracket(s, ']');
		if (openBracket == closeBracket)
			System.out.println("Well Formed");
		else
			System.out.println("Not Well Formed");
	}

	public static int countBracket(String s, char bracket) {
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == bracket)
				count++;
		}
		return count;
	}
}
