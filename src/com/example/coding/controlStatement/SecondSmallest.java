package com.example.coding.controlStatement;

public class SecondSmallest {

	public static void main(String[] args) {
		secondNum(5,6,7);
		secondNum(1,2,3);
		secondNum(10,6,9);
	}
	static void secondNum(int a,int b,int c)
	{
		int second = Math.max(Math.min(a, b), Math.min(Math.max(a, b), c));
		System.out.println(second);
	}
}
