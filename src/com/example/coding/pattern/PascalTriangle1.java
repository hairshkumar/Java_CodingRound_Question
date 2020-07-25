package com.example.coding.pattern;

public class PascalTriangle1 {

	public static void main(String[] args) {
		pascalTriangle(5);
	}

	static void pascalTriangle(int n) {
		for (int i = 0; i <= n - 1; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*" + " ");
			}
			System.out.println("");
		}
		for (int i = n - 1; i >= 0; i--) {
			for (int j = 0; j <= i - 1; j++) {
				System.out.print("*" + " ");
			}
			System.out.println("");
		}
	}
}
