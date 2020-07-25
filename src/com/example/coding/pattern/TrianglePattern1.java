package com.example.coding.pattern;

public class TrianglePattern1 {

	public static void main(String[] args) {
		rightAngleTriangle(5);
	}

	static void rightAngleTriangle(int n) {
		int i, j;
		for (i = 0; i < n; i++) {
			for (j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
