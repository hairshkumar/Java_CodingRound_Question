package com.example.coding.array;

public class SumOfArray {

	public static void main(String[] args) {
		float n[] = { 1F, 2f, 5f, 6f, 7f, 8f };
		System.out.println("Sum =" + sum(n));
	}

	//sum of array element
	public static float sum(float numbers[]) {
		float sum = 0;
		for (float number : numbers) {
			sum += number;
		}
		return sum;
	}
}