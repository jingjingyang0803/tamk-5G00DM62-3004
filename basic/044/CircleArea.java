/**
 * @author 	Jingjing Yang <jingjing.yang@tuni.fi>
 * @version     2024.0208 (last modified)
 * @since   	17.0 (miminimum Java version)
 */
class CircleArea {

    /**
     * Exercise: 4.4
     *     4.4 Function area
	 *
	 *         Write a functions to calculate areas of an Circle.
	 *
	 *             double areaCircle(double radius)
	 *
	 *         [1] https://docs.oracle.com/en/java/javase/15/docs/api/java.base/java/lang/Math.html
     *
     * @param args Command line arguments. Not used.
     * @return No return value (void method).
     */
	public static void main(String[] args) {
		double radius = 5;
		double area = areaCircle(radius);
		System.out.println("Area of the circle = " + area);
	}

	/**
	 * This method calculates the area of a circle.
	 * @param radius The radius of the circle.
	 * @return The area of the circle.
	 */
	public static double areaCircle(double radius) {
		return Math.PI * Math.pow(radius, 2);
	}
}

// End of file
