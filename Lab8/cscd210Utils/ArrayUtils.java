package cscd210Utils;

import java.util.Scanner;

public class ArrayUtils {
	public static int[] addNum( final int[] myArray, final Scanner kb){
		if(kb == null)
			throw new IllegalArgumentException("Scanner is empty");
		if(myArray == null)
			throw new IllegalArgumentException("Empty Array");
		if(myArray.length <= 0)
			throw new IllegalArgumentException("Array cannot be less than 0 or 0");
			
		
		int num = 0;
		int[] newArray = new int[myArray.length+1];   //new array gets the length of myArray plus 1 index	
		
			System.out.println("Enter a value that can be added to the last index of the array: ");
			num = kb.nextInt();
			for(int i=0; i< myArray.length; i++) {//increment through the new Array	
				newArray[i] = myArray[i]; //the last index of the array gets the number added on
			}
			newArray[myArray.length] = num; //last index gets number that is passed in
			return newArray;
	}
	
	public static int[] deleteValue( final int[] myArray, final Scanner kb) {
		
		if(kb == null)
			throw new IllegalArgumentException("Scanner is empty");
		if(myArray == null)
			throw new IllegalArgumentException("Empty Array");
		if(myArray.length <= 0)
			throw new IllegalArgumentException("Array cannot be less than or equal to 0");
		
		System.out.println("Enter a value that you want to delete from the array: ");
		int val = kb.nextInt();
		int[] newArray = new int[myArray.length -1];
		linearSearch(myArray, val);
		if(val >= 0 && val < myArray.length) {
			for(int i = 0, x = 0; i < myArray.length - 1; i++, x++) {
				if(i != val) {
					newArray[i] = myArray[x];
				} else {
					x++;
					newArray[i] = myArray[x];
				}
			}
		} else {
				System.out.println("Value is NOT found");
				return myArray;
			
		}
		return newArray;

		}

	public static int linearSearch(final int[] myArray, final int target) {
			for(int i = 0; i < myArray.length; i++) {
				if(myArray[i] == target)
					return i;
			}
			return -1;
		}
	
	public static int[] deleteValueByIndex(final int[] myArray, final Scanner kb) {
			if(kb == null) {
				throw new IllegalArgumentException("Scanner is empty");
			}
			if(myArray == null) {
				throw new IllegalArgumentException("Array is empty");
			}
			if(myArray.length <= 0) {
				throw new IllegalArgumentException("Array does not exist");
			}
			int[] newArray = new int[myArray.length - 1];
			System.out.println("Enter an index number that is between 0 and the array length minus 1: ");
			int index = kb.nextInt();
			//int result = linearSearch(myArray, index);
		
			if(index >= 0 && index < myArray.length) {
				for(int i = 0, x = 0; i < myArray.length - 1; i++, x++) { //consider both indexes for both arrays 
					if(i != index) { 
						newArray[i] = myArray[x];
					} else {
						x++;
						newArray[i] = myArray[x];
					}
				}
			} else {
					System.out.println("Value is NOT found");
					return myArray;
				
			}
			return newArray;
		}
	
	public static void printArray(int[] myArray) {
	
		for(int i = 0; i < myArray.length; i++) {
		System.out.println(myArray[i]); //can you please print bruh?
		}
		
	}
	
	
	public static int[] createAndFillArray(final int num, final Scanner kb) {
		if (num <= 0)
			throw new IllegalArgumentException("Number cannot be less than zero OR zero");
		if(kb == null)
			throw new IllegalArgumentException("Empty Scanner");
		
		int[] array = new int[num]; //created array gets passed in value index of a number
		System.out.println("Enter integer(s) here to fill the array: ");
		for(int i=0; i < array.length; i++) {
		array[i] = kb.nextInt(); //the arrays index gets the input to fill the array
			
		}
			return array;
	}
}
