import java.util.Random;
import java.util.stream.Stream;

public class Randomint {

	public static void main(String [] args) {
		
		
		Random random =new Random();
		Stream<Integer> str =Stream.generate(()->random.nextInt(10)).limit(10);
		Integer  sum =str.reduce(0, (a,e)->a+e);
		System.out.println(sum);
	}
	
}
