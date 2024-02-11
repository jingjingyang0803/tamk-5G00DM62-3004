import java.text.DecimalFormat;

/**
 * @author Jingjing Yang <jingjing.yang@tuni.fi>
 * @version 2024.0211 (last modified)
 * @since 17.0 (miminimum Java version)
 */
class PythagorasTheorem {

	/**
	 * Calculates and prints pythagoras.
	 * <p>
	 * Exercise: 1.4
	 * 1.4 Calculate pythagoras
	 * <p>
	 * Write a program to to calculate hypotenuse (C) from Pythagorean
	 * theorem[1]. See math[2] library for power and square root
	 * functions.
	 * <p>
	 * **2    2     2
	 * c   = a  +  b
	 * <p>
	 * [1] https://en.wikipedia.org/wiki/Pythagorean_theorem
	 * [2] https://docs.oracle.com/en/java/javase/15/docs/api/java.base/java
	 * /lang/Math.html
	 *
	 * @param args Command line arguments. Not used.
	 */
	public static void main(String[] args) {
		double a = 3.2;
		double b = 4.3;
		double c = calculateHypotenuse(a, b);

		DecimalFormat df = new DecimalFormat("0.0");

		System.out.println("Hypotenuse (c) = " + df.format(c));
	}

	/**
	 * Calculates the hypotenuse of a right-angled triangle.
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
