package com.example.coding.search;

import java.util.Arrays;

public class InterpolationSearch {

	public static void main(String[] args) {
		int[] arr = new int[] { 1, 6, 9, 8, 7, 4, 2 };
		findElement(arr, 9);
		findElement(arr, 2);
		findElement(arr, 10);
	}

	static void findElement(int arr[], int ele) {
		int found = interpolation(arr, ele);
		if (found != -1)
			System.out.println(ele + " is At index " + found);
		else
			System.out.println(ele + " is not present");
	}

	static int interpolation(int[] arr, int ele) {
		int start = 0, end = (arr.length - 1);
		Arrays.sort(arr);
		while(start <= end && ele >= arr[start] 
				&& ele <= arr[end]) {
			if (start == end) {
				if (arr[start] == ele)
					return start;
				return -1;
			}
			int pos = start + (((end - start) / (arr[end] - arr[start]))
					* (ele - arr[start]));
			if (arr[pos] == ele)
				return pos;
			if (arr[pos] < ele)
				start = pos + 1;
			else
				end = pos - 1;
		}
		return -1;
	}
}
