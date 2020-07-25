package com.example.coding.search;

import java.util.Arrays;

public class ExponentialSearch {
	public static void main(String[] args) {
		int[] arr = new int[] { 1, 6, 9, 8, 7, 4, 2 };
		findElement(arr, 8);
		findElement(arr, 2);
		findElement(arr, 10);
	}

	static void findElement(int[] arr, int ele) {
		int found = exponential(arr, ele);
		if (found>-1)
			System.out.println(ele + " is At index " + found);
		else
			System.out.println(ele + " is not present");

	}

	static int exponential(int arr[], int ele) {
		Arrays.sort(arr);
	    int range = 1;
	    int size=arr.length;
		if (arr[0] == ele) 
            return 0; 
         while (range < size && arr[range] <= ele){
            range = range*2; 
         }
      return Arrays.binarySearch(arr, range/2, Math.min(range,size), ele);
	}
}
