package com.example.coding.array;

import java.util.Arrays;

public class ArraySearch {

	public static void main(String[] args) {
		int[] n1 = { 1, 6, 9, 8, 7, 4, 2 };
		System.out.println("Using LinearSearch");
		System.out.println(linearSearch(n1, 10));
		System.out.println(linearSearch(n1, 2));
		System.out.println("Using BinarySearch");
		System.out.println(linearSearch(n1, 11));
		System.out.println(linearSearch(n1, 6));

	}

	public static int linearSearch(int arr[], int key) {
		for (int element : arr) {
			if (element == key) {
				return 1;
			}
		}
		return -1;
	}

	public static int binarySearch(int arr[], int key) {
		Arrays.sort(arr);
		int index = Arrays.binarySearch(arr, key);
		if (index < 0)
			return -1;
		return 1;
	}
}
