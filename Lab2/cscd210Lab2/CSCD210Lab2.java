package cscd210Lab2;
import java.util.Scanner;

public class CSCD210Lab2 {
	public static final int YEAR = 2019;

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		String name = null;
		System.out.println("Enter first, middle, and last name as a single string separated by a single space here: " + "\n");
		name = kb.nextLine();
		System.out.println("\n" + "The first letter of your name is: " + name.charAt(0) + "\n");
		System.out.println("The last letter of your name is: " + name.charAt(name.length()-1) + "\n");
		String[] array = name.split(" ");
		System.out.println("Your middle name is: " + array[1] + "\n");
		System.out.println("The hashcode of your name is: " + name.hashCode() + "\n");
		long n = name.hashCode() + YEAR;
		System.out.println("The hascode of your name added to the year of 2019 is: " + n);
		
	}//end main
	

}//end class


