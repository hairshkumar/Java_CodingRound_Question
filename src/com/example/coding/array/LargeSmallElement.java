package com.example.coding.array;

import java.util.Arrays;

public class LargeSmallElement {

	public static void main(String[] args) {
		int[] array1 = { 9,0,4,8,5,6,7 };
		//sort the array
		Arrays.sort(array1);
		int small=array1[0];
		int large=array1[array1.length-1];
		System.out.println("Smallest "+small);
		System.out.println("Largest "+large);
	}
}
