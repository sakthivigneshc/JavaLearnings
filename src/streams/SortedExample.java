package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortedExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 3, 1, 4, 2);

        numbers.stream().
                sorted(Comparator.reverseOrder()).
                forEach(System.out::println);



    }
}