package com.example.coding.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DuplicateElement {

	static void removeDuplicate(int[] arr) {
		System.out.println(Arrays.toString(arr));
		List<Integer> duplicate = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			if (!duplicate.contains(arr[i])) {
				duplicate.add(arr[i]);
			}
		}
		Collections.sort(duplicate);
		Integer result[]=new Integer[duplicate.size()];
		result=duplicate.toArray(result);
		System.out.println("Removed Duplicate "+Arrays.toString(result));
	}

	public static void main(String[] args) {
		int[] arr = { 1, 4, 4, 4, 4, 4, 3, 2, 1, 2 };
		removeDuplicate(arr);
	}
}
