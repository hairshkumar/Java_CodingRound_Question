package com.example.coding.regex;

public class WordLetter {

	public static void main(String[] args) {
		keepletters("R!=:~0o0./c&}9k`60=y");
		keepletters("k&&e##e^^^p g00o!!ing&&");
	}

	static void keepletters(String str) {
		String letterOnly=str.replaceAll("[\\d\\W]", "");
		System.out.println(str);
		System.out.println("Meaning "+letterOnly);
	}
}
