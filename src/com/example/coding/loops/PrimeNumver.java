package com.example.coding.loops;

public class PrimeNumver {

	public static void main(String[] args) {
		prime(10);
		prime(20);
		prime(25);
	}

	static void prime(int n) {
		String primeNumbers = "";
		System.out.println("primeNumbers till "+n);
		int num=0;
		for (int i = 1; i <= n; i++) {
			int counter = 0;
			for (num = i; num >= 1; num--) {
				if (i % num == 0) {
					counter = counter + 1;
				}}
			if (counter == 2) {
				primeNumbers = primeNumbers + i + " ";
			}}
		System.out.println(primeNumbers);
	}
}
