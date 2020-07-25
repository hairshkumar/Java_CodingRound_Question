package com.example.coding.logic1;

public class SwapNumbers {

	public static void main(String[] args) {	
		swapMethod1(4, 5);
		swapMethod2(10, 12);
	}

	//Swapping using third variable
	public static void swapMethod1(int a, int b) {
		System.out.println("Before Swapping "+a+" "+b);
		int temp = a;
		a = b;
		b = temp;
		System.out.println("After Swapping "+a+" "+b);
	}
	
	//Swapping without using third variable
	public static void swapMethod2(int a, int b) {
		System.out.println("Before Swapping "+a+" "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After Swapping "+a+" "+b);
	}
}