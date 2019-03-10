package cscd210Utils;

import java.io.PrintStream;

public class ArrayUtils {
	public static <T> void printArray(T[] myArray, PrintStream fout) {
		if(myArray == null)
			throw new IllegalArgumentException("empty Array");
		if(fout == null)
			throw new IllegalArgumentException("Output file is empty");
		if(myArray.length <= 0)
			throw new IllegalArgumentException("array cannot have a 0 length");
		for(int x = 0; x <myArray.length; x++) {
			System.out.println(myArray[x]);
		}
		
	}
}
