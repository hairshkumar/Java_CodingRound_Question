package com.example.coding.logic1;

public class QuadraticEquation {

	public static void main(String[] args) {
		quadraticEqu(5,6,1);
	}
	static void quadraticEqu(double a,double b,double c) {	
		double root1, root2;
		double determinant = b * b - 4 * a * c;
		if (determinant > 0) {
			root1 = (-b + Math.sqrt(determinant)) / (2 * a);
			root2 = (-b - Math.sqrt(determinant)) / (2 * a);
			System.out.format("root1 = %.2f and root2 = %.2f", root1, root2);
		} else if (determinant == 0) {
			root1 = root2 = -b / (2 * a);
			System.out.format("root1 = root2 = %.2f;", root1);
		} else {
			double realPart = -b / (2 * a);
			double imaginaryPart = Math.sqrt(-determinant) / (2 * a);
			System.out.format("root1 = %.2f+%.2fi and root2 = %.2f-%.2fi", realPart, imaginaryPart, realPart,
					imaginaryPart);
		}
	}
}
