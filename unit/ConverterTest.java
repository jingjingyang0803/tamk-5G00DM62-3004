import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class ConverterTest {
	/**
	 * Instance of Converter used for testing.
	 */
	private Converter converter;

	@Before
	public void setUp() {
		this.converter = new Converter();
	}

	@Test
	public void testCelsiusToFahrenheit1() {
		// Test if the conversion from celsius to fahrenheit is correct
		// for zero degrees
		assertEquals(32, converter.celsiusToFahrenheit(0), 0.1);
	}

	@Test
	public void testCelsiusToFahrenheit2() {
		// Test if the conversion from celsius to fahrenheit is correct
		// for positive degrees
		assertEquals(131, converter.celsiusToFahrenheit(55), 0.1);
	}

	@Test
	public void testCelsiusToFahrenheit3() {
		// Test if the conversion from celsius to fahrenheit is correct
		// for negative degrees
		assertEquals(-22, converter.celsiusToFahrenheit(-30), 0.1);
	}

	@Test
	public void testFahrenheitToCelsius1() {
		// Test if the conversion from fahrenheit to celsius is correct
		// for 32 degrees
		assertEquals(0, converter.fahrenheitToCelsius(32), 0.1);
	}

	@Test
	public void testFahrenheitToCelsius2() {
		// Test if the conversion from fahrenheit to celsius is correct
		// for positive degrees
		assertEquals(37.7, converter.fahrenheitToCelsius(100), 0.1);
	}

	@Test
	public void testFahrenheitToCelsius3() {
		// Test if the conversion from fahrenheit to celsius is correct
		// for negative degrees
		assertEquals(-17.7, converter.fahrenheitToCelsius(0), 0.1);
	}

	@Test
	public void testMilesToKilometers1() {
		// Test if the conversion from miles to kilometers is correct
		// for one mile
		assertEquals(1.60934, converter.milesToKilometers(1), 0.1);
	}

	@Test
	public void testMilesToKilometers2() {
		// Test if the conversion from miles to kilometers is correct
		// for multiple miles
		assertEquals(4.82802, converter.milesToKilometers(3), 0.1);
	}

	@Test
	public void testMilesToKilometers3() {
		// Test if the conversion from miles to kilometers is correct
		// for fractional miles
		assertEquals(0.80467, converter.milesToKilometers(0.5), 0.1);
	}

	@Test
	public void testKilometersToMiles1() {
		// Test if the conversion from kilometers to miles is correct
		// for one kilometer
		assertEquals(1, converter.kilometersToMiles(1.60934), 0.1);
	}

	@Test
	public void testKilometersToMiles2() {
		// Test if the conversion from kilometers to miles is correct
		// for multiple kilometers
		assertEquals(3, converter.kilometersToMiles(4.82802), 0.1);
	}

	@Test
	public void testKilometersToMiles3() {
		// Test if the conversion from kilometers to miles is correct
		// for fractional kilometers
		assertEquals(0.5, converter.kilometersToMiles(0.80467), 0.1);
	}

	@Test
	public void testPoundsToKilograms1() {
		// Test if the conversion from pounds to kilograms is correct
		// for one kilogram
		assertEquals(1, converter.poundsToKilograms(2.20462), 0.1);
	}

	@Test
	public void testPoundsToKilograms2() {
		// Test if the conversion from pounds to kilograms is correct
		// for multiple kilograms
		assertEquals(3, converter.poundsToKilograms(6.61387), 0.1);
	}

	@Test
	public void testPoundsToKilograms3() {
		// Test if the conversion from pounds to kilograms is correct
		// for fractional kilograms
		assertEquals(0.5, converter.poundsToKilograms(1.10231), 0.1);
	}
}
