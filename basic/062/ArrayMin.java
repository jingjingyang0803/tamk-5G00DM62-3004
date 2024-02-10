/**
 * @author 	Jingjing Yang <jingjing.yang@tuni.fi>
 * @version     2024.0208 (last modified)
 * @since   	17.0 (miminimum Java version)
 */
class ArrayMin {

    /**
     * Exercise: 6.2
     *     6.2 Function array min
	 *
	 *         Write a function that return minimum value of an integer array
	 *
	 *             int length = 3;
	 *             int array[length] = {3, 1, 2};
	 *
	 * 	    // Write your own function: min(int[], int)
	 *             int min = min(array, length);           // min = 1
     *
     * @param args Command line arguments. Not used.
     * @return No return value (void method).
     */
	public static void main(String[] args) {
		int length = 3;
		int[] array = {3, 1, 2};

		int min = min(array, length);
		System.out.println("Min = " + min);
	}

	/**
	 * Method to find the minimum value in an array
	 * @param array Input array
	 * @param length The number of elements from the start of the array to consider for finding the minimum value.
	 *               If the length is greater than the array length, the method will consider the entire array.
	 *               If the array is empty, or if the length is zero, the behavior is undefined and may result in an exception.
	 * @return The minimum value among the first 'length' elements of the array. If 'length' is greater than the actual
	 *         array length, it returns the minimum value in the entire array.
	 */
	public static int min(int[] array, int length) {
		int min = array[0];
		int maxLength = length > array.length ? array.length : length;

		for (int i = 0; i < maxLength; i++) {
			if (array[i] < min) {
				min = array[i];
			}
		}
		return min;
	}
}

// End of file