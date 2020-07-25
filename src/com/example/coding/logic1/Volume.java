package com.example.coding.logic1;

import java.util.Scanner;

public class Volume {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Radius and height");
		double r = scan.nextDouble();
		double h = scan.nextDouble();
		double cylinder=3.14*r*r*h;
		double cone=(3.14*r*r*h)/3;
		System.out.println("Volume of cylinder "+cylinder);
		System.out.println("Volume of a cone"+cone);
		scan.close();
	}
}
