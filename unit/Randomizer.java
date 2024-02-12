/**
 * @author Jingjing Yang <jingjing.yang@tuni.fi>
 * @version 2024.0211 (last modified)
 * @since 17.0 (miminimum Java version)
 */
import java.util.Random;
import java.util.List;
import java.util.ArrayList;

class Randomizer {

	/**
	 * Instance of Random used to generate random numbers.
	 */
	private Random random;

	/**
	 * Constructor for the Randomizer class.
	 */
	public Randomizer() {
		this.random = new Random();
	}

	/**
	 * Generates a random integer within the specified range.
	 *
	 * @param min The lower bound of the range.
	 * @param max The upper bound of the range.
	 * @return A random integer within the specified range.
	 */
	public int getRandomNumberInRange(int min, int max) {
		return random.nextInt((max - min) + 1) + min;
	}

	/**
	 * Generates a list of random integers within a specified range.
	 *
	 * @param listSize The size of the list to generate.
	 * @param min      The lower bound of the range.
	 * @param max      The upper bound of the range.
	 * @return A list of random integers within the specified range.
	 */
	public List<Integer> getRandomNumberList(int listSize, int min, int max) {
		List<Integer> randomNumberList = new ArrayList<>();

		for (int i = 0; i < listSize; i++) {
			randomNumberList.add(getRandomNumberInRange(min, max));
		}

		return randomNumberList;
	}

	/**
	 * Generates an array of random integers within a specified range.
	 *
	 * @param arraySize The size of the array to generate.
	 * @param min       The lower bound of the range.
	 * @param max       The upper bound of the range.
	 * @return An array of random integers within the specified range.
	 */
	public int[] getRandomNumberArray(int arraySize, int min, int max) {
		int[] randomNumberArray = new int[arraySize];

		for (int i = 0; i < arraySize; i++) {
			randomNumberArray[i] = getRandomNumberInRange(min, max);
		}

		return randomNumberArray;
	}

	/**
	 * Picks a random element from a list.
	 *
	 * @param list The list from which to pick an element.
	 * @return A random element from the list.
	 */
	public <T> T getRandomElementFromList(List<T> list) {

		if (list == null || list.isEmpty()) {
			throw new IllegalArgumentException("List cannot be null or empty.");
		}

		int randomIndex = random.nextInt(list.size());
		return list.get(randomIndex);
	}

	/**
	 * Generates a random boolean value.
	 *
	 * @return A random boolean value.
	 */
	public boolean getRandomBoolean() {
		return random.nextBoolean();
	}
}
