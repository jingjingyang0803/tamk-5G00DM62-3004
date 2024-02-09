/**
 * @author 	Jingjing Yang <jingjing.yang@tuni.fi>
 * @version     2024.0208 (last modified)
 * @since   	17.0 (miminimum Java version)
 */
class GameRounds {

    /**
     * Exercise: 4.2
     *     4.2 Function play
	 *
	 *         Write a function which determines how many rounds player can
	 *         afford to play until he runs out of money.
	 *
	 *             double money = 20.55;
	 *             double roundPrice = 1.5;
	 *
	 *             // double play(double, double)
	 *             double rounds = play(money, roundPrice);
     *
     * @param args Command line arguments. Not used.
     * @return No return value (void method).
     */
	public static void main(String[] args) {
		double money = 20.55;
		double roundPrice = 1.5;
		int rounds = play(money, roundPrice);
		System.out.println("Rounds that can be played = " + rounds);
	}

	/**
	 * This method calculates the number of rounds a player can play.
	 * @param money Total money player has.
	 * @param roundPrice Price of each round.
	 * @return The number of rounds player can play.
	 */
	public static int play(double money, double roundPrice) {
		double rounds = money / roundPrice;
		return (int)Math.floor(rounds);
	}
}

// End of file
