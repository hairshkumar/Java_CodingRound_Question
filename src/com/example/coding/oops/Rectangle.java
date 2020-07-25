package com.example.coding.oops;

public class Rectangle {

	int width;
	int length;
	
	Rectangle(int w,int l){
		width=w;
		length=l;
	}
	
	public void perimeter() {
		System.out.println("Perimeter ="+(width*length));
	}
	public void area() {
		System.out.println("Area ="+((width+length)*2));
	}
	
	public static void main(String[] args) {
		Rectangle r=new Rectangle(10,20);
		r.perimeter();
		r.area();
	}
}
