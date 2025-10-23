package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("alice", "bob", "charlie");

        names.stream()
//                .map(String::toUpperCase) it is by using method references
                 .map(name->name.toUpperCase())
                .forEach(System.out::println);

    }
}