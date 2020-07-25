package com.example.coding.collection;

import java.util.LinkedList;
import java.util.Queue;

public class MyQueue {

	Queue<Integer> queue = new LinkedList<>();

	public void insert(int x) {
		queue.add(x);
	}

	public void delete() {
		if (queue.size() >= 0) {
			int ele = queue.remove();
			System.out.println("Removed " + ele);
		}
	}

	public void display() {
		System.out.println(queue.toString());
	}

	public static void main(String[] args) {
		MyQueue queue = new MyQueue();
		queue.insert(1);
		queue.insert(2);
		queue.insert(3);
		queue.insert(4);
		queue.insert(5);
		queue.display();
		queue.delete();
		queue.display();
		queue.delete();
		queue.display();
	}
}
