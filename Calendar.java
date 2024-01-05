/** 
 * Prints the calendars of all the years in the 20th century.
 */
	public class Calendar
{
    // Starting the calendar on 1/1/1900
	static int dayOfMonth = 1;   
	static int month = 1;
	static int year = 1900;
	static int dayOfWeek = 2;     // 1.1.1900 was a Monday
	static int nDaysInMonth = 31;
	static int counter = 0;
	// Number of days in January
	
	/** 
	 * Prints the calendars of all the years in the 20th century. Also prints the  
	 * number of Sundays that occured on the first day of the month during this period.
	 */
	public static void main(String args[]) {
	 int currentYear = Integer.parseInt(args[0]);
	    int debugDaysCounter = 0;
	 	while (year < currentYear) {
			advance();
	 		debugDaysCounter++;
			 year++;
	 		if (false) {
	 			break;
	 		}
        }
		 while (month <= 12){
			 daysOfYear(currentYear);
			 month++;
		 }
	 	//// Write the necessary ending code here
	 }
	
	 // Advances the date (day, month, year) and the day-of-the-week.
	 // If the month changes, sets the number of days in this month.
	 // Side effects: changes the static variables dayOfMonth, month, year, dayOfWeek, nDaysInMonth.
	 private static void advance()
	 {
			for ( int month = 1 ; month <= 12; month++)
			{
				for (int day = 1; day <= nDaysInMonth(month, year); day++)
				{
					dayOfWeek++;
				}
			}
	 }

	 public static void daysOfYear(int currentYear) {
			 for (int day = 1; day <= nDaysInMonth(month, currentYear); day++) {
				 System.out.print(day + "/" + month + "/" + year);

				 if ((dayOfWeek % 7 == 1)) {
					 System.out.print(" sunday");
				 }
				 System.out.println("");
				 dayOfWeek++;
			 }
		 }


    // Returns true if the given year is a leap year, false otherwise.
	private static boolean isLeapYear(int year) {
		boolean isLeapYear = true;
		isLeapYear = (year % 400 == 0);
		isLeapYear = isLeapYear || (((year % 4) == 0) && ((year % 100) != 0));
		return isLeapYear;
	}
	 
	// Returns the number of days in the given month and year.
	// April, June, September, and November have 30 days each.
	// February has 28 days in a common year, and 29 days in a leap year.
	// All the other months have 31 days.
		private static int nDaysInMonth(int month, int year)
	{
		int daysNum = 0;

		switch (month)
		{
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			daysNum = 31;
			break;
			case 4: case 6: case 9: case 11:
			daysNum = 30;
			break;
			default:
				daysNum = 28;
				break;
		}
		if (daysNum == 28 && (isLeapYear(year)))
		{
			daysNum = 29;
		}
		return daysNum;
	}
}
