
public class Main {

	static <T> int countIf(T[] arr, T key, Check<T> c) {
		int count = 0;
		for (T nm : arr) {
			if (c.compare(nm, key))
				count++;
		}
		return count;

	}

	public static void main(String[] args) {

		Integer[] arr = { 44, 77, 99, 22, 55, 66 };
		Integer key = 50;
		System.out.println(countIf(arr, key, (a, b) -> a > b));
	}

}
