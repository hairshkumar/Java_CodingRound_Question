package com.example.coding.string;

public class StringPalindrome {

	public static void main(String[] args) {
		isPalindrome("mom");
		isPalindrome("abba");
		isPalindrome("code");	
	}

	public static void isPalindrome(String str) {
		StringBuilder builder=new StringBuilder(str);
		if(str.equals(builder.reverse().toString()))
			System.out.println("String Palindrome "+str);
		else
			System.out.println("Not Palindrome "+str);
	}
}
