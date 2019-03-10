package cscd210Comparators;

import java.util.Comparator;

import cscd210Enums.Month;

public class MonthDayOrdinalComparator implements Comparator<Month> {
	public int compare(Month m1, Month m2) {
		if(m1 == null || m2 == null)
			throw new IllegalArgumentException("Bad parameters");
		return ((m1.getDays() - m2.getDays()) + (m1.compareTo(m2))); 
	}
	

}
