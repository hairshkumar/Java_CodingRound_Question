package com.example.coding.string;

public class MultiplyDigits {
	public static void main(String[] args) {
		multiplyDigits("12*12");
		multiplyDigits("1*12444");
		multiplyDigits("*1000");
	}

	public static void multiplyDigits(String s) {
		int index = s.indexOf('*');
		int num1 = 0, num2 = 0;
		if (!s.substring(0, index).isEmpty())
			num1 = Integer.parseInt(s.substring(0, index));
		if (!s.substring(index + 1).isEmpty())
			num2 = Integer.parseInt(s.substring(index + 1));
		System.out.println(num1 * num2);
	}
}
