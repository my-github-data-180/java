package com.app.aaa;
import java.util.Scanner;

public class Employeelist {
	private int Empid;
	private String Name;
	private double Salary;
	
	Scanner sc =new Scanner(System.in);
	
	public Employeelist(){
		
	}
	public Employeelist(int empid, String name, double salary) {
		
		Empid = empid;
		Name = name;
		Salary = salary;
	}
	
	public int getEmpid() {
		return Empid;
	}
	
	public void setEmpid(int empid) {
		Empid = empid;
	}
	
	public String getName() {
		return Name;
	}
	
	public void setName(String name) {
		Name = name;
	}
	
	public double getSalary() {
		return Salary;
	}
	
	public void setSalary(double salary) {
		Salary = salary;
	}
	
	public void acceptData() {
		System.out.println("Employee details");
		System.out.println("Empid :");
		this.Empid=sc.nextInt();
		System.out.println("Name :");
		this.Name=sc.next();
		System.out.println("Salary :");
		this.Salary=sc.nextDouble();
	
		
	}
	@Override
	public String toString() {
		return "Employeelist [Empid=" + Empid + ", Name=" + Name + ", Salary=" + Salary + "]";
	}
	
	

}
