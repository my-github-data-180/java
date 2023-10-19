package com.app;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
      Scanner sc =new Scanner(System.in);		
    Map<String,Books> bookmap =new HashMap<String, Books>();
  
    int choice;
	do {
    	 System.out.println("1.Insert in map");
    	 System.out.println("2.Find in map");
    	 System.out.println("3.Display books");
    	 System.out.println("0.EXIT");
    	 System.out.println("enter choice ");
    	 choice =sc.nextInt();
    	
    	 switch(choice) {
    	 case 1:
    		 Books b =new Books();
    		 b.acceptData();
    		 bookmap.put(b.getIsbn(), b);
    		 break;

    	 case 2:
    		 System.out.println("Enter the book isbn");
    		 String s=sc.next();
    		Books B = bookmap.get(s);
    		System.out.println(B);
    		 break;
    		 
    	 case 3:
    		 Iterator<String> itr1=bookmap.keySet().iterator();
    		 Iterator<Books> itr2 = bookmap.values().iterator();
    		 while(itr1.hasNext() && itr2.hasNext()) {
    			System.out.println(itr1.next()+" -> "+itr2.next());	
    		 
    		 }
			
    	 }
    }while(choice!=0);
	}

}
