package com.example.coding.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class PhoneBook {

	Map<String, Long> contacts = new HashMap<>();

	public void addNumber(String name, Long mobileNo) {
		if (!contacts.containsKey(name)) {
			contacts.put(name, mobileNo);
		}else {
			System.out.println("Already "+name+" exits");
		}
	}
	
	public void deleteNumber(String name)
	{
		if(contacts.containsKey(name)) {
			contacts.remove(name);			
		}else {
			System.out.println("Given "+name+" doesn't exits");
		}
	}
	public void Display()
	{
		 System.out.println("Name  MobileNo "); 
		 for (Entry<String, Long> entry : contacts.entrySet())  {
	            System.out.println(entry.getKey()+" "+entry.getValue());
		 } 
	}

	public static void main(String[] args) {
		PhoneBook book=new PhoneBook();
		book.addNumber("Jack",9840356029L);
		book.addNumber("Bat",61466006028L);
		book.addNumber("Super",9444534931L);
		book.addNumber("Captain",61466006111L);
		book.addNumber("Hulk",9444534999L);
		book.Display();
		book.deleteNumber("Super");
		System.out.println("After removing Super");
		book.Display();
	}
}