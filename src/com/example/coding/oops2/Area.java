package com.example.coding.oops2;

public class Area {
	public int area(int size1, int size2) {
		return size1 * size2;
	}

	public double area(float radius) {
		return 3.14 * radius * radius;
	}

	public double area(float breadth, int height) {
		return 0.5 * breadth * height;
	}

	public double area(int breadth, float height) {
		return 0.5 * breadth * height;
	}

	public int area(int base1, int base2, int height) {
		return base1 * base2 * height;
	}

	public static void main(String[] args) {
		Area a = new Area();
		int square = a.area(10, 10);
		int rectangle = a.area(10, 15);
		double circle = a.area(5);
		double triangle = a.area(15, 25f);
		double equilateral = a.area(15f, 20);
		double trapezoid = a.area(10, 15, 20);
		
		System.out.println("Area of Square "+square);
		System.out.println("Area of rectangle "+rectangle);
		System.out.println("Area of circle "+circle);
		System.out.println("Area of triangle "+triangle);
		System.out.println("Area of equilateral "+equilateral);
		System.out.println("Area of trapezoid "+trapezoid);
		
	}
}
