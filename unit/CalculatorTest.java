/*
javac -cp ".:junit-4.13.2.jar:hamcrest-core-1.3.jar" CalculatorTest.java

java -cp ".:junit-4.13.2.jar:hamcrest-core-1.3.jar" org.junit.runner.JUnitCore CalculatorTest

If you are on Windows, replace : with ;.
*/

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class CalculatorTest {
	private Calculator calculator;

	@Before
	public void setUp() {
		// Initialize a new Calculator object before each test
		this.calculator = new Calculator();
	}

	@Test public void testAdd() {
		// Test if the addition function adds positive numbers correctly
		assertEquals(7, calculator.add(3, 4));
		// Test if the addition function handles negative numbers correctly
		assertEquals(0, calculator.add(-3, 3));
		// Test if the addition function adds large numbers correctly
		assertEquals(100, calculator.add(50, 50));
	}

	@Test public void testSubtract() {
		// Test if the subtraction function handles the case where the second number is larger
		assertEquals(-1, calculator.subtract(3, 4));
		// Test if the subtraction function handles equal numbers correctly
		assertEquals(0, calculator.subtract(3, 3));
		// Test if the subtraction function handles large numbers correctly
		assertEquals(50, calculator.subtract(100, 50));
	}

	@Test public void testMultiply() {
		// Test if the multiplication function multiplies positive numbers correctly
		assertEquals(12, calculator.multiply(3, 4));
		// Test if the multiplication function handles zero correctly
		assertEquals(0, calculator.multiply(3, 0));
		// Test if the multiplication function handles large numbers correctly
		assertEquals(50, calculator.multiply(10, 5));
	}

	@Test(expected = IllegalArgumentException.class)
	public void testDivide() {
		// Test if the division function divides numbers correctly
		assertEquals(3, calculator.divide(9, 3));
		// Test if the division function handles equal numbers correctly
		assertEquals(1, calculator.divide(3, 3));
		// Test if the division function throws an exception when dividing by zero
		calculator.divide(1, 0);
	}

	@Test public void testSquare() {
		// Test if the square function squares positive numbers correctly
		assertEquals(9, calculator.square(3));
		// Test if the square function handles zero correctly
		assertEquals(0, calculator.square(0));
		// Test if the square function squares large numbers correctly
		assertEquals(25, calculator.square(5));
	}
}
