package com.app;
import java.util.Objects;
import java.util.Scanner;

public class Books {
	private String  isbn;
	private double  price ;
	private  String Author_name;
	private int Quantity;
	
	public Books() {
		
	}
	public Books(String isbn, double price, String author_name, int quantity, Scanner sc) {
		super();
		this.isbn = isbn;
		this.price = price;
		Author_name = author_name;
		Quantity = quantity;
		this.sc = sc;
	}

	Scanner sc =new Scanner(System.in);
	public void acceptData() {
		System.out.println("enter book details");
		System.out.println("enter isbn:");
		this.isbn=sc.next();
		System.out.println("enter price:");
		this.price=sc.nextDouble();
		System.out.println("enter Author name:");
		this.Author_name=sc.next();
		System.out.println("enter Quantity:");
		this.Quantity=sc.nextInt();
		
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getAuthor_name() {
		return Author_name;
	}
	public void setAuthor_name(String author_name) {
		Author_name = author_name;
	}
	public int getQuantity() {
		return Quantity;
	}
	public void setQuantity(int quantity) {
		Quantity = quantity;
	}
	
	@Override
	public String toString() {
		return "Bookstore [isbn=" + isbn + ", price=" + price + ", Author_name=" + Author_name + ", Quantity="
				+ Quantity + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Books)) {
			return false;
		}
		Books other = (Books) obj;
		
		return Objects.equals(isbn, other.isbn);
	}
	

	

	

}
