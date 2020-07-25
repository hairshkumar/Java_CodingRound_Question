package com.example.coding.array;

import java.util.Arrays;

public class ArrayComparsion {

	public static void main(String[] args) {
		int[] n1 = { 1, 3, 5, 7, 9 };
		int[] n2 = { 1, 3, 5, 7, 9 };
		System.out.println(isArrayEqual(n1,n2));		
		n1=new int[]{ 1, 3, 5, 7, 9 };
		n2=new int[]{ 1, 7,13 };
		System.out.println(isArrayEqual(n1,n2));
		n1=new int[]{ 1, 3, 5, 7, 9 };
		n2=new int[]{ 1, 7, 9, 11, 13 };
		System.out.println(isArrayEqual(n1,n2));
	}

	public static int isArrayEqual(int n1[], int n2[]) {
		if (Arrays.equals(n1, n2))
			return 1;
		else
			return -1;
	}
}