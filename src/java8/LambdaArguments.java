package java8;


interface lambdaDDemoArgs{
	public void display(int i);
}

interface ReturningValue{
	public int display ( int i, int j);
}

public class LambdaArguments {
	
		
	public static void main(String[] args) {
		lambdaDDemoArgs l =  (i)->
		{
			System.out.println("The value is :" + i);
		};
//		l.display(6);
		ReturningValue value = (i,j)-> i*j ;
		
		int result = value.display(2, 4);
		System.out.println("Value of 2 numbers are : "+ result);
	     			
				
	}
	
	//Lambda works with functional interface
	// we no need to  mention the keyword return if its returning some values
	

}
