package com.example.coding.string;

public class VowelsCount {

	public static void main(String[] args) {
		String str = "i love you 3000";
		int vowels = 0, consonants = 0, digits = 0, spaces = 0;
		str = str.toLowerCase();
		for (char ch:str.toCharArray()) {
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				++vowels;
			} else if ((ch >= 'a' && ch <= 'z')) {
				++consonants;
			} else if (ch >= '0' && ch <= '9') {
				++digits;
			} else if (ch == ' ') {
				++spaces;
			}
		}
		System.out.println("Vowels: " + vowels);
		System.out.println("Consonants: " + consonants);
		System.out.println("Digits: " + digits);
		System.out.println("White spaces: " + spaces);
	}
}
