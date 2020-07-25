package com.example.coding.loops;

public class Fibonacci {

	public static void main(String[] args) {
		fibnoacciSeries(0);
		fibnoacciSeries(5);
		fibnoacciSeries(10);
	}

	public static void fibnoacciSeries(int count) {
		int n1 = 0, n2 = 1, n3;
		System.out.print(n1 + " " + n2);
		for (int i = 2; i < count; ++i)
		{
			n3 = n1 + n2;
			System.out.print(" " + n3);
			n1 = n2;
			n2 = n3;
		}
		System.out.println();
	}
}
