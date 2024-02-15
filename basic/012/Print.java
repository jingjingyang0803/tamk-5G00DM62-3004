import java.time.LocalDate;

/**
 * @author Jingjing Yang <jingjing.yang@tuni.fi>
 * @version 2024.0211 (last modified)
 * @since 17.0 (miminimum Java version)
 */
class Print {

    /**
     * Displays the user's first name. last name, and height (cm) to the screen.
     *
     * Exercise: 1.2
     * 1.2 Program print
     * <p>
     * Write a program to display: date, your first name. last name,
     * and height (in cm) to the screen. Store each information to a
     * separate variable before displaying.
     * <p>
     * The date is YYYY-MM-DD
     * Hello, I'm John Doe
     * I'm 185 cm tall
     *
     * @param args Command line arguments. Not used.
     */
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        String firstName = "Jingjing"; // my first name
        String lastName = "Yang"; // my last name
        int height = 163;// my height in cm

        String fullName = getFullName(firstName, lastName);
        printPersonalDetails(date, fullName, height);
    }

    /**
     * Combines first and last names into a full name.
     *
     * @param firstName The first name.
     * @param lastName  The last name.
     * @return The full name.
     */
    public static String getFullName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }

    /**
     * Prints current date, full name, and height.
     *
     * @param date    The current date.
     * @param fullName The full name.
     * @param height  The height in centimeters.
     */
    public static void printPersonalDetails(LocalDate date, String fullName, int height) {
        System.out.println("The date is " + date);
        System.out.println("Hello, I'm " + fullName);
        System.out.println("I'm " + height + " cm tall");
    }
}

// End of file
