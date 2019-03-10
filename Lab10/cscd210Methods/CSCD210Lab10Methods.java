package cscd210Methods;

import java.io.File;
import java.io.PrintStream;
import java.util.Scanner;

public class CSCD210Lab10Methods {
	private static int readAmountToShift(Scanner fin) {
		if(fin == null)
			throw new IllegalArgumentException("Bad Scanner");
		int shift = Integer.parseInt(fin.next());
		return shift;
		
		
	}
	private static int amountShifted(String encryptedString) {
		if(encryptedString == null)
			throw new IllegalArgumentException("Bad String");
		//int shift = readAmountToShift(encryptedString.length());
				
		return 0;
		
		
		
		
	}
	private static String decryptString(String encryptedString, int amount, String direction) {
		if(encryptedString == null || direction == null)
			throw new IllegalArgumentException("Bad String");
		return null;
}
	public static void decrypt(Scanner fin, PrintStream fout) {
		if(fin == null || fout == null)
			throw new IllegalArgumentException("Bad File input or output");
	
		
		
	}
	public static int menu(Scanner kb) {
		if(kb == null)
			throw new IllegalArgumentException("Bad Scanner");
		int choice = 0;
		
		
		do {
			System.out.println("1) Encrypt a file writing the results to a different file" );
			System.out.println("2) Decrypt a file writing the results to a different file " );
			System.out.println("3) Decrypt a file writing the results ot the screen ");
			System.out.println("4) Quit");
		
			 choice = kb.nextInt();
				System.out.println();
			
		
		
		}while(choice > 0 || choice < 5);
		return choice;
	}
	private static String determineDirection(String encryptedString) {
		if(encryptedString == null || encryptedString.isEmpty()) 
			throw new IllegalArgumentException ("String is bad or empty");
		String dir = null; 
		if(encryptedString.equals("rt")) { //if the string "rt" is in the the string the direction gets moved left otherwise right
			
			dir = "left";
			
		}else
			dir = "right";
		
		return dir;
		
		}
	
	private static String readDirection(Scanner fin) { //reads the direction in which the file needs to be encyrpted/Decrypted
		String dir = null;
		dir = fin.nextLine();
		return dir;
	}
		
		
	
	private static void display(String dir, int number, String str, PrintStream fout) {
		if(dir == null || str == null || dir.isEmpty() || str.isEmpty() || fout == null )
			throw new IllegalArgumentException("All types of crazy went on: Strings are empty or output is empty");
		System.out.println(fout);
	}
	private static void display(String phrase, String str, PrintStream fout) {
		if(phrase == null || str == null || phrase.isEmpty() || str.isEmpty() || fout == null )
			throw new IllegalArgumentException("All types of crazy went on: Strings are empty or output is empty");
		
		
	}
	public static String readFilename(Scanner kb) { //takes in the fileName to be read
		System.out.println("Enter a file name here: ");
		String filename = kb.nextLine();
		if(filename.isEmpty()) {
			System.out.println("FILENAME DOES NOT EXIST- Enter the correct name here: ");
			filename = kb.nextLine();
		}
		return filename;
		
		
	}
	private static String readString(Scanner fin) { //the string is either encrypted or decrypted
		if(fin == null)
			throw new IllegalArgumentException("file is empty");
		String encryptOrDecyrpt = null;
		while(fin.hasNextLine()) {
		 encryptOrDecyrpt = fin.nextLine();
		}
		return encryptOrDecyrpt;
		
		
	}
	
	
	public static void encrypt(final Scanner fin, final PrintStream fout, final int total){
	String str = readString(fin); //reads String to encrypt
	String dir = readDirection(fin); //reads the direction to encrypt(left or right)
	int num = readAmountToShift(fin); //reads amount it is shifted(1 -25)
	String res = encryptString(str, num, dir); //
	String phase = dir + num; //the phase shift is the direction left or right added to the number that is needed to be shifted in that direction

	if (dir.equals("rt"))
	phase = "left";
	else
	phase = "right";

	phase = phase + num;

	display(phase, res, fout);
	
	
}
	private static String encryptString(String origString, int amount, String direction) {
		origString = amount + direction;
		return origString;
		
		
	}
}
