package com.app.employee;
import java.util.Scanner;
public class Employee {

	String F_Name;
	String L_Name;
	double Salary;
	
	public Employee() {
		this(" "," ",0);
	}
	public Employee(String f_Name, String l_Name, double salary) {
		F_Name = f_Name;
		L_Name = l_Name;
		Salary = salary;
	}
    	
	public void acceptEmployee() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter employee details:");
		System.out.println("first name:");
		F_Name=sc.next();
		System.out.println("last_name:");
		L_Name=sc.next();
		System.out.println("salary   :");
		Salary=sc.nextDouble();
	}
	
	
    public void salaryDisplay() {
    	setSalary(this.Salary*12);
       System.out.println(" Annum Salary  ="+getSalary());
       
       System.out.println("Annum Salary with 10% hike  ="+getSalary()*1.1);  
    }
    
    
	public String getF_Name() {
		return F_Name;
	}
	public void setF_Name(String f_Name) {
		F_Name = f_Name;
	}
	public String getL_Name() {
		return L_Name;
	}
	public void setL_Name(String l_Name) {
		L_Name = l_Name;
	}
	public double getSalary() {
		return Salary;
	}
	public void setSalary(double salary) {
		Salary = salary;
	}
    
    

}
