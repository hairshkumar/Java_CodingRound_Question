package com.example.coding.collection;

import java.util.Stack;

public class MyStack {
	Stack<Integer> stack = new Stack<>();

	public void push(int a) {
		stack.push(a);
	}

	public void pop() {
		if (stack.size() >= 0) {
			int ele = stack.pop();
			System.out.println("Removed " + ele);
		}
	}

	public void display() {
		System.out.println(stack.toString());
	}

	public static void main(String[] args) {
		MyStack stack = new MyStack();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		stack.display();
		stack.pop();
		stack.display();
		stack.pop();
		stack.display();
	}
}