package streams;

import java.util.ArrayList;
import java.util.List;

public class SkipExample {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(23);
		list.add(45);
		list.add(78);
		list.add(289);
		list.stream()
		.skip(3)
		.forEach(System.out::println);
	}

}
