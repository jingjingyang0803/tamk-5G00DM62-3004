/**
 * @author Jingjing Yang <jingjing.yang@tuni.fi>
 * @version 2024.0210 (last modified)
 * @since 17.0 (miminimum Java version)
 */
class Calculator {

	/**
	 * Adds two integers.
	 *
	 * @param a the first integer
	 * @param b the second integer
	 * @return the sum of a and b
	 */
	public int add (int a, int b) {
		return a + b;
	}

	/**
	 * Subtracts one integer from another.
	 *
	 * @param a the first integer
	 * @param b the second integer
	 * @return the difference of a and b
	 */
	public int subtract(int a, int b) {
		return a - b;
	}

	/**
	 * Multiplies two integers.
	 *
	 * @param a the first integer
	 * @param b the second integer
	 * @return the product of a and b
	 */
	public int multiply(int a, int b) {
		return a * b;
	}

	/**
	 * Divides one integer by another.
	 *
	 * @param a the dividend
	 * @param b the divisor
	 * @return the quotient of a and b
	 * @throws IllegalArgumentException if b is 0
	 */
	public int divide(int a, int b) {
		if (b == 0) {
			throw new IllegalArgumentException("Cannot divide by zero");
		}

		return a / b;
	}

	/**
	 * Squares an integer.
	 *
	 * @param a the integer to be squared
	 * @return the square of a
	 */
	public int square(int a) {
		return a * a;
	}
}
