/**
 * @author Jingjing Yang <jingjing.yang@tuni.fi>
 * @version 2024.0211 (last modified)
 * @since 17.0 (miminimum Java version)
 */
class DayName {

    /**
     * Prints the name of a day based on its numerical representation.
     *
     * Exercise: 2.2
     * 2.2 If day
     * <p>
     * Based on DAY value, display its name. Suppose that the week
     * starts from Monday. Utilize constant values.
     * <p>
     * const int MONDAY = 1;
     * ...
     * <p>
     * // This value can be chnaged
     * int today = MONDAY;
     * ... code ...
     * <p>
     * The program outputs string "Monday" based on variable "today".
     * if the value is changed, the output is adjusted accordingly.
     * If the value is not a known date, display "Unknown date (N)",
     * where N is the value. E.g if date is set to:
     * <p>
     * today = 0;
     * <p>
     * Output is:
     * <p>
     * "Unknown date (0)"
     *
     * @param args Command line arguments. Not used.
     */
    public static void main(String[] args) {
        int today = 0;
        printDayName(today);
    }

    /**
     * Prints the name of a day based on its numerical representation.
     *
     * @param today The numerical representation of a day
     */
    public static void printDayName(int today) {
        final int MONDAY = 1;
        final int TUESDAY = 2;
        final int WEDNESDAY = 3;
        final int THURSDAY = 4;
        final int FRIDAY = 5;
        final int SATURDAY = 6;
        final int SUNDAY = 7;

        switch (today) {
            case MONDAY:
                System.out.println("Monday");
                break;
            case TUESDAY:
                System.out.println("Tuesday");
                break;
            case WEDNESDAY:
                System.out.println("Wednesday");
                break;
            case THURSDAY:
                System.out.println("Thursday");
                break;
            case FRIDAY:
                System.out.println("Friday");
                break;
            case SATURDAY:
                System.out.println("Saturday");
                break;
            case SUNDAY:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Unknown date (" + today + ")");
        }
    }
}

// End of file
