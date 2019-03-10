package cscd210Methods;

import java.util.Scanner;

import java.io.PrintStream;


public class CSCD210Lab9Methods {
	public static String[] fillArray(final Scanner fin, final int total) {
		if(fin == null)
			throw new IllegalArgumentException("File is empty");
		if(total <= 0)
			throw new IllegalArgumentException("Total does not exist");
		
		String[] array = new String[total];
		int x = 0;
		while(fin.hasNextLine()) {
			String line = fin.nextLine();
			array[x] = line;
			x++;
		}
		return array;
		
		}
	public static void printArray(final String[] words, final PrintStream fout) {
		if(words == null || words.length <= 0)
			throw new IllegalArgumentException("Bad Array");
		if(fout == null)
			throw new IllegalArgumentException("Bad PrintStream");	
	
		for(String string : words) {
		
			fout.println(string + " ");
				
		}
		}	
}
