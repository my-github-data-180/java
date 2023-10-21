import java.io.BufferedReader;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Buffread {
public static void main(String []args) {
	Scanner sc =new Scanner(System.in);
	
	try(FileReader fr =new FileReader("/home/sunbeam/Documents/DAC assign/java/ASSIGN-13/Question_3/String.txt")){
	try(BufferedReader br =new BufferedReader(fr)) {
		String line;
		
		while((line=br.readLine())!=null) {
			System.out.println(line);
	}

	}
    }
	
	catch(Exception e) {
		e.printStackTrace();
	}
}
}

