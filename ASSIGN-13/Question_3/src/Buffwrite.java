import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Buffwrite {
	
	public static void main(String [] args) {
		Scanner sc =new Scanner(System.in);
		try(FileWriter fw =new FileWriter("String.txt")){
		try(BufferedWriter bw =new BufferedWriter(fw)) {
		for(int i=1; i<=4; i++) {
		System.out.println("Enter the lines");
		String line = sc.nextLine();
		bw.write(line);
		bw.newLine();
		}
     	}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
