package cscd210Utils;

import java.io.File;
import java.util.Scanner;

public class FileUtils {
	public static int countRecords(Scanner fin, int linesPer) {
		if(fin == null)
			throw new IllegalArgumentException("Scanner is empty");
		if(linesPer <= 0)
			throw new IllegalArgumentException("Count lines is 0");
		int count =0;
		do
		{
			count++;
			fin.nextLine();
		}while(fin.hasNextLine());
		return count/linesPer;
	}
	public static File openInputFile(Scanner kb) {
		if(kb == null)
			throw new IllegalArgumentException("Scanner is empty");
		
		String theFile = null;
		System.out.println("Enter the file name here: ");
		theFile = kb.nextLine();
		File fin = new File(theFile);
	
		
		while(!fin.exists())
		{
			System.out.println("FILE DOES NOT EXIST- Enter the correct file name here: ");
			theFile = kb.nextLine();
			fin = new File(theFile);
			
		}
		return fin;
		
	}
	public static File openInputFile(String filename) throws Exception{
		if(filename == null)
			throw new IllegalArgumentException("Bad file");
		if(filename.isEmpty())
			throw new IllegalArgumentException("File is empty");
		File fin = new File(filename);
		return fin;
		
	}

}
