package cscd210Lab14Methods;

import java.io.PrintStream;
import java.util.Scanner;

import cscd210Classes.Author;

public class CSCD210Lab14Methods {
	public static Author[] add(Author[] array, Scanner kb) {
		if(kb == null || array == null || array.length < 1)
			throw new IllegalArgumentException("Scanner or Array is empty");
		Author[] copyArray = new Author[array.length+1];
		for(int x = 0; x < array.length; x++) {
			copyArray[x] = array[x];
		}	
		kb.nextLine();
		System.out.println("Enter the First Name of the Author here: ");
		String first = kb.nextLine();
	
		
	
		System.out.println("Enter the last name of the Author here: ");
		String last = kb.nextLine();
		kb.nextLine();
		System.out.println("Enter the publisher name here: ");

		String publisher = kb.nextLine();
		
		
		copyArray[array.length] = new Author(first, last, publisher);
		
			
		
		return copyArray;
		
		
		
		
	
		
	
		
}
public static void fillArray(Scanner fin, Author[] array) {
	if(fin == null)
		throw new IllegalArgumentException("File input is empty");
	if(array == null)
		throw new IllegalArgumentException("Array is empty");
	if(array.length < 1)
		throw new IllegalArgumentException("array cannot be less than or equal to zero");
		
		for(int x = 0; x < array.length ; x++) {
			String line = fin.nextLine();
			String[] split = line.split(",");
			
			array[x] =  new Author(split[0].split(" ")[0], split[1].split(" ")[1], split[1]); 
		
			
		}
		
		
		
	
}
public static int menu(Scanner kb) {
	int choice;
	do {
		System.out.println("Enter a number here: ");
		System.out.println("1) Print the Array");
		System.out.println("2) Add author the array and sort");
		System.out.println("3) Quit");
		choice = kb.nextInt();
	}while(choice < 0 || choice >= 4);
	return choice;
	
}
static <T> void printArray(T[]myArray, PrintStream fout) {
	fout.println(myArray);
}

}
