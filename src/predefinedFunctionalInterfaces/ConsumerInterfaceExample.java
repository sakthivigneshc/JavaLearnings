package predefinedFunctionalInterfaces;

import java.util.function.Consumer;

public class ConsumerInterfaceExample {
	public static void main(String[] args) {
		
		
		Consumer<String> consumer  = s ->{
			System.out.println("The value is "+ s);
		};
		
		consumer.accept("\"Value from the accept method.\"");
		
		
	}
}

