import java.text.DecimalFormat;

/**
 * @author Jingjing Yang <jingjing.yang@tuni.fi>
 * @version 2024.0211 (last modified)
 * @since 17.0 (miminimum Java version)
 */
class ConeVolume {

	/**
	 * Calculates and prints the volume of a cone.
	 *
	 * Exercise: 1.5
	 * 1.5 Calculate cone
	 * <p>
	 * Calculate triangular cone's[1] volume from (r)adious and
	 * (h)eight. Display result according to (r)adius and (h)eight.
	 * <p>
	 * [1] https://en.wikipedia.org/wiki/Cone
	 * [2] https://docs.oracle.com/en/java/javase/15/docs/api/java.base/java
	 * /lang/Math.html
	 *
	 * @param args Command line arguments. Not used.
	 */
	public static void main(String[] args) {
		double r = 3; // Radius
		double h = 5; // Height
		double volume = calculateConeVolume(r, h);

		DecimalFormat df = new DecimalFormat("0.00");

		System.out.println("Volume = " + df.format(volume));
	}

	/**
	 * Calculates the volume of a cone.
	 *
	 * @param r The radius of the cone's base.
	 * @param h The height of the cone.
	 * @return The volume of the cone.
	 */
	public static double calculateConeVolume(double r, double h) {
		return (1.0 / 3) * Math.PI * Math.pow(r, 2) * h;
	}
}

// End of file
