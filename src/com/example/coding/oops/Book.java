package com.example.coding.oops;

public class Book {

	private int id;
	private String name;
	private double price;

	public Book(int id, String name, double price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public double getPrice() {
		return price;
	}
	public static void main(String[] args) {
		Book book = new Book(1001, "JavaBasic", 120.20);
		System.out.println("Id: " + book.getId());
		System.out.println("Name: " + book.getName());
		System.out.println("Price: " + book.getPrice());
	}
}
