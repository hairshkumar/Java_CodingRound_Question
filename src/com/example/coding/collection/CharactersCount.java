package com.example.coding.collection;

import java.util.HashMap;
import java.util.Map;

public class CharactersCount {

	static void characterCount(String str) {
		Map<Character, Integer> charMap = new HashMap<>();
		char[] charArr=str.toCharArray();
		for(char c:charArr)
		{
			if(charMap.containsKey(c))
			{
				int value=charMap.get(c);
				charMap.put(c,++value);
			}else {
				charMap.put(c, 1);
			}
		}
		System.out.println(str+" Contains "+charMap.toString());
	}
	public static void main(String[] args) {
		characterCount("abbcccdddd");
		characterCount("helloworld");
		characterCount("233444");
	}
}
