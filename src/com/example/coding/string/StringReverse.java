package com.example.coding.string;

public class StringReverse {

	public static void main(String[] args) {
		reverseString("tseb eht lla");
		reverseString("gninrael peek");
	}
	
	//Reversing of string way 1
	public static void reverse(String str) {
		String reversed="";
		for(int i=str.length()-1;i>=0;i--)
			reversed+=str.charAt(i);
		System.out.println(reversed);
	}

	//Reversing of string way 2
	public static void reverseString(String str) {
		StringBuilder s=new StringBuilder(str);
		String reversed=s.reverse().toString();
		System.out.println(reversed);
	}
}
