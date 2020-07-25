package com.example.coding.array;

import java.util.Arrays;

public class ArrayOrder {

	public static void main(String[] args) {
		int[] n1 = { 1, 9, 4, 5, 6, 2, 3, 7, 8 };
		int[] even =new int[n1.length];
		int[] odd =new int[n1.length];
		int i = 0, j = 0;
		for (int element : n1) {
			if (element % 2 == 0) {
				even[i] = element;
				i++;
			} else {
				odd[j] = element;
				j++;
			}
		}
		System.out.println(Arrays.toString(even));
		System.out.println(Arrays.toString(odd));
	}
}
