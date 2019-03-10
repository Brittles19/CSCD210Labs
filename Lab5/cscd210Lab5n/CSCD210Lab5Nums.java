package cscd210Lab5n;
import  java.util.Scanner;

public class CSCD210Lab5Nums {

	public static void main(String[] args) {
		int num1, num2, num3, smallest, mid, high; //Variables
		
		Scanner kb = new Scanner(System.in);
		
		System.out.print("Enter first integer here: ");
		num1 = kb.nextInt();
		System.out.print("Enter second integer here: ");
		num2 = kb.nextInt();
		System.out.print("Enter third integer here: ");
		num3 = kb.nextInt();
		
		//finding smallest value
		
		smallest = num1;
		if (num2 < smallest)
			smallest = num2;
		if (num3 < smallest)
			smallest = num3;
		
		high = num1;
		if (num2 > high)
			high = num2;
		if (num3 > high)
			high = num3;
		
		if(num1 != smallest && num1 != high)
			mid = num1;
		else if(num2 != smallest && num2 != high)
			mid = num2;
		else {
			mid = num3;
		}
		System.out.println("The numbers in ascending order: " + smallest + ", " + mid + ", " + high);		
	}
}