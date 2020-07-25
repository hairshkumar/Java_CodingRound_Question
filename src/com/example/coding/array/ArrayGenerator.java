package com.example.coding.array;

import java.util.Arrays;

public class ArrayGenerator {

	public static void main(String[] args) {
		generateArray(7, 5);
	}
	static void generateArray(int value, int size) {
		int[] array = new int[size];
		for (int i = 1; i <= size; i++) {
			array[i - 1] = value * i;
		}
		System.out.println(Arrays.toString(array));
	}
}
