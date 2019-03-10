package cscd210Utils;

public class SortUtils {
	public static void selectionSort(int[] myArray) 
	{
		if(myArray == null)
			throw new IllegalArgumentException("Array is empty");
		if(myArray.length <= 0)
			throw new IllegalArgumentException("Array does not exist");
		
		int start, min = 0, search;
		for(start =0; start <myArray.length-1; start++) {
			min = start;
			for(search = start+1; search<myArray.length; search++) {
				if(myArray[search]<myArray[min])
					min = search;
			}
		}
		
		int temp = myArray[min];
		myArray[min] = myArray[start];
		myArray[start]= temp;

	}
		

}
