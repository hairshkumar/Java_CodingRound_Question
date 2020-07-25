package com.example.coding.sorting;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = new int[] { 1, 6, 9, 8, 7, 4, 2 };
		bubbleSort(arr);
	}

	static void bubbleSort(int arr[]) {
		System.out.println("Before Sorting");
		System.out.println(Arrays.toString(arr));
		int size = arr.length;
		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("After Sorting");
		System.out.println(Arrays.toString(arr));

	}
}
