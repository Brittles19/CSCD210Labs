package cscd210Utils;


public class SortUtils {
	public static void selectionSort(final int[] myArray) {
	if (myArray ==null || myArray.length <=0)
			
		{
			throw new IllegalArgumentException(" bad array or bad length ");
		}
		
		int temp;
		int start = 0, search = 0, min= 0;
		for (start =0;start<myArray.length-1;start++) {
			min = start;
			
			for(search = start+1; search <myArray.length-1; search++) {
				if ((myArray[search]<(myArray[min]))) {
					min = search;
					
				}
				
				temp = myArray[min];
				myArray[min]= myArray[start];
				myArray [start]= temp;
				
			}
			
		}
		
	}
	public static <LargeInt extends Comparable <? super LargeInt >> void selectionSort(LargeInt[] array) {
		if (array ==null || array.length <= 0)
			
		{
			throw new IllegalArgumentException(" bad array or bad length ");
		}
		
		LargeInt temp ;
		int start=0 ,search=0, min=0;
		for (start =0;start<array.length-1;start++) {
			min = start;
			
			for(search = start+1; search < array.length; search++) {
				if ((array[search].compareTo(array[min]))<0) {
					min = search;
					
				}
				
				temp = array[min];
				array[min]= array[start];
				array [start]= temp;
				
			}
			
		}
		

		
	}

}
