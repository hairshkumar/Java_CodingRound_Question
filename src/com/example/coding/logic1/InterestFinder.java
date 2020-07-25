package com.example.coding.logic1;

import java.util.Scanner;

public class InterestFinder {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Principal");
		double p = s.nextDouble();
		System.out.println("Enter Rate");
		double r = s.nextDouble();
		System.out.println("Enter Time");
		double t = s.nextDouble();
		double si = (p * r * t) / 100;
		double ci = (p * ((1 + (r / 100)) * t - 1));
		System.out.println("Simple Interest = " + si);
		System.out.println("Compound Interest = " + ci);
	}
}
