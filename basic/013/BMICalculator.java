import java.text.DecimalFormat;

/**
 * @author 		Jingjing Yang <jingjing.yang@tuni.fi>
 * @version     2024.0208 (last modified)
 * @since   	17.0 (miminimum Java version)
 */
class BMICalculator {

	/**
	 * Exercise: 1.3
	 *    1.3 Calculate bmi
	 *
	 *         Calculate body mass index[1] from WEIGHT and HEIGHT. Display
	 *         results:
	 *
	 *             Weight (kg): NN
	 *             height (m) : N.N
	 *             BMI        : N.N
	 *
	 *         [1] https://en.wikipedia.org/wiki/Body_mass_index
	 *
	 * @param  args  Command line arguments. Not used.
	 * @return No return value (void method).
	 */
	public static void main(String[] args) {
		int weight = 56; // in kg
		double height = 1.6; // in m
		double bmi = calculateBMI(weight, height);

		DecimalFormat df = new DecimalFormat("0.0");

		System.out.println("Weight (kg): " + weight);
		System.out.println("Height (m) : " + df.format(height));
		System.out.println("BMI        : " + df.format(bmi));
	}

	/**
	 * This method calculates the Body Mass Index (BMI) using weight and height.
	 *
	 * @param weight The weight in kilograms.
	 * @param height The height in meters.
	 * @return bmi The calculated BMI.
	 */
	public static double calculateBMI(int weight, double height) {
		double bmi = weight / Math.pow(height, 2);
		return bmi;
	}
}

// End of file
