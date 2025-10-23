package java8;

@FunctionalInterface
interface Greeting {
    void sayHello();
}

public class Main {
    static void greet(Greeting greeting) {
        greeting.sayHello();
    }

    public static void main(String[] args) {
        // Using Lambda Expression
        greet(() -> System.out.println("Hello, lambda"));
    }
}

