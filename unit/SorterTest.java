import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class SorterTest {
	private Sorter sorter;

	@Before
	public void setUp() {
		this.sorter = new Sorter();
	}

	// Test cases for sortAscending method
// Test cases for sortAscending method
	@Test
	public void testSortAscending1() {
		assertArrayEquals(new int[]{1, 2, 3}, sorter.sortAscending(new int[]{1, 2, 3})); // Test sorting an already sorted array
	}

	@Test
	public void testSortAscending2() {
		assertArrayEquals(new int[]{1, 2, 3}, sorter.sortAscending(new int[]{3, 2, 1})); // Test sorting a reversed array
	}

	@Test
	public void testSortAscending3() {
		assertArrayEquals(new int[]{-3, 1, 2, 5, 9}, sorter.sortAscending(new int[]{9, 1, 5, -3, 2})); // Test sorting an arbitrary array
	}

	// Test cases for sortDescending method
	@Test
	public void testSortDescending1() {
		assertArrayEquals(new int[]{3, 2, 1}, sorter.sortDescending(new int[]{3, 2, 1})); // Test sorting an already sorted array in descending order
	}

	@Test
	public void testSortDescending2() {
		assertArrayEquals(new int[]{3, 1, -2}, sorter.sortDescending(new int[]{1, -2, 3})); // Test sorting an ascending array in descending order
	}

	@Test
	public void testSortDescending3() {
		assertArrayEquals(new int[]{9, 5, 3, 2, 1}, sorter.sortDescending(new int[]{1, 5, 3, 2, 9})); // Test sorting an arbitrary array in descending order
	}

	// Test cases for findMax method
	@Test
	public void testFindMax1() {
		assertEquals(5, sorter.findMax(new int[]{1, 2, 3, 4, 5})); // Test finding the max of an ascending array
	}

	@Test
	public void testFindMax2() {
		assertEquals(5, sorter.findMax(new int[]{5, 4, 3, 2, 1})); // Test finding the max of a descending array
	}

	@Test
	public void testFindMax3() {
		assertEquals(9, sorter.findMax(new int[]{1, 2, 9, 4, 5})); // Test finding the max of an arbitrary array
	}

	// Test cases for findMin method
	@Test
	public void testFindMin1() {
		assertEquals(1, sorter.findMin(new int[]{1, 2, 3, 4, 5})); // Test finding the min of an ascending array
	}

	@Test
	public void testFindMin2() {
		assertEquals(1, sorter.findMin(new int[]{5, 4, 3, 2, 1})); // Test finding the min of a descending array
	}

	@Test
	public void testFindMin3() {
		assertEquals(-8, sorter.findMin(new int[]{5, 4, 3, 2, 1, 6, 7, -8, 1, 9})); // Test finding the min of an arbitrary array
	}

	// Test cases for findSum method
	@Test
	public void testFindSum1() {
		assertEquals(15, sorter.findSum(new int[]{1, 2, 3, 4, 5})); // Test finding the sum of an ascending array
	}

	@Test
	public void testFindSum2() {
		assertEquals(15, sorter.findSum(new int[]{5, 4, 3, 2, 1})); // Test finding the sum of a descending array
	}

	@Test
	public void testFindSum3() {
		assertEquals(30, sorter.findSum(new int[]{3, 2, 1, -6, 7, 8, 1, 5, 4, 5})); // Test finding the sum of an arbitrary array
	}
}
