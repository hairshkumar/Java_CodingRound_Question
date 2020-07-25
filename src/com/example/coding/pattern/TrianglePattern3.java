package com.example.coding.pattern;

public class TrianglePattern3 {

	public static void main(String[] args) {
		downWardTriangle(5);
	}
	static void downWardTriangle(int n) {
		int i;
		for (i = n; i > 0; i--) {
			for (int j1 = i; j1 > 0; j1--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
