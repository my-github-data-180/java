
import java.util.Comparator;

public class Bookcomparator implements Comparator<Books> {

	@Override
	public int compare(Books b1, Books b2) {
		int diff=-Double.compare(b1.getPrice(),b2.getPrice());  //to achieve descending order
		return diff;
	}

}
