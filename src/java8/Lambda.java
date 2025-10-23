package java8;


interface lambdaDDemo{
	public void display();
}

public class Lambda {
	public static void main(String[] args) {
//		lambdaDDemo l = new lambdaDDemo() {
//			public void display() {
//				System.out.println("Hi.....");
//			}
//		};
//		l.display();
		
		
		lambdaDDemo l =  ()->
		{
			System.out.println("Hi...");
		};
		l.display();
		
//     		

		
			
		
	}

}
