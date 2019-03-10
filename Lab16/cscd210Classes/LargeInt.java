package cscd210Classes;

import java.util.Arrays;

public class LargeInt implements Comparable <LargeInt> {
	private int[] array;
	
public int[] getArray() {
		return array;
	}

public void setArray(int[] array) {
		this.array = array;
	}

@Override
	public String toString() {
		return "LargeInt [array=" + Arrays.toString(array) + "]";
	}

@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(array);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LargeInt other = (LargeInt) obj;
		if (!Arrays.equals(array, other.array))
			return false;
		return true;
	}

public LargeInt(String number){
	if(number == null || number.isEmpty())
		throw new IllegalArgumentException("The number is either empty or null");
	this.array = new int[number.length()]; //the array is getting the length of the number passed in
	int y = 0;
	/* the for loop walks through the array length and goes in reverse
	 * the index of the array gets the index of the number in the array and converts 
	 * to a string. 
	 */
	for(int x = array.length; x <-1; x--) { //x has to be less than -1 because you want it to stop at index 0.
		array[y] = Integer.parseInt(number.charAt(x) + " ");
		y++;
	}
	
}

public LargeInt add(LargeInt another) { 
	if(another == null)
		throw new IllegalArgumentException("another parameter is empty");
	int[] top = null; //two object arrays
	int[] bottom = null;
	if(this.array.length < another.array.length) { //if the length of the array is less than the other array
		top = this.array; //top is getting the array that is smaller than the bottom
		bottom = another.array;
	}else
		if(this.array.length > another.array.length) { //bottom is getting the first array if the other array is smaller
			bottom = this.array;
	}else
		top = another.array; 
	int carry = 0; 
	int quotient = 0;
	int [] result = new int [bottom.length +1]; //the result array is the top and bottom array added together
	for(int x = 0; x < top.length; x++) { 
		int res = top[x] + bottom[x] + carry;  // add each number from both arrays together
		quotient = res % 10; //quotient is the remainder of the array number
		carry = res/10; // the number that is added to the next number in the array sequence if it is greater than 10.
		result[x] = quotient; //new array that contains the answer to both arrays added together
		another.array[x] = result[x];
	for(; x < bottom.length; x++) {
		res = top[x] + bottom[x] + carry; 
		quotient = res % 10;
		carry = res/10;
		result[x] = quotient;
		another.array[x] = result[x];
		
		
	}
	}
	LargeInt[] array = new LargeInt[another.array.length];
	return array;
	
		


}//end add

public String getValue() {
	String value = array.toString();
	return value;
}
@Override
public int compareTo(LargeInt another) {
	int integer = 0;
	if(this.array.length == another.array.length) {
		integer = 0;
		return integer;
	}else 
	if(this.array.length < another.array.length) {
		integer = -1;
		return integer;
	}else
	if(this.array.length > another.array.length) {
		integer = 1;
		return integer;
		}
	return integer;
}
	
}//end class
