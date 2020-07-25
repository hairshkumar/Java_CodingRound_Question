package com.example.coding.string;

public class StringGenerator {

	public static void main(String[] args) {
		generator("abc",4);
		generator("Hi",2);
		generator("hello",1);
	}

	public static void generator(String str, int n) {
		String temp = "";
		for (int i = 0; i < n; i++) {
			temp = temp.concat(str);
		}
		System.out.println(temp);
	}
}
