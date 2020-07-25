package com.example.coding.sorting;

import java.util.Arrays;

public class InsertionSort {
	public static void main(String[] args) {
		int[] arr = new int[] { 11,14,18,16,19,15,13 };
		insertionSort(arr);
	}

	static void insertionSort(int arr[]) {
		System.out.println("Before Sorting");
		System.out.println(Arrays.toString(arr));
		int n = arr.length; 
        for (int i = 1; i < n; ++i) { 
            int key = arr[i]; 
            int j = i - 1; 
            while (j >= 0 && arr[j] > key) { 
                arr[j + 1] = arr[j]; 
                j-=1; 
            } 
            arr[j + 1] = key; 
        } 
		System.out.println("After Sorting");
		System.out.println(Arrays.toString(arr));
	}

}
