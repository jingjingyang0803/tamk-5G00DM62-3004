/**
 * @author Jingjing Yang <jingjing.yang@tuni.fi>
 * @version 2024.0212 (last modified)
 * @since 17.0 (miminimum Java version)
 */
public class PatternDrawer {

	/**
	 * Draws a square.
	 *
	 * @param size   the length of the square's sides
	 * @param symbol the character used to draw the square
	 */
	public void drawSquare(int size, char symbol) {
		// This is a simple implementation of drawing a square
		for (int i = 0; i < size; i++) {

			for (int j = 0; j < size; j++) {
				System.out.print(symbol + " ");
			}

			System.out.println();
		}
	}

	/**
	 * Draws a rectangle.
	 *
	 * @param width  the width of the rectangle
	 * @param height the height of the rectangle
	 * @param symbol the character used to draw the rectangle
	 */
	public void drawRectangle(int width, int height, char symbol) {
		// This is a simple implementation of drawing a rectangle
		for (int i = 0; i < height; i++) {

			for (int j = 0; j < width; j++) {
				System.out.print(symbol + " ");
			}

			System.out.println();
		}
	}


	/**
	 * Draws a right-angled triangle.
	 *
	 * @param size   the size of the triangle's sides
	 * @param symbol the character used to draw the triangle
	 */
	public void drawTriangle(int size, char symbol) {
		// This is a simple implementation of drawing a right-angled triangle
		for (int i = 0; i < size; i++) {

			for (int j = 0; j <= i; j++) {
				System.out.print(symbol + " ");
			}

			System.out.println();
		}
	}

	/**
	 * Draws a diamond.
	 *
	 * @param size   the size of the diamond
	 * @param symbol the character used to draw the diamond
	 */
	public void drawDiamond(int size, char symbol) {
		// This is a simple implementation of drawing a diamond
		int i, j, k;

		// Upper half of the diamond (including the middle line)
		for (i = 0; i <= size; i++) {
			// Print leading spaces
			for (j = size; j > i; j--) {
				System.out.print(" ");
			}

			// Print symbols with a space
			for (k = 0; k < (2 * i + 1); k++) {
				if (k % 2 == 0) {
					System.out.print(symbol);
				} else {
					System.out.print(" ");
				}
			}

			System.out.println();
		}

		// Lower half of the diamond
		for (i = size - 1; i >= 0; i--) {
			// Print leading spaces
			for (j = size; j > i; j--) {
				System.out.print(" ");
			}

			// Print symbols with a space
			for (k = 0; k < (2 * i + 1); k++) {
				if (k % 2 == 0) {
					System.out.print(symbol);
				} else {
					System.out.print(" ");
				}
			}

			System.out.println();
		}
	}


	/**
	 * Draws a heart shape.
	 *
	 * @param size   the size of the heart
	 * @param symbol the character used to draw the heart
	 */
	public void drawHeart(int size, char symbol) {
		// This is a simple implementation of drawing a heart shape

		for (int y = -size; y <= 2 * size; y++) {

			for (int x = -2 * size; x <= 2 * size; x++)

				if ((y <= 0 &&
						((int) Math.sqrt((x + size) * (x + size) + y * y) <= size
								|| (int) Math.sqrt((x - size) * (x - size) + y * y)
								<= size))
						|| (y > 0 && Math.abs(x) <= 2 * size - y))
					System.out.print(symbol + " ");
				else
					System.out.print("  ");

			System.out.println();
		}

	}
}