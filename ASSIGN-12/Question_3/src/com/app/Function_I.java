package com.app;

import java.util.Scanner;

public class Function_I {

	static void calculate(double num1, double num2, Arithmetic op) {
		double result = op.calc(num1, num2);
		System.out.println("Result: " + result);
	}

	public static void main(String []args) {
		Scanner sc =new Scanner(System.in);
	
		int choice;
				
		do {
			
			
			System.out.println("1.Addition");
			System.out.println("2.Substraction");
			System.out.println("3.Multiplication");
			System.out.println("4.Division");
			System.out.println("0.Exit");
			System.out.println("Enter your choice");
			choice=sc.nextInt();
			double a,b;
			switch(choice)
			{
			case 1:
				
				System.out.println("Enter two number");
				a=sc.nextDouble();
				b=sc.nextDouble();
				calculate(a, b, (x,y)->x+y);
				break;
				
			case 2:

				System.out.println("Enter two number");
				a=sc.nextDouble();
				b=sc.nextDouble();
				calculate(a, b, (x,y)->x-y);
				break;
				
				
			case 3:

				System.out.println("Enter two number");
				a=sc.nextDouble();
				b=sc.nextDouble();
				calculate(a, b, (x,y)->x*y);
				break;
				
  			case 4:

 				System.out.println("Enter two number");
				a=sc.nextDouble();
				b=sc.nextDouble();
				calculate(a, b, (x,y)->x/y);
				break;
	
			}
			
		
		} while (choice!=0);
	}

}
