/**
 * @author 	Jingjing Yang <jingjing.yang@tuni.fi>
 * @version     2024.0212 (last modified)
 * @since   	17.0 (miminimum Java version)
 */
class ArrayMax {

    /**
     * Displays maximum value of an integer array.
	 *
	 * Exercise: 6.3
     *     6.3 Function array max
	 *
	 *         Write a function that returns maximum value of an integer array
	 *
	 *             int length = 3;
	 *             int array[length] = {3, 1, 2};
	 *
	 * 	    // Write your own function: min(int[], int)
	 *             int value = max(array, length);         // value = 3
     *
     * @param args Command line arguments. Not used.
     */
	public static void main(String[] args) {
		int length = 3;
		int[] array = {3, 1, 2};

		int max = max(array, length);
		System.out.println("Max = " + max);
	}

	/**
	 * Finds the maximum value in an array.
	 *
	 * This method iterates through the elements of the input array up to a
	 * specified length and finds the maximum value.
	 *
	 * @param array  Input array of integers. It should not be null, and should
	 *                  have at least one element.
	 * @param length The number of elements from the start of the array to
	 *                  consider for finding the maximum value. If the length is
	 *                  greater than the array length, the method will consider
	 *                  the entire array. If the array is empty, or if the
	 *                  length is zero, the behavior is undefined and may result
	 *                  in an exception.
	 * @return The maximum value among the first 'length' elements of the array.
	 * 					If 'length' is greater than the actual array length, it
	 * 					returns the maximum value in the entire array.
	 */
	public static int max(int[] array, int length) {
		int max = array[0];
		int maxLength = length > array.length ? array.length : length;

		for (int i = 0; i < maxLength; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		return max;
	}
}

// End of file
