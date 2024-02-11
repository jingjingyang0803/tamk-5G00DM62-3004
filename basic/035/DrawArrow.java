/**
 * @author Jingjing Yang <jingjing.yang@tuni.fi>
 * @version 2024.0212 (last modified)
 * @since 17.0 (miminimum Java version)
 */
class DrawArrow {

	/**
	 * Displays a pattern of an arrow.
	 * <p>
	 * Exercise: 3.5
	 * 3.5 Loop shape arrow
	 * <p>
	 * Write a program to display following pattern. Solve the problem
	 * using two *NESTED* loops (use 2 inside loops as needed).
	 * The SIZE and the displayed CHARACTER must be configurable.
	 * <p>
	 * int size = 5;
	 * char character[] = "*";
	 * ... code ...
	 * <p>
	 * Output:
	 * <p>
	 * * * * *
	 * * * * *
	 * * * * *
	 * * * * *
	 * * * * *
	 *
	 * @param args Command line arguments. Not used.
	 */
	public static void main(String[] args) {
		int size = 5;
		char character = '*';
		drawArrow(size, character);
	}

	/**
	 * Draws an arrow.
	 *
	 * @param size      the size of the arrow
	 * @param character the character used to draw the arrow
	 */
	public static void drawArrow(int size, char character) {
		// upper half of the arrow
		for (int i = 1; i <= size / 2 + 1; i++) {
			// Inner loop for spaces
			for (int j = 1; j < i; j++) {
				System.out.print("  "); // Print two spaces for each level
			}

			// Inner loop for stars
			for (int k = 1; k <= size - 1; k++) {
				System.out.print(character + " "); // Print star and a space
			}

			System.out.println(); // Move to the next line
		}


		// bottom half of the arrow
		for (int i = size / 2; i >= 1; i--) {
			// Inner loop for spaces
			for (int j = 1; j < i; j++) {
				System.out.print("  "); // Print two spaces for each level
			}

			// Inner loop for stars
			for (int k = 1; k <= size - 1; k++) {
				System.out.print(character + " "); // Print star and a space
			}

			System.out.println(); // Move to the next line
		}
	}
}

// End of file
