/**
 * @author Jingjing Yang <jingjing.yang@tuni.fi>
 * @version 2024.0211 (last modified)
 * @since 17.0 (miminimum Java version)
 */
class OrderValues {

	/**
	 * Determines and prints the order of three numbers.
	 * <p>
	 * Exercise: 2.1
	 * 2.1 If choices
	 * <p>
	 * Write a program to decide the order of three values. The
	 * program must work even if any of the values are changed.
	 * <p>
	 * // These values can be changed
	 * int a = 15;
	 * int b = 4
	 * int c = 7;
	 * ... code ...
	 * <p>
	 * Output:
	 * <p>
	 * 15 is the biggest
	 * 7 is in the middle
	 * 4 is the smallest
	 *
	 * @param args Command line arguments. Not used.
	 * @return No return value (void method).
	 */
	public static void main(String[] args) {
		int a = 15, b = 4, c = 7;
		printOrder(a, b, c);
	}

	/**
	 * Determines the order of three numbers.
	 *
	 * @param a The first number
	 * @param b The second number
	 * @param c The third number
	 */
	public static void printOrder(int a, int b, int c) {
		int biggest, middle, smallest;
		if (a > b) {

			if (a > c) {
				biggest = a;

				if (b > c) {
					middle = b;
					smallest = c;
				} else {
					middle = c;
					smallest = b;
				}
			} else {
				biggest = c;
				middle = a;
				smallest = b;
			}
		} else {

			if (b > c) {
				biggest = b;
				if (a > c) {
					middle = a;
					smallest = c;
				} else {
					middle = c;
					smallest = a;
				}
			} else {
				biggest = c;
				middle = b;
				smallest = a;
			}
		}

		printResults(biggest, middle, smallest);
	}

	/**
	 * Prints the results of the order of three numbers.
	 *
	 * @param biggest  The biggest number
	 * @param middle   The middle number
	 * @param smallest The smallest number
	 * @return No return value (void method).
	 */
	public static void printResults(int biggest, int middle, int smallest) {
		System.out.println(biggest + " is the biggest");
		System.out.println(middle + " is in the middle");
		System.out.println(smallest + " is the smallest");
	}
}

// End of file
