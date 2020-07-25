package com.example.coding.collection;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

class Book{
	int bookid;
	String author;
	double price;
	
	public Book(int bookid, String author, double price) {
		this.bookid = bookid;
		this.author = author;
		this.price = price;
	}

	public int getBookid() {
		return bookid;
	}
	
	@Override
	public String toString() {
		return bookid + " " + author + "" + price;
	}	
}

class BookComparator implements Comparator<Book>{
    public int compare(Book b1, Book b2) {
        return b1.getBookid() - b2.getBookid();
    }
}

public class BookSet {

	Set<Book> books=new TreeSet<Book>(new BookComparator());
	void addBook(Book b) {
		if(!books.contains(b)) {
			books.add(b);
		}
	}
	
	void deleteBook(Book b) {
		if(books.contains(b)) {
			books.remove(b);
		}
	}
	
	void display() {
		Iterator<Book> iterator=books.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
	
	public static void main(String[] args) {
		BookSet set=new BookSet();
		set.addBook(new Book(1,"EndGames",500.00));
		set.addBook(new Book(3,"HarryPotter",1000.00));
		set.addBook(new Book(2,"Justice",500.00));
		set.addBook(new Book(4,"Flash",300.00));
		set.display();
	}
}
