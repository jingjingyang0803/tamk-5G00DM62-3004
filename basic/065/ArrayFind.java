/**
 * @author Jingjing Yang <jingjing.yang@tuni.fi>
 * @version 2024.0212 (last modified)
 * @since 17.0 (miminimum Java version)
 */
class ArrayFind {

	/**
	 * Displays first value in range FROM..TO (inclusive)
	 * <p>
	 * Exercise: 6.5
	 * 6.5 Function array find
	 * <p>
	 * Write a function that returns first value in range FROM..TO
	 * (inclusive). In case value is not found return a defined value
	 * NOT_FOUND.
	 * <p>
	 * int length = 3;
	 * int array[length] = {3, 1, 2};
	 * <p>
	 * int from = 2;
	 * int to = 10;
	 * const int NOT_FOUND = -1;  // if no value was found
	 * <p>
	 * // Write your own function: min(int[], int, int, int, int)
	 * int value = max(array, length, from, to, NOT_FOUND); // value = 3
	 *
	 * @param args Command line arguments. Not used.
	 */
	public static void main(String[] args) {
		int length = 3;
		int[] array = {3, 1, 2};
		int from = 2;
		int to = 10;
		final int NOT_FOUND = -1;

		int value = find(array, length, from, to, NOT_FOUND);
		System.out.println("Found value = " + value);
	}

	/**
	 * Finds the first value within a specified range in an array.
	 * <p>
	 * Iterates through the elements of the input array up to a
	 * specified length and returns the first value that falls within the given
	 * range (inclusive of 'from' and 'to'). If no value within the range is
	 * found in the considered portion of the array, a specified 'notFound'
	 * value is returned.
	 *
	 * @param array    Input array of integers. It should not be null, and
	 *                 should have at least one element.
	 * @param length   The number of elements from the start of the array to
	 *                 consider for the search. If the length is greater than
	 *                 the array length, the method will consider the entire
	 *                 array. If the array is empty, or if the length is
	 *                 zero, the 'notFound' value is returned.
	 * @param from     Start of the range (inclusive).
	 * @param to       End of the range (inclusive).
	 * @param notFound Value to return if no value within the specified range is
	 *                 found in the considered portion of the array.
	 * @return The first value found in the specified range within the first
	 * 'length' elements of the array, or 'notFound' if no
	 * such value is found. The range includes both 'from' and
	 * 'to' values.
	 */
	public static int find(int[] array, int length, int from, int to,
						   int notFound) {
		int maxLength = length > array.length ? array.length : length;

		for (int i = 0; i < maxLength; i++) {
			if (array[i] >= from && array[i] <= to) {
				return array[i];
			}
		}
		return notFound;
	}
}

// End of file
