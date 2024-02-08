/**
 * @author Jingjing Yang <jingjing.yang@tuni.fi>
 * @version 2024.0208 (last modified)
 * @since 17.0 (miminimum Java version)
 */
class Hello {

	/**
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
  	 * @return No return value (void method).
	 */
	public static void main(String[] args) {
		String name = "Jingjing Yang";
		String content = "Hello, I am " + name; // The content to be displayed in the box
		char symbol = '*'; // The symbol used to create the box
		box(content, symbol);
	}

	public static void box(String content, char symbol) {
		int length = content.length();
		char ch = symbol;
		row(length, ch);
		System.out.println("\n" + ch + " " + content + " " + ch);
		row(length, ch);
	}

	public static void row(int length, char symbol) {
		for (int i = 0; i < length + 4; i++) {
			System.out.print(symbol);
		}
	}
}

// End of file
