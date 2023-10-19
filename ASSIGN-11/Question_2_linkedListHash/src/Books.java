

import java.util.Objects;
import java.util.Scanner;

public class Books {
	private String  isbn;
	private double  price ;
	private  String Author_name;
	private int Quantity;
	
	public Books() {
		
	}
	public Books(String isbn, double price, String author_name, int quantity) {
		super();
		this.isbn = isbn;
		this.price = price;
		Author_name = author_name;
		Quantity = quantity;
		
	}

	Scanner sc =new Scanner(System.in);
	public void acceptData() {
		Sy stem.out.println("enter book details");
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
	public int hashCode() {
		return Objects.hash(isbn);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Books other = (Books) obj;
		return Objects.equals(isbn, other.isbn);
	}
	

	

	

}

