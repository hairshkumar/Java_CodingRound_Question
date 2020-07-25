package com.example.coding.collection;

import java.util.Stack;

public class PostFix {

	Stack<Integer> operands = new Stack<>();

	public void findpostFix(String str) {
		char[] charArr = str.toCharArray();

		for (char c : charArr) {

			if (Character.isDigit(c)) {
				operands.push(Character.getNumericValue(c));
			} else {
				if (!Character.isWhitespace(c)) {
					char symbol = c;
					int num1 = operands.pop();
					int num2 = operands.pop();
					int result = performOperation(symbol, num2, num1);
					operands.push(result);
				}
			}
		}
		System.out.println("Result of "+str+" is "+operands.pop());
	}

	public void display() {
		System.out.println(operands.toString());
	}

	private int performOperation(char symbol, int num1, int num2) {
		int result = 0;
		switch (symbol) {
		case '+':
			result = num1 + num2;
			break;
		case '-':
			result = num1 - num2;
			break;
		case '*':
			result = num1 * num2;
			break;
		case '/':
			result = num1 / num2;
			break;
		default:
			result = 0;
			break;
		}
		return result;
	}

	public static void main(String[] args) {
		PostFix fix = new PostFix();
		fix.findpostFix("22+");
		fix.findpostFix("2 3 * 1 - 5 /");
	}
}
