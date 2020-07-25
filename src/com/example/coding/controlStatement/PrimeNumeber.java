package com.example.coding.controlStatement;

public class PrimeNumeber {

	public static void main(String[] args) {
		isPrime(3);
		isPrime(4);
		isPrime(17);
	}

	static void isPrime(int n) {
		int m=n/2;
		boolean prime=true;
		if (n == 0 || n == 1) {
			System.out.println(n + " is not prime number");
		} else {
			for (int i = 2; i <= m; i++) {
				if (n % i == 0) {
					System.out.println(n + " is not prime number");
					prime = false;
					break;
				}
			}
			if (prime){
				System.out.println(n + " is prime number");
			}
		}
	}
}
