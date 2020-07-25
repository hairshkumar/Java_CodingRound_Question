package com.example.coding.logic1;

public class TemperatureConverter {

	public static void main(String[] args) {
		double fahrenheit = 98.6;
		double celsius = 90.0;
		System.out.println("Fahrenheit to Celsius");
		findCelsius(fahrenheit);
		System.out.println("Celsius to Fahrenheit");		
		findFahrenheit(celsius);
	}
	//Fahrenheit to Celsius degree
	public static void findCelsius(double f) {
	double c=((f - 32) * 5) / 9;
	System.out.println("F= "+f+" to C="+c);
	}	
	//Celsius to Fahrenheit degree
	public static void findFahrenheit(double c) {
		double f=((c*9)/5)+32;
		System.out.println("C= "+c+" to F="+f);
	}	
}
