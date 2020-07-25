package com.example.coding.array;

public class ThreeSum {

	public static void main(String[] args) {
		int n[] = { 1, 2, 4, 5, 6 };
		int sum = 0;
		int size = n.length;
		if (size % 2 != 0) {
			sum = n[0] + n[size / 2] + n[size - 1];
		} else {
			sum = n[0] + n[size - 1];
		}
		System.out.println("Sum = " + sum);
	}
}
