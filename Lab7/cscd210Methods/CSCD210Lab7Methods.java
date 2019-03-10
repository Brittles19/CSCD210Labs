package cscd210Methods;


import java.util.Scanner;

public class CSCD210Lab7Methods {
	public CSCD210Lab7Methods() {
		
	}
	

	public static int menu(final Scanner kb) {
		
		if(kb == null)
		throw new IllegalArgumentException("Bad Scanner: no input");
	
	
		int choice;
		
		do {
			System.out.println("Menu Choices are: ");
			System.out.println("1) Enter a new number: ");
			System.out.println("2) Print the number of even/odd/zeros");
			System.out.println("3) Print if the number is light or heavy");
			System.out.println("4) Print the primes from 2 to the entered number");
			System.out.println("5) Quit");
			
			choice = kb.nextInt();
		
	}while(choice < 1 || choice > 5);
		System.out.println();
		return choice;
	}
	public static void lightOrHeavy(int theNum, final Scanner kb) 
	{
		if (theNum < 1)
			throw new IllegalArgumentException("Number cannot be less than one");
		if(kb == null)
			throw new IllegalArgumentException("Empty Scanner");
		
		 int sum = 0; int length = 0; 
		while(theNum > 0) {
			sum = sum + theNum % 10;
			theNum = theNum/10;
			length++;
			
	
		}
		int weight1 = sum / length;
		System.out.print("Enter a Second number here: ");
		int theNum2 = kb.nextInt();
		
		
		 sum = 0;  length = 0; 
		while(theNum2 > 0) {
			sum = sum + theNum2 % 10;
			theNum2 = theNum2/10;
			length++;
		
		{
			int weight2 = sum/length;
			if(weight1 > weight2) {
				System.out.println("The number is heavy");
				
			}else {
				System.out.println("The number is light");
			}
				
			}
		}
	}
	
	public static int readPosNum(Scanner kb) {
		
		if(kb == null)
			throw new IllegalArgumentException("Bad Scanner: no input ");
		int positiveNum = 0;
		do {
			System.out.println("Enter a positive integer greater than 0: ");
			positiveNum = kb.nextInt();
		}while(positiveNum < 0);
			System.out.println();
		
			return positiveNum;
	
		
		
	}
	public static void oddEvenZero(final int theNum) 
	{
		if(theNum < 0)
			throw new IllegalArgumentException("The number cannot be less than 1");
		int even = 0; 
		int odd = 0;
		int zero = 0;
		int digit;
		int alterNum =theNum;
		while(alterNum > 0) 
		{
			digit = alterNum % 10;
			if(digit == 0) {
				zero++;
			}
			else if(digit % 2 == 0) {
					even++;
			}
					
			
			else{
					odd++;
				}
				
				alterNum = alterNum / 10;
		}
		System.out.println("The number of even numbers is:\n " + even +  "\nthe number of odd numbers is:\n " + odd + "\nthe number of zero numbers is\n " + zero);
	}
	
		
	
	
	public static void printPrimes(final int theNum) {
		
		if (theNum < 1)
			throw new IllegalArgumentException("The number cannot be less than one");

		for(int start = 2; start <= theNum; start++ ) {
			int count = 0;
			for(int prime = 2; prime < start; prime++) {
				if (start%prime==0) {
					count++;
	
				}
			} if (count == 0) {
				System.out.print(start);
			}
		
			
		}
			
			
			}
	
			
		
			
				
			
			
		
	}

			
				
			
		
	


