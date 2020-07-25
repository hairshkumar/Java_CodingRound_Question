package com.example.coding.array;

public class CommonElement {

	public static void main(String[] args) {
		int[] n1 = { 1, 3, 5, 7, 9 };
		int[] n2 = { 1, 7, 9, 11, 13 };
		findCommon(n1, n2);
	}

	public static void findCommon(int n1[], int n2[]) {
		for (int i = 0; i < n1.length; i++) {
			for (int j = 0; j < n2.length; j++) {
				if (n1[i] == n2[j])
					System.out.print(n2[j] + "\n");
			}
		}}
}
