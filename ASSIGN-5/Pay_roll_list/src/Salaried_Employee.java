
import java.util.Scanner;
public class Salaried_Employee extends Employee {
   double Weekly_salary;
   
    Scanner sc=new Scanner(System.in);
    
    Salaried_Employee (){
    	this();
    }
    
    Salaried_Employee (){
    	
    }
    
    public void acceptData() {
    	super.acceptData();
    	this.Weekly_salary=sc.nextDouble();
    }
    
    
	@Override
	public void annualSalary() {
		
		
	}
	
		

}
