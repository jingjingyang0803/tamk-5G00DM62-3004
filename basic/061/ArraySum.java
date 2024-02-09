/**
 * @author 	Jingjing Yang <jingjing.yang@tuni.fi>
 * @version     2024.0208 (last modified)
 * @since   	17.0 (miminimum Java version)
 */
class ArraySum {

    /**
     * Exercise: 6.1
     *     6.1 Function array sum
	 *
	 *         Write a function that calculates sum of an integer array.
	 *
	 *             int length = 3;
	 *             int array[length] = {3, 1, 2};
	 *
	 * 	    // Write your own function: sum(int[], int)
	 *             int sum = sum(array, length);         // sum = 6
     *
     * @param args Command line arguments. Not used.
     * @return No return value (void method).
     */
	public static void main(String[] args) {
		int length = 3;
		int[] array = {3, 1, 2};

		int sum = sum(array,length);
		System.out.println("Sum = " + sum);
	}

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
