package com.example.coding.oops;

public class ComplexNumber {

	int real;
	int imag;

	public ComplexNumber(int real, int imag) {
		this.real = real;
		this.imag = imag;
	}

	public static ComplexNumber complexMinus(ComplexNumber c1, ComplexNumber c2) {
		int creal = c1.real - c2.real;
		int cimag = c1.real - c2.imag;
		return new ComplexNumber(creal,cimag);
	}
	
	public void show() {
		System.out.printf("%d+%di",real,imag);
		System.out.println();
	}

	public static void main(String[] args) {
		ComplexNumber c1=new ComplexNumber(3,2);
		ComplexNumber c2=new ComplexNumber(1,7);
		c1.show();
		c2.show();
		System.out.println("Minus of above number");
		ComplexNumber.complexMinus(c1, c2).show();
	}
}
