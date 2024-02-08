import java.time.LocalDate;

/**
 * @author 		Jingjing Yang <jingjing.yang@tuni.fi>
 * @version     2024.0208 (last modified)
 * @since   	17.0 (miminimum Java version)
 */
class Print {

	/**
	 * Exercise: 1.2
	 *    1.2 Program print
	 *
	 *         Write a program to display: date, your first name. last name,
	 *         and height (in cm) to the screen. Store each information to a
	 *         separate variable before displaying.
	 *
	 *             The date is YYYY-MM-DD
	 *             Hello, I'm John Doe
	 *             I'm 185 cm tall
	 *
	 * @param  args  Command line arguments. Not used.
	 * @return No return value (void method).
	 */
	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		String firstName = "Jingjing"; // my first name
		String lastName = "Yang"; // my last name
		int height = 163;// my height in cm

		printPersonalDetails(date, firstName, lastName, height);
	}

	/**
	 * This method prints personal details including the current date, full name, and height.
	 *
	 * @param date      The current date.
	 * @param firstName The first name.
	 * @param lastName  The last name.
	 * @param height    The height in centimeters.
	 * @return No return value (void method).
	 */
	public static void printPersonalDetails(LocalDate date, String firstName, String lastName, int height) {
		System.out.println("The date is " + date);
		System.out.println("Hello, I'm " + firstName + " " + lastName);
		System.out.println("I'm " + height + " cm tall");
	}
}

// End of file
