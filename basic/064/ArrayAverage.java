/**
 * @author 	Jingjing Yang <jingjing.yang@tuni.fi>
 * @version     2024.0212 (last modified)
 * @since   	17.0 (miminimum Java version)
 */
class ArrayAverage {

    /**
     * Calculates and displays average of an integer array.
	 *
	 * Exercise: 6.4
     *     6.4 Function array average
	 *
	 *         Write a function that calculates average of an integer array
	 *
	 *             int length = 3;
	 *             int array[length] = {3, 1, 2};
	 *
	 * 	    // Write your own function: min(int[], int)
	 *             int value = average(array, length);     // value = 2
     *
     * @param args Command line arguments. Not used.
     */
	public static void main(String[] args) {
		int length = 3;
		int[] array = {3, 1, 2};

		double avg = average(array,length);
		System.out.println("Average = " + avg);
	}

	/**
	 * Calculates the average value of an array.
	 *
	 * Sums up the elements of the input array up to a specified
	 * length and then calculates the average.
	 *
	 * @param array  Input array of integers. It should not be null, and should
	 *                  have at least one element.
	 * @param length The number of elements from the start of the array to
	 *                  consider for calculating the average. If the length is
	 *                  greater than the array length, the method will consider
	 *                  the entire array. If the array is empty, or if the
	 *                  length is zero, the behavior is undefined and may result
	 *                  in an exception.
	 * @return The average value calculated as a double among the first 'length'
	 * 					elements of the array. If 'length' is greater than the
	 * 					actual array length, it calculates the average over the
	 * 					entire array. The average is calculated as the sum of
	 * 					the considered elements divided by the number of these
	 * 					elements.
	 */
	public static double average(int[] array, int length) {
		double sum = 0;
		int maxLength = length > array.length ? array.length : length;

		for (int i = 0; i < maxLength; i++) {
			sum += array[i];
		}
		return sum / maxLength;
	}
}

// End of file
