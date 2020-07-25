package com.example.coding.search;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		int[] arr = new int[] { 1, 6, 9, 8, 7, 4, 2 };
		findElement(arr, 8);
		findElement(arr, 2);
		findElement(arr, 10);
	}

	static void findElement(int arr[], int ele) {
		int found = binarySearch(arr, ele);
		if (found != -1)
			System.out.println(ele + " is At index " + found);
		else
			System.out.println(ele + " is not present");
	}

	static int binarySearch(int[] arr, int ele) {
		Arrays.sort(arr);
		int first = 0;
		int last = arr.length - 1;
		while (first <= last) {
			int mid = (first + last) / 2;
			if (arr[mid] == ele)
				return mid;
			else if (arr[mid] < ele)
				first = mid + 1;
			else
				last = mid - 1;
		}
		return -1;
	}
}
