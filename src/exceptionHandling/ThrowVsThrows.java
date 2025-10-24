package exceptionHandling;

public class ThrowVsThrows {
	
	public static void sleepMethod()  {
		try {
			Thread.sleep(3000);
		} 
		
		catch (InterruptedException e) {
			e.printStackTrace();
			 
		}
	}
	
	public static void main(String[] args) {
		ThrowVsThrows.sleepMethod();
	}
	

}
