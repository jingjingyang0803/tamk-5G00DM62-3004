/**
 * @author 	Jingjing Yang <jingjing.yang@tuni.fi>
 * @version     2024.0208 (last modified)
 * @since   	17.0 (miminimum Java version)
 */
class ArraySearch {

    /**
     * Exercise: 5.4
     *     5.4 Array search
	 *
	 *         Write a program to search values from array in range MIN..MAX (both
	 *         inclusive). An example:
	 *
	 *             int array[] = {-3, -2, -1, 0, 1, 2, 3};
	 *             int min = -1;
	 *             int max = 2;
	 *
	 *         Program displays:
	 *
	 *             -1, 0, 1, 2
     *
     * @param args Command line arguments. Not used.
     * @return No return value (void method).
     */
	public static void main(String[] args) {
		int[] array = {-3, -2, -1, 0, 1, 2, 3};
		int min = -1;
		int max = 2;
		int[] result = valuesInRange(array, min, max);
		printValuesInArray(result);
	}

	public static void printValuesInArray(int[] array) {
		for (int i = 0; i < array.length; i++ ) {
			if (i == array.length - 1) {
				System.out.println(array[i]);
			}else {
				System.out.print(array[i] + ", ");
			}
		}
		if (array.length == 0)
			System.out.print("The provided array does not contain any values within the specified range.");
	}

	public static int[] valuesInRange(int[] arr, int min, int max) {
		// Count how many elements are in the range
		int count = 0;
		for (int value : arr) {
			if (value >= min && value <= max) {
				count++;
			}
		}

		// Create an array to store the values
		int[] values = new int[count];
		int index = 0;

		// Fill the array with the values in range
		for (int value : arr) {
			if (value >= min && value <= max) {
				values[index++] = value;
			}
		}

		return values;
	}
}

// End of file
