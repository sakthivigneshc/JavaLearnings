package coreJava;

public class VarArgs {
	
	static int   sum = 0;
	public static int add(int ... i){
		
		for(int value : i) {
			sum = sum + value;
		}
		
		return sum;
		
	}
	
	public static void main(String[] args) {
		System.out.println(VarArgs.add(2,4,4,8));
	}

}

//The variable argument type int of the method 
// add must be the last parameter