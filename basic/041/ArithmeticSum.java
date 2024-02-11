/**
 * @author 	Jingjing Yang <jingjing.yang@tuni.fi>
 * @version     2024.0212 (last modified)
 * @since   	17.0 (miminimum Java version)
 */
class ArithmeticSum {

    /**
     * Calculates arithmetic sum.
	 *
	 * Exercise: 4.1
     *     4.1 Function sum
	 *
	 *         Write a function to calculate arithmetic sum.
	 *
	 *             // int sum(int)
	 *             int total = sum(10)        // 1 + 2 + 3 ... N
     *
     * @param args Command line arguments. Not used.
     */
	public static void main(String[] args) {
		int n = 10;
		int total = sum(n);
		System.out.println("Arithmetic sum(" + n + ") = " + total);
	}

	/**
	 * Calculates the arithmetic sum of first n numbers.
	 *
	 * @param n The number till where sum is to be calculated.
	 * @return The arithmetic sum of first n numbers.
	 */
	public static int sum(int n) {
		return n * (n + 1) / 2;
	}
}

// End of file
