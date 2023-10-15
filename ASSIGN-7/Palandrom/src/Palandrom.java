import java.util.Scanner;

public class Palandrom {

	public static void main(String[] args) {
		  
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the string you are cheack for ");
		StringBuilder sb=new StringBuilder(sc.next());  
		StringBuilder sb2=new StringBuilder(sb);
	    sb=sb.reverse(); 

	      if(sb2==sb)
	      {
	    	  System.out.println("yes ");
	      }
	      else
	      {
	    	  System.out.println("no");
	      }
		  

	}
