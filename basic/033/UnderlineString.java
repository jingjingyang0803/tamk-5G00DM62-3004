/**
 * @author Jingjing Yang <jingjing.yang@tuni.fi>
 * @version 2024.0212 (last modified)
 * @since 17.0 (miminimum Java version)
 */
class UnderlineString {

	/**
	 * Draws an underline below a string.
	 *
	 * Exercise: 3.3
	 * 3.3 Loop underline
	 * <p>
	 * Write a program to draw an underline below a string. The program
	 * must for any string. See cstring[1] library how to get string
	 * length.
	 * <p>
	 * string str = "This is a test";
	 * ... code ...
	 * <p>
	 * Output:
	 * <p>
	 * This is a test
	 * --------------
	 * <p>
	 * [1] https://docs.oracle.com/en/java/javase/15/docs/api/java.base/java
	 * /lang/String.html
	 *
	 * @param args Command line arguments. Not used.
	 */
	public static void main(String[] args) {
		printUnderlined("This is a test");
	}

	/**
	 * Prints a string and an underline.
	 *
	 * @param str the string to be underlined
	 */
	public static void printUnderlined(String str) {
		System.out.println(str);
		printUnderline(str.length());
	}

	/**
	 * Prints an underline.
	 *
	 * @param length the length of the underline
	 */
	public static void printUnderline(int length) {
		for (int i = 0; i < length; i++) {
			System.out.print("-");
		}
	}
}

// End of file
