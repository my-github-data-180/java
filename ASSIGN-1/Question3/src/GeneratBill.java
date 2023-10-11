import java.util.Scanner;
public class GeneratBill {
	

	public static void main(String[] args) {
	    Scanner sc= new Scanner(System.in);
		double price=0;
		
		int choice;
		
		do {
      System.out.println("Enter your dish choice");
      System.out.println("0.To generate Bill and Exit");
      System.out.println("1.idli    -  40");
      System.out.println("2.dosa    -  50");
      System.out.println("3.upma    -  20");
      System.out.println("4.samosa  -  20");
      System.out.println("5.poha    -  25");
      System.out.println("6.palawa  -  40");
      System.out.println("7.uttappa -  60");
     
      choice=sc.nextInt();
     
      switch(choice)
      {
      case 1:
      price+=40;	  
      break;	
      
      case 2:
          price+=50;	  
          break;
          
      case 3:
          price+=20;	  
          break;
          
      case 4:
          price+=20;	  
          break;
          
      case 5:
          price+=25;	  
          break;
          
      case 6:
          price+=40;	  
          break;
          
      case 7:
          price+=60;	  
          break;
          
       default :
    	 System.out.println("invalid choice.....!");  
    	   break;
      }
     
    
	}while(choice!=0);		
      
		  System.out.println("FINAL BILL="+price);
		  
		  sc.close();
}
}
