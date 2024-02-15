/**
 * @author Jingjing Yang <jingjing.yang@tuni.fi>
 * @version 2024.0212 (last modified)
 * @since 17.0 (miminimum Java version)
 */
class ArraySearch {

    /**
     * Searchs values from array in range MIN..MAX (both inclusive).
     *
     * Exercise: 5.4
     * 5.4 Array search
     * <p>
     * Write a program to search values from array in range MIN..MAX
     * (both inclusive). An example:
     * <p>
     * int array[] = {-3, -2, -1, 0, 1, 2, 3};
     * int min = -1;
     * int max = 2;
     * <p>
     * Program displays:
     * <p>
     * -1, 0, 1, 2
     *
     * @param args Command line arguments. Not used.
     */
    public static void main(String[] args) {
        int[] array = {-3, -2, -1, 0, 1, 2, 3};
        int min = -1;
        int max = 2;
        int[] result = valuesInRange(array, min, max);
        printValuesInArray(result);
    }

    /**
     * Prints the elements of the given array, separated by commas.
     *
     * If the array is empty, a specific message is displayed.
     *
     * @param array The array of integers to be printed.
     */
    public static void printValuesInArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                System.out.println(array[i]);
            } else {
                System.out.print(array[i] + ", ");
            }
        }
        if (array.length == 0)
            System.out.print("The provided array does not contain any values " +
                    "within the specified range.");
    }

    /**
     * Returns a new array with elements in range from the original array.
     *
     * Creates and returns a new array containing the elements of the original
     * array that fall within the specified range (inclusive).
     *
     * @param arr The original array of integers.
     * @param min The minimum value of the range.
     * @param max The maximum value of the range.
     * @return An array of integers within the specified range.
     */
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
