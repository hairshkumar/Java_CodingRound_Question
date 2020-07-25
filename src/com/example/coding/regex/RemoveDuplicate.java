package com.example.coding.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RemoveDuplicate {

	public static void main(String[] args) {
		removeDuplicateWord("Coding Coding is fun");
		removeDuplicateWord("byb byb jack");
	}

	static void removeDuplicateWord(String str) {
		String regex = "\\b(\\w+)\\s+\\1\\b";
		Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
		Matcher m = p.matcher(str);
		while (m.find()) {
			str = str.replaceAll(m.group(), m.group(1));
		}
		System.out.println(str);
	}
}
