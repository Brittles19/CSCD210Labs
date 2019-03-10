package cscd210Methods;

import java.util.Scanner;

public class CSCD210Lab8Methods {
	public static int menu(final Scanner kb) {
		if(kb == null)
		throw new IllegalArgumentException ("Scanner is empty");
		
		int choice = 0;
		do {
			System.out.println("1) Add a value to the Array");
			System.out.println("2) Delete a value from the Array (by value)");
			System.out.println("3) Delete a value from the Array (by location)");
			System.out.println("4) Display the Array");
			System.out.println("5) Compute the mean of the Array");
			System.out.println("6) Compute the median of the Array");
			System.out.println("7) Compute the Midpoint of the Array");
			System.out.println("8) Compute the standard Deviation of the array");
			System.out.println("9) Quit");
			
			
			choice = kb.nextInt();
			
		}while(choice < 1 || choice > 9);
		System.out.println();
		return choice;
		
	}
	
	public static int readNum(final Scanner kb) {
		if(kb == null)
			throw new IllegalArgumentException("Scanner is empty");
		int positiveNum;
		System.out.println("Enter a number greater than 0 here: ");
		positiveNum = kb.nextInt();
		System.out.println();
		return positiveNum;
		
		
	}

}
