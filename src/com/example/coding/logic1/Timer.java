package com.example.coding.logic1;

public class Timer {

	public static void main(String[] args) {
		toTime(5000);
		toTime(3600);
		toTime(7200);
	}

	static void toTime(int time) {
		System.out.print("Time "+time+" = ");
		int hour = time / 3600;
		int min = (time % 3600) / 60;
		int second = (time % 3600) % 60;
		System.out.printf("%d:%d:%d", hour, min, second);
		System.out.println();
	}
}
