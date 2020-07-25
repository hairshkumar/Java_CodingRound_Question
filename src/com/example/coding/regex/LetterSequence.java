package com.example.coding.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LetterSequence {

	public static void main(String[] args) {
		fourLetter("This is my code");
	}

	static void fourLetter(String str) {
		System.out.println("4-Letter Sequence in "+str);
		String regex = "([a-zA-Z]{4})";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(str);
		while (m.find()) {
			System.out.println(m.group());
		}
	}
}
