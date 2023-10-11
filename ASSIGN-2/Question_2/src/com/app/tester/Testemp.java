package com.app.tester;
import com.app.employee.Employee;

public class Testemp {
	public static void main(String []args) {
	  Employee e1 =new Employee();
	  Employee e2 =new Employee(); 
	  
	  e1.acceptEmployee();
	  e1.salaryDisplay();
	  e2.acceptEmployee();
	  e2.salaryDisplay();
	}

}
