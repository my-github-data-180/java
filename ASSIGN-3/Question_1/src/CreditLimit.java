import java.util.Scanner;
public class CreditLimit {
      int acc_no;
      int sal_begin;
      int charges;
      int credits;
      int credit_limit=50000;
      
      public void acceptDetails() {
    	  Scanner sc =new Scanner(System.in);
    	  System.out.println("enter the details:");
    	  System.out.println("A/C NO:");
    	  this.acc_no=sc.nextInt();
    	  System.out.println("BEGINNING SALARY:");
    	  this.sal_begin=sc.nextInt();
    	  System.out.println("CHARGES=:");
    	  this.charges=sc.nextInt();
    	  System.out.println("CREDITS:");
    	  this.credits=sc.nextInt();
    	  
    	 
    	  
      }
      
      
      public void calculateBalance() {
      int balance=0;
      balance=this.sal_begin+this.charges-this.credits;
      
      if(balance<this.credit_limit)
      {
    	  System.out.println("CREDIT LIMIT EXCEEDED");
      }
      else
    
      System.out.println("BALANCE="+balance); 
      }
      
      
      
      
	public static void main(String[] args) {
		CreditLimit cl =new CreditLimit();
		cl.acceptDetails();
		cl.calculateBalance();
	}

}
