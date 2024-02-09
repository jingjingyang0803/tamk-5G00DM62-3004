/**
 * @author 	Jingjing Yang <jingjing.yang@tuni.fi>
 * @version     2024.0208 (last modified)
 * @since   	17.0 (miminimum Java version)
 */
class DiceRoll {

    /**
     * Exercise: 4.5
     *     4.5 Function dice
	 *
	 *         Write a function dice(). Implement it by returning a random[1]
	 *         number between 1..6 each time the program is run.
	 *
	 *             int value = dice();
	 *
	 *         [1] https://docs.oracle.com/en/java/javase/15/docs/api/java.base/java/lang/Math.html
     *
     * @param args Command line arguments. Not used.
     * @return No return value (void method).
     */
	public static void main(String[] args) {
		int value = dice();
		System.out.println("Dice roll value = " + value);
	}

	/**
	 * This method simulates a dice roll and returns a random number between 1 and 6.
	 * @return Dice roll value.
	 */
	public static int dice() {
		return (int) (Math.random() * 6) + 1;
	}
}

// End of file
