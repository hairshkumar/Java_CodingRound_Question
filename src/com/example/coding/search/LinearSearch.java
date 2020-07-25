package com.example.coding.search;

public class LinearSearch {

	public static void main(String[] args) {
		int[] arr = new int[] { 1, 6, 9, 8, 7, 4, 2 };
		findElement(arr, 8);
		findElement(arr, 2);
		findElement(arr, 10);
	}

	static void findElement(int arr[], int ele) {
		int found = linearSearch(arr, ele);
		if (found != -1)
			System.out.println(ele + " is At index " + found);
		else
			System.out.println(ele + " is not present");

	}

	static int linearSearch(int arr[], int ele) {
		int size = arr.length;
		for (int i = 0; i < size; i++) {
			if (arr[i] == ele) {
				return i;
			}
		}
		return -1;
	}
}
