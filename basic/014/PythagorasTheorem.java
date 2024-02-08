/**
 * @author      Jingjing Yang <jingjing.yang@tuni.fi>
 * @version     2024.0208 (last modified)
 * @since       17.0 (miminimum Java version)
 */
class PythagorasTheorem {

	/**
	 * Exercise: 1.4
	 *     1.4 Calculate pythagoras
	 *
	 *         Write a program to to calculate hypotenuse (C) from Pythagorean
	 *         theorem[1]. See math[2] library for power and square root
	 *         functions.
	 *
	 *                2    2     2
	 *              c   = a  +  b
	 *
	 *         [1] https://en.wikipedia.org/wiki/Pythagorean_theorem
	 *         [2] https://docs.oracle.com/en/java/javase/15/docs/api/java.base/java/lang/Math.html
	 *
	 * @param  args  Command line arguments. Not used.
	 * @return No return value (void method).
	 */
	public static void main(String[] args) {
		double a = 3;
		double b = 4;
		double c = calculateHypotenuse(a, b);

		System.out.println("Hypotenuse (c) = " + c);
	}

	/**
	 * This method calculates the hypotenuse of a right-angled triangle.
	 *
	 * @param a The length of side 'a' of the triangle.
	 * @param b The length of side 'b' of the triangle.
	 * @return The length of the hypotenuse of the triangle.
	 */
	public static double calculateHypotenuse(double a, double b) {
		return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
	}
}

// End of file
