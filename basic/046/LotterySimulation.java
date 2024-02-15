/**
 * @author Jingjing Yang <jingjing.yang@tuni.fi>
 * @version 2024.0212 (last modified)
 * @since 17.0 (miminimum Java version)
 */
class LotterySimulation {

    /**
     * Implements lottery.
     *
     * Exercise: 4.6
     * 4.6 Function lottery
     * <p>
     * NOTE: use function dice() from previous exercise.
     * <p>
     * Write a simple[1] Finnish lottery[2] where the numbers and
     * spare numbers are displayed to the screen:
     * <p>
     * Lottery: N, N, NN, N, N ...
     * Spare: N, N, NN
     * <p>
     * [1] In simple in a sense that you may get same numbers from
     * random number generator. Ignore possible duplicate numbers for
     * this exercise. To implement lottery correctly, there would be
     * need to store the values to an array for checking against
     * duplicates.
     * <p>
     * [2] https://www.veikkaus.fi/fi/lotto
     *
     * @param args Command line arguments. Not used.
     */
    public static void main(String[] args) {
        lottery();
    }

    /**
     * Simulates a simple lottery system.
     *
     * The numbers and spare numbers are displayed to the screen.
     * It uses the dice method to generate lottery numbers.
     */
    public static void lottery() {
        System.out.print("Lottery: ");
        for (int i = 0; i < 7; i++) {
            System.out.print(dice() + " ");
        }
        System.out.print("\nSpare: ");
        for (int i = 0; i < 3; i++) {
            System.out.print(dice() + " ");
        }
    }

    /**
     * Simulates a dice roll and returns a random number between 1 and 40.
     *
     * @return Dice roll value.
     */
    public static int dice() {
        return (int) (Math.random() * 40) + 1;
    }
}

// End of file
