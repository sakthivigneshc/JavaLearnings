package fileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {

	// the easiest way to write text to a file is by using the FileWriter class.
	public static void main(String[] args) {
		
		File file = new File("C:\\Users\\Sakthivignesh C\\eclipse-workspace\\JavaLearnings\\demoPurposes\\demoFile.txt");
		try {
			if( file.createNewFile())
			{
				System.out.println("File created successfully...");
			}
			else {
				System.out.println("File already created...");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
		FileWriter fw = new FileWriter(file);
		 fw.write("Files in Java might be tricky, but it is fun enough!");
	      fw.close();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
	
//	Since Java 7, you can use try-with-resources. 
//	This makes sure the writer is closed automatically, even if an error occurs:
	
/*
 import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
  public static void main(String[] args) {
    // FileWriter will be closed automatically here
    try (FileWriter myWriter = new FileWriter("filename.txt")) {
      myWriter.write("Files in Java might be tricky, but it is fun enough!");
      System.out.println("Successfully wrote to the file.");
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
} 
 
 */
	
	
/*
 Other Ways to Write to Files
There are several classes you can use to write files in Java:

FileWriter - easiest choice for basic text.
BufferedWriter - better for large text files, because it is faster and supports handy features.
FileOutputStream - best for binary data (images, audio, PDFs)
 */
	
}
