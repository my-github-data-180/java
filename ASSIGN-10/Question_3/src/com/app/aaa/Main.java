package com.app.aaa;
import java.util.LinkedList;
import java.util.Scanner;



import java.util.Arrays;
import java.util.Comparator;

public class Main {
	
	public static void main(String [] args) {
	
	Scanner sc =new Scanner(System.in);
	
	LinkedList<Employeelist> Emplist =new LinkedList<Employeelist>();
	
	
	int choice;
	do
	{
		
		System.out.println("1.Add employee");
		System.out.println("2.Delete employee");
		System.out.println("3.Find employee");
		System.out.println("4.Sort employee");
		System.out.println("5.Edit/Upate employee");
		System.out.println("Enter the choice");
		choice=sc.nextInt();
		
		switch(choice)
		{
		case 1:
			Employeelist e= new Employeelist();
			e.acceptData();
			Emplist.add(e);
         			
		case 2:
			System.out.println("Enter employee empid to remove");
			Employeelist d= new Employeelist();
			int id=sc.nextInt();
			d.setEmpid(id);
			Emplist.remove(d);
			
		case 3:
			System.out.println("Enter employee empid ");
			int ic=sc.nextInt();
			Employeelist em= new Employeelist();          ///here we get index from empid
			em.setEmpid(ic);
			int index=Emplist.indexOf(em);
			if(index<=-1) {                                               //to check invalid entry like -1 
			System.out.println("Employee is not found");	                                     
			}
			else
				System.out.println("Employee is found at index "+index);
			Employeelist in =Emplist.get(index);
			System.out.println(in);
			
			
			
		case 4:
			
			class Empcomparator implements Comparator<Employeelist>{

				@Override
				public int compare(Employeelist e1, Employeelist e2) {
					int diff =(e1.getEmpid()-e2.getEmpid());
					return diff;
					}
			}
			Empcomparator obj =new Empcomparator();
			
			Emplist.sort(obj);
			 for(Employeelist m:Emplist)
			 System.out.println(m);
			
			
		
		case 5:
		   
			System.out.println("Enter empid to be modified: ");
			int im = sc.nextInt();
			Employeelist key = new Employeelist();
			key.setEmpid(im);
			int indez= Emplist.indexOf(key);
			if(indez == -1)
			System.out.println("Employee not found.");
			else {
				Employeelist oldEmp = Emplist.get(indez);
			System.out.println("Employee Found: " + oldEmp);
			System.out.println("Enter new information for the Employee");
			Employeelist newEmp = new Employeelist();
			newEmp.acceptData();
			Emplist.set(indez, newEmp);
			}
		
		}
	}while(choice!=0);

	}
}
