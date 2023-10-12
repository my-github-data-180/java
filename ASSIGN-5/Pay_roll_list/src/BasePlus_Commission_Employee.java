import java.util.Scanner;

public class BasePlus_Commission_Employee extends Commission_Employee{
	private double Basic_salary;

	Scanner sc=new Scanner(System.in);
	public void acceptData() {
		super.acceptData();
		System.out.println("enter basic salary :");
		this.Basic_salary=sc.nextDouble();
		
	}
	
	public void displayData() {
	     super.displayData();
		System.out.println("basic salary:");
	}
	
	@Override
	public void grossSalary() {
	double gross;
	gross=super.grossSalary()+Basic_salary;
		
	}
	
     
}
