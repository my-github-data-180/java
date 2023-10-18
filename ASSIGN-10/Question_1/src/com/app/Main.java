package com.app;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;
public class Main {

	public static void main(String[] args) {
	
		Scanner sc =new Scanner(System.in);
	   
		List<Books> list = new ArrayList<Books>(); 
	  	
		int choice;
		
		do {
		System.out.println("1.Add book in list ");
		System.out.println("2.Dispaly in forward order");
		System.out.println("3.Search book in with isbn");	
		System.out.println("4.Delete book at index");
	    System.out.println("5.Delete book at having isbn");
	    System.out.println("6.Reverse the list");
	    System.out.println("0.EXIT");
	    System.out.println("Enter the choice");
	     choice =sc.nextInt();
	    
	    switch(choice)
	    {
	    case 1:
	      Books b= new Books();                                   
	      b.acceptData();
	      if(list.contains(b)) {
	    	  int id= list.indexOf(b);
	    	 list.get(id).setQuantity(list.get(id).getQuantity()+b.getQuantity());
	      }
	      else
	    	  list.add(b);
	    	break;
	                                                             
	    	
	    case 2:
	      for(Books c:list)
	    	  System.out.println(c);
	    	break;

	    	
	    case 3:
	    	System.out.println("Enter the isbn of book");
	    	String n=sc.next();
	    	Books key =new Books();
	    	key.setIsbn(n);
	    	
	    	if(list.contains(key)) {
	    		System.out.println("book is found");
	    	 int i=list.indexOf(key);
	    	 Books l=list.get(i);
	    	 System.out.println(l);
	    	}
	    	else 
	    		System.out.println("book is not found");
	    	break;

	    	
	    case 4:
	    	System.out.println("Enter the index at which book to removed");
	    	int index=sc.nextInt();
	    	list.remove(index);
	    	break;

	    	
	    case 5:
	    	System.out.println("Enter the the isbn");
	    	String s = sc.next();
	    	Books r =new Books();
	    	r.setIsbn(s);
	    	list.remove(r);
	    	break;

	    
	    case 6:
	    	Collections.reverse(list);
	    
	    }
	    
		}while(choice!=0);
			
		
		
	}

}
