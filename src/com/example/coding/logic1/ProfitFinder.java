package com.example.coding.logic1;

import java.util.Scanner;

public class ProfitFinder {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter ActualCost");
		double price = s.nextDouble();
		System.out.println("Enter SellingCost");
		double selling = s.nextDouble();
		double gain;
		double gainperc;
		if (selling > price) {
			gain = selling - price;
			gainperc = (gain / price) * 100;
			System.out.println("Profit = " + gain);
			System.out.println("Profit% = " + gainperc);
		} else if (selling < price) {
			gain = selling - price;
			gainperc = (gain / price) * 100;
			System.out.println("Loss = " + gain);
			System.out.println("Loss% = " + gainperc);
		} else {
			System.out.println("Neither profit nor loss");
		}
		s.close();
	}
}