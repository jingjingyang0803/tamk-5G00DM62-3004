/**
 * @author Jingjing Yang <jingjing.yang@tuni.fi>
 * @version 2024.0212 (last modified)
 * @since 17.0 (miminimum Java version)
 */
class DrawSquare {

	/**
	 * Displays a square to the screen based on defined SIZE.
	 * <p>
	 * Exercise: 3.4
	 * 3.4 Loop shape square
	 * <p>
	 * Write a program to display a square to the screen based on
	 * defined SIZE. Solve the problem using two nested loops. Output
	 * examples of various sizes set to values 2, 3 and 4.
	 * <p>
	 * xx    xxx   xxxx
	 * xx    xxx   xxxx
	 * ------xxx   xxxx
	 * ------------xxxx
	 *
	 * @param args Command line arguments. Not used.
	 */
	public static void main(String[] args) {
		drawSquare(2);
		System.out.println();
		drawSquare(3);
		System.out.println();
		drawSquare(4);
	}

	/**
	 * Draws a square.
	 *
	 * @param size the size of the square
	 */
	public static void drawSquare(int size) {
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				System.out.print("x");
			}
			System.out.println();
		}
	}
}

// End of file
