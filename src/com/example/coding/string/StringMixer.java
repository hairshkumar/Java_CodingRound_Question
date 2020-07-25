package com.example.coding.string;

public class StringMixer {

	public static void main(String[] args) {
		mixer("12","34567");
		mixer("abcd","efgh");
		mixer("takeme","back");
	}
	public static void mixer(String s1,String s2) {
		String temp="";
		for (int i = 0, j = 0; i < s1.length() || j < s2.length(); i++, j++) {
			if (i < s1.length())
				temp += s1.charAt(i);
			if (j < s2.length())
				temp += s2.charAt(j);
		}
		System.out.println(temp);
	}
}
