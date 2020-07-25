package com.example.coding.sorting;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr = new int[] { 1, 6, 9, 8, 7, 4, 2 };
		selectionSort(arr);
	}

	static void selectionSort(int arr[]) {
		System.out.println("Before Sorting");
		System.out.println(Arrays.toString(arr));
		int size=arr.length;
		for (int i = 0; i < size; i++) {
	        int min = arr[i];
	        int min_index = i;
	        for (int j = i+1; j < size; j++) {
	            if (arr[j] < min) {
	                min = arr[j];
	                min_index = j;
	            }
	        }
	        int temp = arr[i];
	        arr[i] = min;
	        arr[min_index] = temp;
	    }
		System.out.println("After Sorting");
		System.out.println(Arrays.toString(arr));

	}
}
