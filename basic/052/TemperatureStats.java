/**
 * @author Jingjing Yang <jingjing.yang@tuni.fi>
 * @version 2024.0212 (last modified)
 * @since 17.0 (miminimum Java version)
 */
class TemperatureStats {

	/**
	 * Stores 10 temperature values (in double) to an array.
	 * <p>
	 * Exercise: 5.2
	 * 5.2 Array temperatures
	 * <p>
	 * Write a program to store 10 temperature values (in double) to an
	 * array. Loop over the values and present following report:
	 * <p>
	 * Temperatures:
	 * Min: NN.N
	 * Max: NN.N
	 * Avg: NN.N
	 *
	 * @param args Command line arguments. Not used.
	 */
	public static void main(String[] args) {
		double[] temperatures = {15.5, 17.2, 18.0, 16.5, 19.0,
				20.1, 21.5, 22.5, 23.0, 24.5};
		System.out.println("Min: " + minTemperature(temperatures));
		System.out.println("Max: " + maxTemperature(temperatures));
		System.out.println("Avg: " + averageTemperature(temperatures));
	}

	/**
	 * Calculates minimum temperature.
	 *
	 * @param temperatures Array of temperature values.
	 * @return Minimum temperature value.
	 */
	public static double minTemperature(double[] temperatures) {
		double min = temperatures[0];
		for (double temp : temperatures) {
			if (temp < min) min = temp;
		}
		return min;
	}

	/**
	 * Calculates maximum temperature.
	 *
	 * @param temperatures Array of temperature values.
	 * @return Maximum temperature value.
	 */
	public static double maxTemperature(double[] temperatures) {
		double max = temperatures[0];
		for (double temp : temperatures) {
			if (temp > max) max = temp;
		}
		return max;
	}

	/**
	 * Calculates average temperature.
	 *
	 * @param temperatures Array of temperature values.
	 * @return Average temperature value.
	 */
	public static double averageTemperature(double[] temperatures) {
		double sum = 0;
		for (double temp : temperatures) {
			sum += temp;
		}
		return Math.round(sum / temperatures.length * 10) / 10.0;
	}
}

// End of file
