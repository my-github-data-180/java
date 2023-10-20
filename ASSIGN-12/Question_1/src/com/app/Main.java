package com.app;

public class Main {
	public static void main(String []args) {
  Emp[] arr =new Emp[3];
  arr[0]= new Manager(100000,20000);
  arr[1]=new Clerk(20000);
  arr[2]=new Labour(400,800);
  double Total= Emp.calcTotalIncome(arr);
  System.out.println("Total income :"+Total);
}
}
