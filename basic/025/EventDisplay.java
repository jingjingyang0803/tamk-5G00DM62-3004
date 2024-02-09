/**
 * @author 	Jingjing Yang <jingjing.yang@tuni.fi>
 * @version     2024.0208 (last modified)
 * @since   	17.0 (miminimum Java version)
 */
class EventDisplay {

	/**
	 * Exercise: 2.5
	 *     2.5 If calendar
	 *
	 *         Write a program which would display events based on date and
	 *         time. In the beginning of program, define three variables:
	 *
	 *             - weekday (signifying values from Mon...Fri)
	 *             - hour
	 *             - minute
	 *
	 *          Write event notification to the screen if the values match any of:
	 *
	 *             * Mon 19:00-20:30 volleyball
	 *             * Wed 20:30-21:30 badminton
	 *             * Sat 10:00-11:00 gym
	 *
	 *         In case no date and time match, display:
	 *
	 *             No events for WEEKDAY HH:MM
	 *
	 * @param args Command line arguments. Not used.
  	 * @return No return value (void method).
	 */
	public static void main(String[] args) {
		int weekday = 1;
		int hour = 19;
		int minute = 30;
		printEventDisplay(weekday, hour, minute);
	}

	/**
	 * The method printEventDisplay is used to print any events based on the day, hour, and minute.
	 * @param weekday The day of the week
	 * @param hour The hour of the day
	 * @param minute The minute of the hour
	 * @return No return value (void method).
	 */
	public static void printEventDisplay(int weekday, int hour, int minute) {
		final int MONDAY = 1;
		final int TUESDAY = 2;
		final int WEDNESDAY = 3;
		final int THURSDAY = 4;
		final int FRIDAY = 5;
		final int SATURDAY = 6;
		final int SUNDAY = 7;

		String[] days = {"", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

		if (weekday == MONDAY && ((hour == 19 && minute >= 0) || (hour == 20 && minute <= 30))) {
			System.out.println("Volleyball");
		} else if (weekday == WEDNESDAY && ((hour == 20 && minute >= 30) || (hour == 21 && minute <= 30))) {
			System.out.println("Badminton");
		} else if (weekday == SATURDAY && ((hour == 10) || (hour == 11 && minute == 0))) {
			System.out.println("Gym");
		} else {
			String timeFormatted = String.format("%02d:%02d", hour, minute);
			System.out.println("No events for " + days[weekday] + " " + timeFormatted);
		}
	}
}

// End of file
