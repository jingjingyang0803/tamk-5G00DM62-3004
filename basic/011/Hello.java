/**
 * @author Jingjing Yang <jingjing.yang@tuni.fi>
 * @version 2024.0211 (last modified)
 * @since 17.0 (miminimum Java version)
 */
class Hello {

	/**
	 * Displays the user's name in a box created by *.
	 * <p>
	 * Exercise: 1.1
	 * 1.1 Program hello
	 * <p>
	 * Write a program to display your name in a box
	 * <p>
	 * ************************
	 * * Hello, I am John Doe *
	 * ************************
	 *
	 * @param args Command line arguments. Not used.
	 */
	public static void main(String[] args) {
		String name = "Jingjing Yang";
		// The content to be displayed in the box
		String content = "Hello, I am " + name;
		char symbol = '*'; // The symbol used to create the box
		box(content, symbol);
	}

	/**
	 * Prints a string content within a box made of a specified symbol.
	 *
	 * @param content The string to be printed inside the box.
	 * @param symbol  The character used to create the box around the content.
	 */
	public static void box(String content, char symbol) {
		int length = content.length();
		char ch = symbol;
		row(length, ch);
		System.out.println("\n" + ch + " " + content + " " + ch);
		row(length, ch);
	}

	/**
	 * Prints a row of symbols, used as part of the box in the box method.
	 *
	 * @param length The length of the content around which
	 *               the box is to be created.
	 * @param symbol The character used to create the row in the box
	 */
	public static void row(int length, char symbol) {
		for (int i = 0; i < length + 4; i++) {
			System.out.print(symbol);
		}
	}
}

// End of file
