package com.example.coding.search;

import java.util.Arrays;

public class JumpSearch {

	public static void main(String[] args) {
		int[] arr = new int[] { 1, 6, 9, 8, 7, 4, 2 };
		findElement(arr, 9);
		findElement(arr, 2);
		findElement(arr, 10);
	}

	static void findElement(int arr[], int ele) {
		int found = jumpSearch(arr, ele);
		if (found != -1)
			System.out.println(ele + " is At index " + found);
		else
			System.out.println(ele + " is not present");
	}

	static int jumpSearch(int arr[], int ele) {
		Arrays.sort(arr);
		int n = arr.length;
		int step = (int) Math.floor(Math.sqrt(n));
		int prev = 0;
		while (arr[Math.min(step, n) - 1] < ele) {
			prev = step;
			step += (int) Math.floor(Math.sqrt(n));
			if (prev >= n)
				return -1;
		}
		// Linear Search
		for (int i = prev; i < step; i++) {
			if (arr[i] == ele) {
				return i;
			}
		}
		return -1;
	}
}
