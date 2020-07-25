package com.example.coding.array;

import java.util.Arrays;

public class ArrayAscii {

	public static void main(String[] args) {
		String str="mom";
		byte[] asciiArray=str.getBytes();
		System.out.println("Using Build-in function");
		System.out.println(Arrays.toString(asciiArray));
		System.out.println("Using our function");
		getBytesArr(str);
	}
	
	public static void getBytesArr(String s) {
		byte[] b=new byte[s.length()];
		for(int i=0;i<s.length();i++) {
			b[i]=(byte)s.charAt(i);
		}
		System.out.println(Arrays.toString(b));
	}
}
