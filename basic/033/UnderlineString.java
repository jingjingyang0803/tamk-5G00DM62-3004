/**
 * @author 	Jingjing Yang <jingjing.yang@tuni.fi>
 * @version     2024.0208 (last modified)
 * @since   	17.0 (miminimum Java version)
 */
class UnderlineString {

    /**
     * Exercise: 3.3
     *      3.3 Loop underline
	 *
	 *         Write a program to draw an underline below a string. The program
	 *         must for any string. See cstring[1] library how to get string
	 *         length.
	 *
	 *             string str = "This is a test";
	 *             ... code ...
	 *
	 *         Output:
	 *
	 *                 This is a test
	 *                 --------------
	 *
	 *         [1] https://docs.oracle.com/en/java/javase/15/docs/api/java.base/java/lang/String.html
     *
     * @param args Command line arguments. Not used.
     * @return No return value (void method).
     */
	public static void main(String[] args) {
		printUnderlined("This is a test");
	}

	/**
	 * This method prints a string and an underline.
	 * @param str the string to be underlined
	 * @return No return value (void method).
	 */
	public static void printUnderlined(String str) {
		System.out.println(str);
		printUnderline(str.length());
	}

	/**
	 * This method prints an underline.
	 * @param length the length of the underline
	 * @return No return value (void method).
	 */
	public static void printUnderline(int length) {
		for (int i = 0; i < length; i++) {
			System.out.print("-");
		}
	}
}

// End of file
