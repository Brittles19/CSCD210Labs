package cscd210Lab12;
import java.util.Scanner;

import cscd210Classes.CheckingAccount;
public class preconditionMain {
	public static void main(String[] args) {
	
		
		CheckingAccount one = new CheckingAccount(2001556687, 2000.04);

		CheckingAccount two = new CheckingAccount(884116055);

		CheckingAccount three = new CheckingAccount(510301300, 555.66);  
      
		CheckingAccount four = one;
		
		
		Scanner kb = new Scanner (System.in);
		
		
		System.out.println("Enter the amount of money you want to withdrawal here: ");
		

//	if(one.withdrawal < one.withdrawal)
		//System.out.println("Dude, you don't have enough money");
	//if(two.deposit < two.withdrawal)
		//System.out.println("Dude, you don't have enough money");
	//if(three.deposit < three.withdrawal)
		//System.out.println("Dude, you don't have enough money");

	}
}
