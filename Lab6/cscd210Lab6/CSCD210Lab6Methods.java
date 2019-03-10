
package cscd210Lab6;
/**
 * 
 */



import java.util.Scanner;
import java.util.Random;
/**
 * This is the class that will hold all the methods for lab 6. Every method that is
 * passed parameters will have the special modifier final on the parameter.  Examine 
 * the method header for the menu method to see an example of final on the method parameter(s)
 */
public class CSCD210Lab6Methods
{
		static Random ran = new Random();
   	
	/**
	 * An empty constructor you actually get this for free.  If I don't write this method
	 * it will still appear in the generate Javadoc
	 */
	public CSCD210Lab6Methods()
	{
		// Please ignore this method
	}
	
	
	/**
	 * This is the menu method.  It simple generates a menu and ensures the choice is entered 
	 * in the range of 1 to 3 inclusive <br/>
	 * <b calr/>
	 * NOTE This method ensures the input buffer is empty after the number has been read in
	 * <br/>
	 * @param kb Representing the Scanner object
	 * @return int Representing the user choice
	 * @throws IllegalArgumentException if the Scanner is null
	 */
	public static int menu(final Scanner kb)
	{
		if(kb == null)
			throw new IllegalArgumentException("Scanner in menu is null");
		
		int choice;
		
		do
		{
			System.out.println("Please choose from the following");
			System.out.println("1) Let the user enter a length");
			System.out.println("2) Let the computer generate a length");
			System.out.println("3) Quit");
			System.out.print("Choice --> ");
			
			choice = Integer.valueOf(kb.nextLine());
			
		}while(choice < 1 || choice > 3);
		
		System.out.println();
		
		return choice;
	}//end method
	

	
	public static String readLength(final Scanner kb) {
		if(kb == null)
			throw new IllegalArgumentException("bad input readLength");
		System.out.println("Enter the length of the center of the vertex here: ");
		String length = kb.nextLine();
		return length;
		
	}//end length
	
	public static double calcArea(final String input) {
		if(input == null || input.isEmpty())
			throw new IllegalArgumentException("bad input calcArea");
		double length = Double.parseDouble(input);
		double area = calcArea(length); 
		return area;
		
		
	}//end calcArea
	
	public static double calcArea(final double length) {
		
		if( length == 0)
			throw new IllegalArgumentException("bad input calcAre");
		
		return (((Math.pow((( 2* length * Math.sin(Math.PI/5))), 2)* 5))/(Math.tan(Math.PI/5) * 4)); //area of the pentagon
	}//end calcArea
	
	public static double generateLength(double min, double max) {
		if(min < 0.1 && max < 0.1 || min >= max)
			throw new IllegalArgumentException("bad min and max generate length");
		double length = Math.random()*(max - min +1)+min;
		return length;
	}//end generateLength
	
	public static double readMaxLength(final Scanner kb) {
		if(kb == null)
			throw new IllegalArgumentException ("bad input readMaxLength");
		System.out.println("Enter a length representing a double greater than 0 here: ");
		double length =kb.nextDouble();
		kb.nextLine();
		return length;
		
	}//end readMaxLength
	
	public static void displayResults(final double length, final double area) {
		System.out.printf("The length is: %.1f\n", length);
		System.out.printf("The area is: %.3f\n" , area );
		
		
	}//end displayResults
	
	
	
	
}// end class
