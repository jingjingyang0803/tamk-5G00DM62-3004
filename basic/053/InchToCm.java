/**
 * @author 	Jingjing Yang <jingjing.yang@tuni.fi>
 * @version     2024.0208 (last modified)
 * @since   	17.0 (miminimum Java version)
 */
class InchToCm {

    /**
     * Exercise: 5.3
     *     5.3 Array convert
	 *
	 *         Write program to convert array of 3 values (inches) to another
	 *         array of ISO centimeters.
	 *
	 *             double inches[] = {1, 2, 3};
	 *             double centimeters[3];    // Calculate conversions here
	 *
	 *         Loop over both arrays and display the following:
	 *
	 *             1 in = 2.54 cm
	 *             2 in = 5.08 cm
	 *             3 in = 7.62 cm
     *
     * @param args Command line arguments. Not used.
     * @return No return value (void method).
     */
	public static void main(String[] args) {
		double[] inches = {1, 2, 3};
		printInchesToCm(inches);
	}

	/**
	 * This method converts inches to centimeters and prints the result.
	 * @param inches Array of values in inches.
	 * @return No return value (void method).
	 */
	public static void printInchesToCm(double[] inches) {
		double[] centimeters = new double[inches.length];
		for (int i = 0; i < inches.length; i++) {
			centimeters[i] = inchesToCm(inches[i]);
			System.out.println(inches[i] + " in = " + centimeters[i] + " cm");
		}
	}

	/**
	 * This method converts inches to centimeters.
	 * @param inch Value in inch.
	 * @return Value in centimeters.
	 */
	public static double inchesToCm(double inch) {
		return inch * 2.54;
	}
}

// End of file
