/*
 * Checks if a given year is a leap year or a common year,
 * and computes the number of days in a given month and a given year. 
 */
public class Calendar0 {

	// Gets a year (command-line argument), and tests the functions isLeapYear and nDaysInMonth.
	public static void main(String args[]) {
		int year = Integer.parseInt(args[0]);
		isLeapYearTest(year);
		nDaysInMonthTest(year);
	}

	// Tests the isLeapYear function.
	private static void isLeapYearTest(int year) {
		String commonOrLeap = "common";
		if (isLeapYear(year)) {
			commonOrLeap = "leap";
		}
		System.out.println(year + " is a " + commonOrLeap + " year");
	}

	// Tests the nDaysInMonth function.
	private static void nDaysInMonthTest(int year) {
		 for ( int i =1; i <= 12 ; i++){
			 System.out.println("Month " + i + " has " + nDaysInMonth(i, year) + " days");
		 }

	}


	// Returns true if the given year is a leap year, false otherwise.
	public static boolean isLeapYear(int year) {
		// #feedback - you can avoid creating a new variable and just return the boolean in one line -
		// return (year % 400 == 0) || (((year % 4) == 0) && ((year % 100) != 0));
		boolean isLeapYear = true;
			isLeapYear = (year % 400 == 0);
			isLeapYear = isLeapYear || (((year % 4) == 0) && ((year % 100) != 0));
			return isLeapYear;
	}

	// Returns the number of days in the given month and year.
	// April, June, September, and November have 30 days each.
	// February has 28 days in a common year, and 29 days in a leap year.
	// All the other months have 31 days.
	public static int nDaysInMonth(int month, int year)
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
			if (daysNum == 28 && (isLeapYear(year))) {
				daysNum = 29;
			}
			return daysNum;
	}
	}


