package com.example.coding.loops;

public class Factorial {

	public static void main(String[] args) {
		factorial(4);
		factorial(5);
		factorial(6);
	}

	public static void factorial(int num) {
		int factor=1;
		for (int i = 1; i <= num; i++) {
			factor *= i;
		}
		System.out.println(factor);
	}
}
