import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.Arrays;
import java.util.List;

@RunWith(JUnit4.class)
public class RandomizerTest {
	private Randomizer randomizer;

	@Before
	public void setUp() {
		this.randomizer = new Randomizer();
	}

	// Testing getRandomNumberInRange method
	@Test
	public void testGetRandomNumberInRange1() {
		int number = randomizer.getRandomNumberInRange(1, 10);
		assertTrue(number >= 1 && number <= 10); // The number should be within the range 1-10
	}

	@Test
	public void testGetRandomNumberInRange2() {
		int number = randomizer.getRandomNumberInRange(-5, 5);
		assertTrue(number >= -5 && number <= 5); // The number should be within the range -5 to 5
	}

	@Test
	public void testGetRandomNumberInRange3() {
		int number = randomizer.getRandomNumberInRange(0, 0);
		assertEquals(0, number); // If min and max are the same, the number should be equal to them
	}

	// Testing getRandomNumberList method
	@Test
	public void testGetRandomNumberList1() {
		List<Integer> list = randomizer.getRandomNumberList(5, 1, 10);
		assertEquals(5, list.size()); // The list should have 5 elements
	}

	@Test
	public void testGetRandomNumberList2() {
		List<Integer> list = randomizer.getRandomNumberList(5, 1, 10);
		for (int number : list) {
			assertTrue(number >= 1 && number <= 10); // Each number should be within the range 1-10
		}
	}

	@Test
	public void testGetRandomNumberList3() {
		List<Integer> list = randomizer.getRandomNumberList(0, 1, 10);
		assertTrue(list.isEmpty()); // If listSize is 0, the list should be empty
	}

	// Testing getRandomNumberArray method
	@Test
	public void testGetRandomNumberArray1() {
		int[] array = randomizer.getRandomNumberArray(5, 1, 10);
		assertEquals(5, array.length); // The array should have 5 elements
	}

	@Test
	public void testGetRandomNumberArray2() {
		int[] array = randomizer.getRandomNumberArray(5, 1, 10);
		for (int number : array) {
			assertTrue(number >= 1 && number <= 10); // Each number should be within the range 1-10
		}
	}

	@Test
	public void testGetRandomNumberArray3() {
		int[] array = randomizer.getRandomNumberArray(0, 1, 10);
		assertEquals(0, array.length); // If arraySize is 0, the array should be empty
	}

	// Testing getRandomElementFromList method
	@Test
	public void testGetRandomElementFromList1() {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
		int element = randomizer.getRandomElementFromList(list);
		assertTrue(element >= 1 && element <= 5); // The element should be in the list
	}

	@Test
	public void testGetRandomElementFromList2() {
		List<String> list = Arrays.asList("a", "b", "c", "d", "e");
		String element = randomizer.getRandomElementFromList(list);
		assertTrue(list.contains(element)); // The element should be in the list
	}

	@Test(expected = IllegalArgumentException.class)
	public void testGetRandomElementFromList3() {
		List<Integer> list = Arrays.asList();
		randomizer.getRandomElementFromList(list); // Should throw IllegalArgumentException for empty list
	}

	// Testing getRandomBoolean method
	@Test
	public void testGetRandomBoolean1() {
		boolean result = randomizer.getRandomBoolean();
		assertTrue(result == true || result == false); // Should return either true or false
	}

	@Test
	public void testGetRandomBooleanBias() {
		Randomizer randomizer = new Randomizer();
		boolean hasTrue = false;
		boolean hasFalse = false;

		for (int i = 0; i < 1000; i++) {
			boolean result = randomizer.getRandomBoolean();
			if (result) hasTrue = true;
			else hasFalse = true;

			if (hasTrue && hasFalse) break;
		}

		assertTrue(hasTrue && hasFalse); // Assert that both true and false were returned
	}

	@Test
	public void testGetRandomBooleanRandomness() {
		Randomizer randomizer = new Randomizer();
		int trueCount = 0;
		int falseCount = 0;

		for (int i = 0; i < 10000; i++) {
			boolean result = randomizer.getRandomBoolean();
			if (result) trueCount++;
			else falseCount++;
		}

		assertTrue(Math.abs(trueCount - falseCount) < 1000); // Assert that the counts are roughly equal
	}
}
