package cscd210Utils;
import java.io.File;
import java.util.Scanner;

public class FileUtils {
	public static int countRecords(final Scanner fin, final int linesPer) throws RuntimeException {
		if(fin == null)
			throw new IllegalArgumentException("File is empty");
		if(linesPer <= 0)
			throw new IllegalArgumentException("Lines cannot be less than or equal to zero");
		int count = 0;
		do
		{
			count++;
			fin.nextLine();
		}while(fin.hasNextLine());
		return count/linesPer;
		
		
	}
public static File openInputFile(final Scanner kb) {
	if(kb == null)
		throw new IllegalArgumentException("Empty Scanner");
	
	String fin;
	System.out.println("Enter the name of the file here:  ");
	fin =kb.nextLine();
	
	File inf = new File (fin);
	kb.nextLine();
	while(!inf.exists()) {
		System.out.println("FILE DOES NOT EXIST-Enter the file name here: ");
		fin = kb.nextLine();
		inf = new File (fin);

	}
	
	
	
	return inf;
	
	
	}

public static File openInputFile(final String filename){
	if(filename == null)
		throw new IllegalArgumentException("file is empty");
	if(filename.isEmpty())
		throw new IllegalArgumentException("File is empty");
	
	File inf = new File(filename);
	if(inf.exists()) {
	return inf;
	}
	return inf;
	
}
}
