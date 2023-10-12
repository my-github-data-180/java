
import java.util.Scanner;
abstract public class Employee {
  private String First_name;
  private String Last_name;
  private int SSN;  //social security number
  
  
  abstract public void annualSalary();
  
  public void acceptData() {
	  
	 Scanner sc= new Scanner (System.in);
	System.out.println("enter employees details :");
	System.out.println("First name :");
	this.First_name=sc.next();
	System.out.println("Last_name :");
	this.Last_name=sc.next();
	
  }
  
  public void displayData() {
	  System.out.println("enter employees details :");
	  System.out.println("First name :"+this.First_name);
	  System.out.println("Last_name :"+this.Last_name);
  }
   
}
