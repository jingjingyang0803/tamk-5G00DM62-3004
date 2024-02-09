/**
 * @author 	Jingjing Yang <jingjing.yang@tuni.fi>
 * @version     2024.0208 (last modified)
 * @since   	17.0 (miminimum Java version)
 */
class ReverseArray {

    /**
     * Exercise: 5.1
     *     5.1 Array print
	 *
	 *         Write a program to display values in array in *reverse* order.
	 *
	 *             int array[] = {0, 1, 2, 3, 4, 5};
	 *
	 *         Display:
	 *
	 *             5, 4, 3, 2, 1, 0
     *
     * @param args Command line arguments. Not used.
     * @return No return value (void method).
     */
	public static void main(String[] args) {
		int[] array = {0, 1, 2, 3, 4, 5};
		printReversedArray(array);
	}

	/**
	 * This method prints the array in reverse order.
	 * @param array Input array.
	 * @return No return value (void method).
	 */
	public static void printReversedArray(int[] array) {
		for (int i = array.length - 1; i >= 0; i--) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
}

// End of file
