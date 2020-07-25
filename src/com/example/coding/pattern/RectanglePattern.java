package com.example.coding.pattern;

public class RectanglePattern {

	public static void main(String[] args) {
		pascalTriangle(5,5);
	}

	static void pascalTriangle(int r,int c) {

		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
