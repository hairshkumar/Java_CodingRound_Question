package com.example.coding.string;

public class SumOfDigits {

	public static void main(String[] args) {
		sumOfDigits("a1b2c3");
		sumOfDigits("a13b13");
		sumOfDigits("sum");
		sumOfDigits("");
	}

	public static void sumOfDigits(String str) {
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i)))
				sum = sum + Character.getNumericValue(str.charAt(i));
		}
		System.out.println(sum);
	}
}
