package com.app;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

public class Main {

	public static void main(String[] args) {
			
			
				Scanner sc =new Scanner(System.in);
			   
				List<Book> list = new ArrayList<Book>(); 
			  	
				int choice;
				
				do {
				System.out.println("1.Add book in list ");
				System.out.println("2.Dispaly in forward order");
				System.out.println("3.Delete book in given index");	
				System.out.println("4.To check book presence (with use isbn)");
			    System.out.println("5.Delete all books");
			    System.out.println("6.Display number of books");
			    System.out.println("7.Sort books by price in desc order");
			    System.out.println("0.EXIT");
			    System.out.println("Enter the choice");
			     choice =sc.nextInt();
			    
			    switch(choice)
			    {
			    case 1:
			      Book b= new Book();                                   
			      b.acceptData();
			    	list.add(b);
			    	break;
			                                                             
			    	
			    case 2:
			      for(Book c:list)
			    	  System.out.println(c);
			    	break;

			    	
			    case 3:
			    	System.out.println("Enter the index");
			    	int n=sc.nextInt();
			    	list.remove(n);
			    	
			    	break;

			    	
			    case 4:
			    	System.out.println("Enter the the isbn");
			    	String s = sc.next();
			    	Book r =new Book();
			    	r.setIsbn(s);
			    	if(list.contains(r)) {
			    	System.out.println("Book is found");
			    	int i=list.indexOf(r);
			    	Book k=list.get(i);
			    	System.out.println(k);
			    	}
			    	else
			    	System.out.println("Book is not found");
			    	break;

			    	
			    case 5:
			    	list.clear();
			    	break;
			    	
			    	
			    case 6:
			    	int num=list.size();
			        System.out.println("Number of books :"+num);
			        break;
			    	
			    case 7:
			    	Bookcom bcomp =new Bookcom();
			    	list.sort(bcomp);;
			    	
			    }
			    
				}while(choice!=0);
					
				
				
			}

		}

	}

}
