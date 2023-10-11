import java.util.Scanner;

public class Doubleaccept {
	public static void main(String[] args) {
		double a;
		double b;
		double avg;

		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the numbers:");
		// b=scanner.nextDouble();
		

		if (scanner.hasNextDouble() && scanner.hasNextDouble()) {
			a = scanner.nextDouble();
			b = scanner.nextDouble();
			avg = (a + b) / 2;
			System.out.println("avg="+avg);
			
		} else {

			System.out.println("Entered numbers are not double ");
		}
	}

}