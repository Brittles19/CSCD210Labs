package cscd210Utils;

public class IntStatisticsUtils {
	public static double computeMean(final int[] myArray) {
		if(myArray == null)
			throw new IllegalArgumentException("Empty Array");
		if(myArray.length <= 0)
			throw new IllegalArgumentException("Array cannot be less than or equal to zero");
		
		double sum = 0, mean;
		for(int i = 0; i < myArray.length; i++) {
			sum += myArray[i]; //add up each index
		}
		mean = sum/(double)myArray.length;
		return mean;
		
	}
	
	
	public static void printResults(final String type, final double result) {
		if(type == null)
			throw new IllegalArgumentException("Type is null");
		if(type.isEmpty())
			throw new IllegalArgumentException("type is empty");
		System.out.println("The " + type + " is: "  + result);
	}
	
	public static double computeMedian( int[] myArray) {
		if(myArray == null)
			throw new IllegalArgumentException("Array is empty");
		if(myArray.length <= 0)
			throw new IllegalArgumentException("Array does not exist");
		
		SortUtils.selectionSort(myArray);
		
		double index1=0, index2=0, median =0;
		if(myArray.length%2==0) {
			index1 = myArray.length/2.0;
			index2 = index1 -(myArray.length -1);
			median = index2;
	
		
		}else
			if(myArray.length%2 != 0) {
				median = myArray.length/(double)2;
				
			}
		System.out.print(median);
		return median;
	
		
	}
	public static double computeMidpoint(final int[] myArray) {
		if(myArray == null)
			throw new IllegalArgumentException("Array is empty");
		if(myArray.length <= 0)
			throw new IllegalArgumentException("Array does not exist");
		SortUtils.selectionSort(myArray);
		double start, end, midpoint = 0.00; 
		for(int i =0; i < myArray.length; i++) {
		start = myArray[0]; //first index in array
		end = myArray[myArray.length-1]; //the last index of the array
		midpoint = (start + end)/2;
		}
		return midpoint;
		
	}
	
	public static double computeStdDev( final int[] myArray) { 
		if(myArray == null)
			throw new IllegalArgumentException("Array is empty");
		if(myArray.length <= 0)
			throw new IllegalArgumentException("Array does not exist");
		
		double mean = computeMean(myArray);
		double devs; //deviations
		double stdDev = 0;
		
		double[] arrayDev = new double[myArray.length];
		for(int i = 0; i < myArray.length; i++) { 
		devs = myArray[i] - mean; //index value in array - mean to get deviations
		arrayDev[i] = devs; //replace those deviations in the array. arrayDev is the array with deviations 
		stdDev = Math.sqrt((Math.pow(arrayDev[i], 2) + mean / myArray.length-1));
		}
		return stdDev;
		

		
		
		
	}
}

