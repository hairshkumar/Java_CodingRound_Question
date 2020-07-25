package com.example.coding.array;

import java.util.Arrays;

public class ArrayReverse {

	public static void main(String[] args) {
		int[] array1 = { 1, 3, 5, 7, 9 };
		reverse(array1);
		int[] array2 = { 2, 4, 6, 8, 10 };
		reverse(array2);
	}

	public static void reverse(int n[]) {
		int[] n2 = new int[n.length];
		int size = n.length - 1;
		for (int i = size, j = 0; i >= 0 && j < size; i--, j++) {
			n2[j] = n[i];
		}
		System.out.println(Arrays.toString(n2));
	}
}
