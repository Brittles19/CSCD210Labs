package cscd210Methods;

import java.util.Scanner;

import cscd210Enums.Month;

public class CSCD210Lab17Methods {
	public static Month[] fillArray(Scanner fin, int total) {
		if(fin == null || total < 0)
			throw new IllegalArgumentException("empty file, and total");
		Month[] array = new Month[total];
		
		for(int x = 0; x < array.length; x++) {
			String str = fin.nextLine().substring(0,3).toUpperCase();
			array[x] = Month.valueOf(str);
					
		
		
		}
		return array;
	}
	public static void printArray(Month[] array) {
		if(array == null || array.length < 1) 
			throw new IllegalArgumentException("Bad array length");
		for(int x = 0; x < array.length; x++) {
		System.out.println(array[x]);
	}
	}
	public static int menu(Scanner kb) {
		
		int choice =0;
		do {
			System.out.println("Enter your choice here: ");
			System.out.println("1) Print the array to the screen");
			System.out.println("2) Sort the array in natural order");
			System.out.println("3) Sort the array by total order based on days");
			System.out.println("4) Quit");
			choice = kb.nextInt();
			
		}while(choice < 1 || choice > 4);
		return choice;
	}
	public static Month getMonth(String str) {
		if(str == null || str.isEmpty())
			throw new IllegalArgumentException("Bad String paramter");
		if(!str.matches(str))
			throw new IllegalArgumentException("String does not match enumerated data type");
	Month month = Month.valueOf(str);
	String abbreviatedMonth = month.toString();
	abbreviatedMonth = str.charAt(0)+"".charAt(1)+"".charAt(2)+""; 
	month = Month.valueOf(abbreviatedMonth);
	return month;
	//you need to get the string passed as month objects
	//convert that month to a string 
	//get the first 3 characters of the string constant of enum
	//pass that into the month object
		
	}
}
