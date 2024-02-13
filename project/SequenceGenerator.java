/**
 * @author Jingjing Yang <jingjing.yang@tuni.fi>
 * @version 2024.0213 (last modified)
 * @since 17.0 (miminimum Java version)
 */
public class SequenceGenerator {

	/**
	 * Generates an array of n even numbers.
	 *
	 * @param n The number of elements in the sequence.
	 * @return An array of even numbers.
	 */
	public int[] generateEvenNumbers(int n) {
		int[] sequence = new int[n];
		for (int i = 0; i < n; i++) {
			sequence[i] = 2 * (i + 1);
		}
		return sequence;
	}

	/**
	 * Generates an array of n prime numbers.
	 *
	 * @param n The number of elements in the sequence.
	 * @return An array of prime numbers.
	 */
	public int[] generatePrimeNumbers(int n) {
		int[] sequence = new int[n];
		int count = 0;
		int number = 2;
		while (count < n) {
			boolean isPrime = true;
			for (int i = 2; i * i <= number; i++) {
				if (number % i == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				sequence[count] = number;
				count++;
			}
			number++;
		}
		return sequence;
	}

	/**
	 * Generates an arithmetic sequence of n numbers.
	 *
	 * @param n          The number of elements in the sequence.
	 * @param start      The first number of the sequence.
	 * @param difference The common difference between sequence elements.
	 * @return An array of numbers in an arithmetic sequence.
	 */
	public int[] generateArithmeticSequence(int n, int start, int difference) {
		int[] sequence = new int[n];
		sequence[0] = start;

		for (int i = 1; i < n; i++) {
			sequence[i] = sequence[i - 1] + difference;
		}

		return sequence;
	}

	/**
	 * Generates a geometric sequence of n numbers.
	 *
	 * @param n     The number of elements in the sequence.
	 * @param start The first number of the sequence.
	 * @param ratio The common ratio between sequence elements.
	 * @return An array of numbers in a geometric sequence.
	 */
	public int[] generateGeometricSequence(int n, int start, int ratio) {
		int[] sequence = new int[n];
		sequence[0] = start;

		for (int i = 1; i < n; i++) {
			sequence[i] = sequence[i - 1] * ratio;
		}

		return sequence;
	}

	/**
	 * Generates an array of n Fibonacci numbers.
	 *
	 * @param n The number of elements in the sequence.
	 * @return An array of Fibonacci numbers.
	 */
	public int[] generateFibonacciNumbers(int n) {
		int[] sequence = new int[n];
		sequence[0] = 0;
		if (n > 1) {
			sequence[1] = 1;
			for (int i = 2; i < n; i++) {
				sequence[i] = sequence[i - 1] + sequence[i - 2];
			}
		}
		return sequence;
	}
}
