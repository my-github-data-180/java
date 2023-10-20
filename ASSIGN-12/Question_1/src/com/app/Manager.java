package com.app;

public class Manager implements Emp{
	private double Basic_salary;
	private double Dear_allowa;
	
	
	public Manager(double basic_salary, double dear_allowa) {
		super();
		Basic_salary = basic_salary;
		Dear_allowa = dear_allowa;
	}
	
	public double calcIncentives() {
		return .2*this.getBasic_salary();
	}
	
	public double getBasic_salary() {
		return Basic_salary;
	}
	
	public void setBasic_salary(double basic_salary) {
		Basic_salary = basic_salary;
	}
	
	public double getDear_allowa() {
		return Dear_allowa;
	}
	
	public void setDear_allowa(double dear_allowa) {
		Dear_allowa = dear_allowa;
	}
	
	@Override
	public String toString() {
		return "Employee [Basic_salary=" + Basic_salary + ", Dear_allowa=" + Dear_allowa + "]";
	}
	
	@Override
	public double getSal() {

		return (this.Basic_salary+this.Dear_allowa);
	}
	
	

}
