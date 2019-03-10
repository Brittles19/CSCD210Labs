package cscd210Lab5s;
import java.util.Scanner;

public class CSCD210Lab5Strings {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		String fruitOne, fruitTwo, fruitThree = null;
		String low = null; 
		String mid = null;
		String high = null; //Lowest - Highest
		
		System.out.print("Enter the first fruit: ");
		fruitOne = kb.nextLine();
		System.out.print("Enter the second fruit: ");
		fruitTwo = kb.nextLine();
		System.out.print("Enter the third fruit: ");
		fruitThree = kb.nextLine();
	
	//set to lower case
		fruitOne = fruitOne.toLowerCase();
		fruitTwo = fruitTwo.toLowerCase();
		fruitThree = fruitThree.toLowerCase();
		

//comparable booleans		
		if(fruitOne.compareTo(fruitTwo) <= 0 && fruitOne.compareTo(fruitThree) <= 0) {
			low = fruitOne;
			if (fruitTwo.compareTo(fruitThree) <=0) {
				mid = fruitTwo;
				high = fruitThree;
			}else {
				mid = fruitThree;
				high = fruitTwo;
			}
		}else if(fruitTwo.compareTo(fruitOne) <= 0 && fruitTwo.compareTo(fruitThree) <= 0) {
			low = fruitTwo;
			if(fruitThree.compareTo(fruitOne) <= 0) {
				mid = fruitThree;
				high = fruitOne;
				
			}
			else {
				mid = fruitOne;
				high = fruitThree;
			}
		}
		
		else if (fruitThree.compareTo(fruitOne) <=0 && fruitThree.compareTo(fruitThree) <=0) {
			low = fruitThree;
			
			if (fruitTwo.compareTo(fruitOne) <=0) {
				mid = fruitTwo;
				high = fruitThree;
			}
			else {
				mid = fruitThree;
				high = fruitTwo;
			}
		}
		System.out.print("The fruits in ascending order: " + low + ", " + mid + ", " + high);
	}
}
