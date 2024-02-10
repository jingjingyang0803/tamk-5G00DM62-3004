/**
 * @author 	Jingjing Yang <jingjing.yang@tuni.fi>
 * @version     2024.0211 (last modified)
 * @since   	17.0 (miminimum Java version)
 */
import java.util.Arrays;

/**
 * This Sorter class provides methods for sorting arrays and finding values within arrays.
 */
public class Sorter {

	/**
	 * Sorts an array in ascending order
	 * @param arr The array to be sorted
	 * @return The sorted array
	 */
	public int[] sortAscending(int[] arr) {
		Arrays.sort(arr);
		return arr;
	}

	/**
	 * Sorts an array in descending order
	 * @param arr The array to be sorted
	 * @return The sorted array
	 */
	public int[] sortDescending(int[] arr) {
		Arrays.sort(arr);
		for (int i = 0; i < arr.length / 2; i++) {
			int temp = arr[i];
			arr[i] = arr[arr.length - i - 1];
			arr[arr.length - i - 1] = temp;
		}
		return arr;
	}

	/**
	 * Finds the maximum value in an array
	 * @param arr The array to be searched
	 * @return The maximum value
	 */
	public int findMax(int[] arr) {
		int maxVal = arr[0];
		for(int i: arr) {
			if(i > maxVal) maxVal = i;
		}
		return maxVal;
	}

	/**
	 * Finds the minimum value in an array
	 * @param arr The array to be searched
	 * @return The minimum value
	 */
	public int findMin(int[] arr) {
		int minVal = arr[0];
		for(int i: arr) {
			if(i < minVal) minVal = i;
		}
		return minVal;
	}

	/**
	 * Calculates the sum of all values in an array
	 * @param arr The array to be summed
	 * @return The sum of all values
	 */
	public int findSum(int[] arr) {
		int sum = 0;
		for(int i: arr) {
			sum += i;
		}
		return sum;
	}
}
