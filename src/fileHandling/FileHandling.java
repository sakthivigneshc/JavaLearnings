package fileHandling;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileHandling {
	
	public static void main(String[] args) throws IOException {
		File file = new File("demoFile.txt");
		//Creation of a file
		if(file.createNewFile()) {
			System.out.println("File created.." +file.getName());
		}
		else {
			System.out.println("File already exists.." + file.getName());
		}
		
		// 2. writing -> using UTF format
		String input [] = {
				"hi",
				"hey",
				"Hey"
		};
		FileOutputStream fos = new FileOutputStream(file);
		DataOutputStream dos = new DataOutputStream(fos);
		for(String value : input) {
			dos.writeUTF(value);
		}
//		dos.writeUTF("hello world..."); // write only one text in the file
		System.out.println("written successfully...");
		
		//3. append
		dos.writeUTF("hi.....");
		
		//Read UTF
		System.out.println("--- Reading from file ---");
		FileInputStream fis  = new FileInputStream(file);
		DataInputStream dis = new DataInputStream(fis);
		String line = dis.readUTF(dis);
		System.out.println(line);
		
		
	}

}
