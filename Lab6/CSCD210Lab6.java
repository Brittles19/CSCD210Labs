package cscd210Lab6;
/**
 * 
 */


import java.util.Scanner;
import java.util.Random;

/**
 * @author ssteiner
 *
 */
public class CSCD210Lab6
{

	/**
	 * The main method
	 * @param args Representing command line input
	 */
	public static void main(String[] args)
	{
		int choice;
		String input = null;
		double length, area, max;
	    
	    Scanner kb = new Scanner(System.in);
	 
	    
	    do
	    {
	    	choice = CSCD210Lab6Methods.menu(kb);
	    	
	    	if(choice == 1)
	    	{
	    		input = CSCD210Lab6Methods.readLength(kb);
	    		area = CSCD210Lab6Methods.calcArea(input);
	    		CSCD210Lab6Methods.displayResults(Double.valueOf(input), area);	    		
	    	}
	    	
	    	else if(choice == 2)
	    	{
	    		max = CSCD210Lab6Methods.readMaxLength(kb);
	    		length = CSCD210Lab6Methods.generateLength(0.1, max);
	    		area = CSCD210Lab6Methods.calcArea(length);
	    		CSCD210Lab6Methods.displayResults(length, area);
	    	}
	    	else
	    		System.out.println("Thank you for playing");
	    	
	    }while(choice != 3);
	    
	}// end main

}// end class
