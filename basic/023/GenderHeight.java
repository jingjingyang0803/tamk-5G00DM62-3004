/**
 * @author 	Jingjing Yang <jingjing.yang@tuni.fi>
 * @version     2024.0211 (last modified)
 * @since   	17.0 (miminimum Java version)
 */
class GenderHeight {

	/**
	 * Prints the height category of a person based on their gender and height.
	 *
	 * Exercise: 2.3
	 *     2.3 If gender
	 *
	 *         Write a program that solves following problem using logical
	 *         operators. Set MALE and FEMALE variables as constant integers
	 *         in the beginning. An example setup:
	 *
	 *             const int MALE = 0
	 *             const int FEMALE = 1;
	 *
	 *             // These values can be changed
	 *             int gender = MALE:
	 *             int height = 175;
	 *             ... code ...
	 *
	 *         Use following decision table:
	 *
	 *             - if MALE
	 *               + below 180, display "Short male"
	 *               + between 180..187, display "Normal male"
	 *               + over 187, display "tall male"
	 *             - if FEMALE
	 *               + below 175, display "Short female"
	 *               + between 175..182, display "Normal female"
	 *               + over 182, display "tall female"
	 *
	 * @param args Command line arguments. Not used.
	 */
	public static void main(String[] args) {
		int gender = 0;
		int height = 175;
		printGenderHeight(gender, height);
	}

	/**
	 * Prints the height category of a person based on their gender and height.
	 *
	 * @param gender The gender of a person
	 * @param height The height of a person
	 */
	public static void printGenderHeight(int gender, int height) {
		final int MALE = 0;
		final int FEMALE = 1;

		if (gender == MALE) {
			if (height < 180) {
				System.out.println("Short male");
			} else if (height <= 187) {
				System.out.println("Normal male");
			} else {
				System.out.println("Tall male");
			}
		} else if (gender == FEMALE) {
			if (height < 175) {
				System.out.println("Short female");
			} else if (height <= 182) {
				System.out.println("Normal female");
			} else {
				System.out.println("Tall female");
			}
		}
	}
}

// End of file
