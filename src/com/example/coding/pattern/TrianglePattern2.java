package com.example.coding.pattern;

public class TrianglePattern2 {

	public static void main(String[] args) {
		leftAngleTriangle(5);
	}

	static void leftAngleTriangle(int n) {
		int i;
		for (i = 0; i < n; i++) {
			for (int j1 = (n-i-1); j1 > 0; j1--) {
				System.out.print(" ");
			}
			for (int j2 = 0; j2 <= i; j2++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
