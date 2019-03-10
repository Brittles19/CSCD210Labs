package cscd210Enums;

	public enum Month implements Comparable <Month>
	{
		JAN("january",31), FEB("february",28), MAR("march", 31), APR("april", 30), MAY("may" , 31), JUN("june" , 31), JUL("july", 31), AUG("august", 31), SEP("september", 30), OCT("october", 31), NOV("november",30), DEC("december", 31);

		
		private int days;
		private String month;
		
	
		
		private Month(final String month, final int days) 
		{//Constructor
		this.days = days;
		this.month = month;
		}// end Month
		
	
		@Override
		public String toString() 
		{
			String month = this.month;
			String firstLetter = month.charAt(0) + "";
			firstLetter = firstLetter.toUpperCase();
			String theRest = month.substring(1);
			return firstLetter + theRest;
			
			
			// get the first character using charAt()
			// capitalize that character using touppercase()
			// get the rest of the month using substring
			// return the first character + the rest of the month
		}
		
		public int getDays() 
		{
			int days = this.days;
			return days;
		}

}
	

