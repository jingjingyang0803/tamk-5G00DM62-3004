/**
 * @author Jingjing Yang <jingjing.yang@tuni.fi>
 * @version 2024.0211 (last modified)
 * @since 17.0 (miminimum Java version)
 */
class Converter {

	/**
	 * This class provides methods for converting various units of measurement.
	 */

	/**
	 * Converts Celsius temperatures to Fahrenheit.
	 *
	 * @param celsius the Celsius temperature
	 * @return the Fahrenheit equivalent of the Celsius temperature
	 */
	public double celsiusToFahrenheit(double celsius) {
		return (celsius * 9 / 5) + 32;
	}

	/**
	 * Converts Fahrenheit temperatures to Celsius.
	 *
	 * @param fahrenheit the Fahrenheit temperature
	 * @return the Celsius equivalent of the Fahrenheit temperature
	 */
	public double fahrenheitToCelsius(double fahrenheit) {
		return (fahrenheit - 32) * 5 / 9;
	}

	/**
	 * Converts distances in miles to kilometers.
	 *
	 * @param miles the distance in miles
	 * @return the distance in kilometers
	 */
	public double milesToKilometers(double miles) {
		return miles * 1.609344;
	}

	/**
	 * Converts distances in kilometers to miles.
	 *
	 * @param kilometers the distance in kilometers
	 * @return the distance in miles
	 */
	public double kilometersToMiles(double kilometers) {
		return kilometers / 1.609344;
	}

	/**
	 * Converts weights in pounds to kilograms.
	 *
	 * @param pounds the weight in pounds
	 * @return the weight in kilograms
	 */
	public double poundsToKilograms(double pounds) {
		return pounds / 2.2046262185;
	}
}
