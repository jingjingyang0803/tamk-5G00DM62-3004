/**
 * @author Jingjing Yang <jingjing.yang@tuni.fi>
 * @version 2024.0212 (last modified)
 * @since 17.0 (miminimum Java version)
 */
class ArraySum {

	/**
	 * Calculates sum of an integer array.
	 *
	 * Exercise: 6.1
	 * 6.1 Function array sum
	 * <p>
	 * Write a function that calculates sum of an integer array.
	 * <p>
	 * int length = 3;
	 * int array[length] = {3, 1, 2};
	 * <p>
	 * // Write your own function: sum(int[], int)
	 * int sum = sum(array, length);         // sum = 6
	 *
	 * @param args Command line arguments. Not used.
	 */
	public static void main(String[] args) {
		int length = 3;
		int[] array = {3, 1, 2};

		int sum = sum(array, length);
		System.out.println("Sum = " + sum);
	}

	/**
	 * Calculates the sum of values in an array.
	 *
	 * @param array  The input array of integers.
	 * @param length The number of elements from the start of the array to be
	 *               summed. If 'length' is greater than the array's length,
	 *               the method sums the entire array. The behavior is
	 *               undefined if the array is empty or if 'length' is zero,
	 *               which may result in an exception.
	 * @return The sum of the first 'length' elements of the array.
	 * If 'length' exceeds the array's length, the sum of the
	 * entire array is returned.
	 */
	public static int sum(int[] array, int length) {
		int sum = 0;
		int maxLength = length > array.length ? array.length : length;

		for (int i = 0; i < maxLength; i++) {
			sum += array[i];
		}
		return sum;
	}
}

// End of file
