package com.app;

import java.util.Comparator;

public class Bookcom implements Comparator<Book> {

	@Override
	public int compare(Book b1, Book b2) {
		int diff= Double.compare(b1.getPrice(),b2.getPrice());
		return diff;
	}

}
