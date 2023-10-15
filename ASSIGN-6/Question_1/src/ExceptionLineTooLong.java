import java.util.*;
public class ExceptionLineTooLong {

	private String Line;
	private int Line_length;
	
	public void lineDetails() {
        Scanner sc= new Scanner(System.in);		
		System.out.println("enter the line below 80 letters");
		try {
	    this.Line=sc.nextLine();
		}
		
		finally{
			int a=this.Line.length();
			if( a<80)
				System.out.println("the length ="+a);
			else 
				System.out.println("entered line is too long");
		}
		
	}
	

}
