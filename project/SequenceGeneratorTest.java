import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class SequenceGeneratorTest {
	// Create a new SequenceGenerator object
	SequenceGenerator sg = new SequenceGenerator();

	// Test the generateEvenNumbers method with different inputs
	@Test
	public void testGenerateEvenNumbers1() {
		assertArrayEquals(new int[]{2, 4, 6}, sg.generateEvenNumbers(3));
	}

	@Test
	public void testGenerateEvenNumbers2() {
		assertArrayEquals(new int[]{2, 4, 6, 8, 10}, sg.generateEvenNumbers(5));
	}

	@Test
	public void testGenerateEvenNumbers3() {
		assertArrayEquals(new int[]{2}, sg.generateEvenNumbers(1));
	}

	// Test the generatePrimeNumbers method with different inputs
	@Test
	public void testGeneratePrimeNumbers1() {
		assertArrayEquals(new int[]{2}, sg.generatePrimeNumbers(1));
	}

	@Test
	public void testGeneratePrimeNumbers2() {
		assertArrayEquals(new int[]{2, 3, 5}, sg.generatePrimeNumbers(3));
	}

	@Test
	public void testGeneratePrimeNumbers3() {
		assertArrayEquals(new int[]{2, 3, 5, 7, 11}, sg.generatePrimeNumbers(5));
	}

	// Test the generateArithmeticSequence method with different inputs
	@Test
	public void testGenerateArithmeticSequence1() {
		assertArrayEquals(new int[]{3}, sg.generateArithmeticSequence(1, 3, 3));
	}

	@Test
	public void testGenerateArithmeticSequence2() {
		assertArrayEquals(new int[]{1, 4, 7}, sg.generateArithmeticSequence(3, 1, 3));
	}

	@Test
	public void testGenerateArithmeticSequence3() {
		assertArrayEquals(new int[]{5, 10, 15, 20, 25}, sg.generateArithmeticSequence(5, 5, 5));
	}

	// Test the generateGeometricSequence method with different inputs
	@Test
	public void testGenerateGeometricSequence1() {
		assertArrayEquals(new int[]{3}, sg.generateGeometricSequence(1, 3, 3));
	}

	@Test
	public void testGenerateGeometricSequence2() {
		assertArrayEquals(new int[]{2, 4, 8}, sg.generateGeometricSequence(3, 2, 2));
	}

	@Test
	public void testGenerateGeometricSequence3() {
		assertArrayEquals(new int[]{1, 2, 4, 8, 16}, sg.generateGeometricSequence(5, 1, 2));
	}

	// Test the generateFibonacciNumbers method with different inputs
	@Test
	public void testGenerateFibonacciNumbers1() {
		assertArrayEquals(new int[]{0}, sg.generateFibonacciNumbers(1));
	}

	@Test
	public void testGenerateFibonacciNumbers2() {
		assertArrayEquals(new int[]{0, 1, 1}, sg.generateFibonacciNumbers(3));
	}

	@Test
	public void testGenerateFibonacciNumbers3() {
		assertArrayEquals(new int[]{0, 1, 1, 2, 3}, sg.generateFibonacciNumbers(5));
	}
}
