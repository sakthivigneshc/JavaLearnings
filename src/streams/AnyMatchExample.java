package streams;

import java.util.Arrays;
import java.util.List;

public class AnyMatchExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,  3, 5);

        final boolean b = numbers.stream()
                .anyMatch(number -> number % 2 == 0);

        System.out.println(b);

    }
}

// This condition will check for any condition matching if it is matching for even one it will return true