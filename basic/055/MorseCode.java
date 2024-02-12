/**
 * @author Jingjing Yang <jingjing.yang@tuni.fi>
 * @version 2024.0212 (last modified)
 * @since 17.0 (miminimum Java version)
 */
class MorseCode {

	/**
	 * Converts a string (phone number) into a morse code.
	 *
	 * Exercise: 5.5
	 * 5.5 Array morse code
	 * <p>
	 * Write a program to convert a string (phone number) into a
	 * morse code[1]. Tip: study C++ stringsa[2], how you can
	 * examine a string as individual characters and find a way to
	 * set up an separate array for morse code signs. In this
	 * exercise you only need morse code signs for numbers.
	 * <p>
	 * string str = "050123456"
	 * <p>
	 * [1] https://en.wikipedia.org/wiki/Morse_code
	 * <p>
	 * [2] https://www.w3schools.com/cpp/cpp_strings.asp
	 * https://www.geeksforgeeks.org/different-ways-to-access-characters-in-a-
	 * given-string-in-c/
	 *
	 * @param args Command line arguments. Not used.
	 */
	public static void main(String[] args) {
		String phoneNumber = "050123456";
		printMorseCode(phoneNumber);
	}

	/**
	 * Prints a string in Morse code.
	 *
	 * @param text The string to convert to Morse code.
	 */
	public static void printMorseCode(String text) {
		// Define each Morse code as a final variable
		final String ZERO = "-----";
		final String ONE = ".----";
		final String TWO = "..---";
		final String THREE = "...--";
		final String FOUR = "....-";
		final String FIVE = ".....";
		final String SIX = "-....";
		final String SEVEN = "--...";
		final String EIGHT = "---..";
		final String NINE = "----.";

		// Create the array using these variables
		String[] morseCode = {ZERO, ONE, TWO, THREE, FOUR,
				FIVE, SIX, SEVEN, EIGHT, NINE};

		for (char digit : text.toCharArray()) {
			// convert the character digit to its corresponding integer value
			int index = digit - '0';
			System.out.print(morseCode[index] + " ");
		}
		System.out.println();
	}

	/**
	 * Converts a digit to Morse code.
	 *
	 * @param digit The digit to convert to Morse code.
	 * @return The Morse code for the digit.
	 */
	public static String digitToMorseCode(char digit) {
		String[] morseCode = {".----", "..---", "...--", "....-", ".....",
				"-....", "--...", "---..", "----.", "-----"};
		int index = digit - '0';
		return morseCode[index];
	}
}

// End of file
