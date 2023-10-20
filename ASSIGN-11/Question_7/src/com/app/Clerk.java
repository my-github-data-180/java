package com.app;

public class Clerk implements Emp{
	private double Salary;

	
	public Clerk(double salary) {
		super();
		Salary = salary;
	}
	

	public double getSalary() {
		return Salary;
	}
	

	public void setSalary(double salary) {
		Salary = salary;
	}
	

	@Override
	public String toString() {
		return "Clerk [Salary=" + Salary + "]";
	}


	@Override
	public double getSal() {
		
		return this.Salary;
	}
	

}
