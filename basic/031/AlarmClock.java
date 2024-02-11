/**
 * @author 	Jingjing Yang <jingjing.yang@tuni.fi>
 * @version     2024.0212 (last modified)
 * @since   	17.0 (miminimum Java version)
 */
class AlarmClock {

    /**
     * Emulates an alarm clock.
	 *
	 * Exercise: 3.1
     *         3.1 Loop alarm
	 *
	 *         Write a program to emulate alarm clock. Display values counting
	 *         backwards until last value where program displays "ALARM!".
	 *
	 *             int max = 10;
	 *             ... code ...
	 *
	 *         Output:
	 *
	 *             10, 9, 8, 7, 6, 5, 4, 3, 2, 1, ALARM!
     *
     * @param args Command line arguments. Not used.
     */
	public static void main(String[] args) {
		startCountDown(10);
	}

	/**
	 * This method starts the countdown.
	 * @param startValue the starting value of the countdown
	 * @return No return value (void method).
	 */
	public static void startCountDown(int startValue) {
		for (int i = startValue; i >= 0; i--) {
			displayCountdown(i);
		}
	}

	/**
	 * Displays the countdown or ALARM when it reaches zero.
	 *
	 * @param value the current value of the countdown
	 * @return No return value (void method).
	 */
	public static void displayCountdown(int value) {
		if (value == 0) {
			System.out.print("ALARM!");
		} else {
			System.out.print(value + ", ");
		}
	}
}

// End of file
