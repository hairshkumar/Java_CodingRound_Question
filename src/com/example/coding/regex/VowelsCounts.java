package com.example.coding.regex;

public class VowelsCounts {

	public static void main(String[] args) {
			vowelsCount("Jack has a cat");
			vowelsCount("lot of bugs in prod");			
	}

	static void vowelsCount(String str) {
		int lineSize=str.length();
		String pattern = "[aeiou]";
		int vowelsCount=lineSize-str.replaceAll(pattern, "").length();
		System.out.println(str+"has "+vowelsCount+" vowels");
	}
}
