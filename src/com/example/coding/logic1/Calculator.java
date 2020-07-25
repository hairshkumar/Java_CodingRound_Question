package com.example.coding.logic1;

public class Calculator {

	public static void main(String[] args) {
		basicMaths(2,4);
	}
	
	public static void basicMaths(int num1,int num2) {
		System.out.println("Add "+(num1+num2));
		System.out.println("Sub "+(num1-num2));
		System.out.println("Div "+(num1/num2));
		System.out.println("Mul "+(num1*num2));
	}
}
