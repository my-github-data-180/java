

import java.util.*;
;
public class Arrayduplicate {

	public static void main(String[] args) {
		String s1;
		String s2;
	    s1= new String();
	    
	    Scanner sc = new Scanner(System.in);
	    System.out.println("enter first array");
	    s1=sc.next();
	    System.out.println("enter second array");
        s2=sc.next();
      
        if(s1.equals(s2))
        System.out.println("available");
        else
        System.out.println("duplicate not  available");	
              
	    
		
	}

}
