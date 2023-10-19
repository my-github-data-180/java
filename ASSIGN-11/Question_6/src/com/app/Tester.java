package com.app;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		 Scanner sc =new Scanner (System.in);
		 
		 Map<Integer, Students> student =new LinkedHashMap<Integer, Students>();
		 
           int choice;
           do {
        	   System.out.println("1.Add student");
        	   System.out.println("2.To search student");
        	   System.out.println("0.Exit");
        	   System.out.println("Enter choice");
        	   choice=sc.nextInt();
               
        	   switch(choice)
        	   {
        	   case 1:
        		   Students stu =new Students();
        		   stu.acceptData();
        		   student.put(stu.getRollno(), stu);
        		   break;
        		   
        	   case 2:
        		  System.out.println("Enter rollno of student");
        		  int id =sc.nextInt();
        		  Students s= new Students();
        		  s=student.get(id);
        		  System.out.println(s);
        
        	   }
           }while(choice!=0);
	}

}
