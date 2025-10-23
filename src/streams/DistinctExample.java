package streams;

import java.util.ArrayList;
import java.util.List;

public class DistinctExample {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(450);
		list.add(450);
		list.add(78);
		list.add(24);
		list.stream()
		.distinct()
		.forEach(System.out::println);
	}

}
