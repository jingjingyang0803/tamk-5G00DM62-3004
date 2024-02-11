/**
 * @author Jingjing Yang <jingjing.yang@tuni.fi>
 * @version 2024.0212 (last modified)
 * @since 17.0 (miminimum Java version)
 */
class InchToCm {

	/**
	 * Converts array of 3 values from inches to centimeters.
	 * <p>
	 * Exercise: 5.3
	 * 5.3 Array convert
	 * <p>
	 * Write program to convert array of 3 values (inches) to another
	 * array of ISO centimeters.
	 * <p>
	 * double inches[] = {1, 2, 3};
	 * double centimeters[3];    // Calculate conversions here
	 * <p>
	 * Loop over both arrays and display the following:
	 * <p>
	 * 1 in = 2.54 cm
	 * 2 in = 5.08 cm
	 * 3 in = 7.62 cm
	 *
	 * @param args Command line arguments. Not used.
	 */
	public static void main(String[] args) {
		double[] inches = {1, 2, 3};
		printInchesToCm(inches);
	}

	/**
	 * Converts inches to centimeters and prints the result.
	 *
	 * @param inches Array of values in inches.
	 */
	public static void printInchesToCm(double[] inches) {
		double[] centimeters = new double[inches.length];
		for (int i = 0; i < inches.length; i++) {
			centimeters[i] = inchesToCm(inches[i]);
			System.out.println(inches[i] + " in = " + centimeters[i] + " cm");
		}
	}

	/**
	 * Converts inches to centimeters.
	 *
	 * @param inch Value in inch.
	 * @return Value in centimeters.
	 */
	public static double inchesToCm(double inch) {
		return inch * 2.54;
	}
}

// End of file
