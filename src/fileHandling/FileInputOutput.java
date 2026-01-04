package fileHandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileInputOutput {
	public static void main(String[] args) {
		 
		String [] names = {"number", "arrays", "joke"	};
		
		try {
			FileWriter filewriter = new FileWriter("C:\\Users\\Sakthivignesh C\\eclipse-workspace\\JavaLearnings\\demoPurposes\\demo3.txt");
			BufferedWriter bw = new BufferedWriter(filewriter);
			bw.write("Hi....");
			bw.write("\nhi....");
		      System.out.println("Successfully appended to the file.");
		      
		      for(String name : names) {
		    	  
		    	 bw.write("\n" + name);
		      }

			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}


// src : coding with john