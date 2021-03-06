package cscd210Utils;

public class SortUtils {
	public static void selectionSort(Comparable[] array) throws Exception{
		if(array == null || array.length <= 0)
			throw new IllegalArgumentException("Bad comparable Array");
		if(array == null)
			throw new IllegalArgumentException("Array is empty");
		if(array.length <= 0)
			throw new IllegalArgumentException("Array does not exist");
		
		int start, min = 0, search;
		for(start =0; start <array.length-1; start++) {
			min = start;
			for(search = start+1; search<array.length -1; search++) {
				if(array[search].compareTo(array[min]) < 0)
					min = search;
			}
				Comparable temp =array[min];
				array[min] = array[start];
				array[start]= temp;

		}
	}
		public static void selectionSort(int[] myArray) throws Exception{
			if(myArray == null || myArray.length <= 0)
				throw new IllegalArgumentException("Bad comparable Array");
			if(myArray == null)
				throw new IllegalArgumentException("Array is empty");
			if(myArray.length <= 0)
				throw new IllegalArgumentException("Array does not exist");
			
			int start, min = 0, search;
			for(start =0; start <myArray.length-1; start++) {
				min = start;
				for(search = start+1; search<myArray.length -1; search++) {
					if(myArray[search] < myArray[min])
						min = search;
				}
					int temp =myArray[min];
					myArray[min] = myArray[start];
					myArray[start]= temp;

			}	


}
}
