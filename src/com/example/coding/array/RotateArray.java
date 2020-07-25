package com.example.coding.array;

import java.util.Arrays;

public class RotateArray {

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 6, 7 };
		System.out.println("Given Arrays " + Arrays.toString(array));
		rotate(array, 9);
	}

	static void rotate(int[] arr, int n) {
		for (int c = 0; c < n; c++) {
			int temp = arr[0];
			for (int i = 1; i <= arr.length - 1; i++) {
				arr[i - 1] = arr[i];
			}
			arr[arr.length - 1] = temp;
		}
		System.out.println("After Rotating" + n + " " + Arrays.toString(arr));
	}
}

//int[] tempa=Arrays.copyOfRange(arr,0,n);
//int[] rotate=Arrays.copyOfRange(arr,n,arr.length);
//int[] rotatedArray=new int[arr.length];
//System.arraycopy(rotate, 0, rotatedArray, 0,rotate.length);
//System.arraycopy(tempa, 0, rotatedArray, rotate.length, tempa.length);
//System.out.println(Arrays.toString(rotatedArray));
