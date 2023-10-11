
import java.util.Scanner;
public class Testnum {


	public static void main(String[] args) {
		int num;
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the number :");
		num=scanner.nextInt();
		System.out.println("binary=" + Integer.toBinaryString(num))	;
		System.out.println("hexadecimal:"+ Integer.toHexString(num));
		System.out.println("octal :"+ Integer.toOctalString(num));
        		
		

	}
}


