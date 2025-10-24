package exceptionHandling;

import java.util.Scanner;

public class OwnException {
	
	public static void main(String[] args) throws MyownException {
		System.out.println("Enter your age : ");
		Scanner scanner = new Scanner(System.in);
		int age = scanner.nextInt();
		if(age<10) {
			throw new MyownException("You are not eligible");
		}
		else {
			System.out.println("successfully logged in..");
		}
	}

}



/*  --- output

Enter your age : 
1
Exception in thread "main" coreJava.MyownException: You are not eligible
	at JavaLearnings/coreJava.OwnException.main(OwnException.java:12)


*/
