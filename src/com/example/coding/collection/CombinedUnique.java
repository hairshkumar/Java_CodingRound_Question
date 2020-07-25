package com.example.coding.collection;

import java.util.ArrayList;
import java.util.List;

public class CombinedUnique {

	static void uniqueCharacter(String str) {
		List<Character> uniqueChar = new ArrayList<>();
		char[] characters = str.toCharArray();
		for (char c : characters) {
			if (!uniqueChar.contains(c)) {
				uniqueChar.add(c);
			}
		}
		System.out.print("UniqueCharacter Count in "+str);
		System.out.println(" "+uniqueChar.size());
	}

	public static void main(String[] args) {
		uniqueCharacter("hello"+"world");
	}
}
