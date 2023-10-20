import java.sql.Array;
import java.util.Scanner;

public class Arraydoublecheck {

    
	static <T> int countIf(T[] arr, T key, Check<T> c) {
		int count = 0;
		for (T nm : arr) {
			if (c.compare(nm, key))
				count++;
		}
		return count;
	}

		
		public static void main(String[] args ){
			
			 Scanner sc =new Scanner(System.in);
	
            Double [] arr= {12.34 ,10.33 ,55.55 ,10.33 ,45.25 ,12.34};
            
            for (Double d : arr) 
            System.out.println(d);
		        
           System.out.println("Enter the key");
           Double dm =sc.nextDouble();
           int cound =countIf(arr, dm, (a,b)->a.equals(b));
           System.out.println("Result ="+cound);
		}


	

}
