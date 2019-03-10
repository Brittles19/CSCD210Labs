package cscd210Comparators;

import cscd210Classes.LargeInt;

public class ReverseOrderComparator {
	public int compare(LargeInt o1, LargeInt o2) {
		if(o1 == null || o2 == null)
	throw new IllegalArgumentException("Paramaters are empty");
			
			int res = o2.compareTo(o1);
			if(res == 0) {
				o2.equals(o1);
			}else
			if(res < 0) {
				return res;
			}else
			if(res > 0) {
				return res;
			}
		return res;
				
		/*
		 * The compare method first compares the length of the o2 LargeInt to the o1 LargeInt. 
		 * If the lengths are the same, then the individual elements of the o2 string are compared
		 *  to the individual elements of the o1 string.
		 */
	}

}
