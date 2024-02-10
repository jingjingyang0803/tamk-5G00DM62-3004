/**
 * @author 	Jingjing Yang <jingjing.yang@tuni.fi>
 * @version     2024.0210 (last modified)
 * @since   	17.0 (miminimum Java version)
 */
/**
 * The Checker class provides methods for checking various properties of numbers and strings.
 */
class Checker {

    /**
     * Checks if a number is even.
     *
     * @param number the number to check
     * @return true if the number is even, false otherwise
     */
    public boolean isEven(int number) {
        return number % 2 == 0;
    }

    /**
     * Checks if a number is odd.
     *
     * @param number the number to check
     * @return true if the number is odd, false otherwise
     */
    public boolean isOdd(int number) {
        return number % 2 != 0;
    }

    /**
     * Checks if a number is prime.
     *
     * @param number the number to check
     * @return true if the number is prime, false otherwise
     */
    public boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * Checks if a word is a palindrome.
     *
     * @param word the word to check
     * @return true if the word is a palindrome, false otherwise
     */
    public boolean isPalindrome(String word) {
        String reversed = new StringBuilder(word).reverse().toString();
        return word.equalsIgnoreCase(reversed);
    }

    /**
     * Checks if a number is positive.
     *
     * @param number the number to check
     * @return true if the number is positive, false otherwise
     */
    public boolean isPositive(int number) {
        return number > 0;
    }
}
