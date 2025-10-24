package exceptionHandling;

public class ExceptionHandling {
	
	public static void main(String[] args) {
		int number1 = 67;
		int number2 =0;
		int result;
		
		try {
		 result = number1/number2;
		}
		catch(ArithmeticException e){
			System.out.println("we can't divide by zero");
		}
		
		catch (Exception e) {
			System.out.println("something went wrong!!");
		}
		
		finally {
			System.out.println("This will run...");
		}
		
	}

}
