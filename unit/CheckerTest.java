import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class CheckerTest {
    private Checker checker;

    @Before
    public void setUp() {
        this.checker = new Checker(); // Initialize a new Checker object before each test
    }

    @Test
    public void testIsEven() {
        assertTrue(checker.isEven(2)); // Test if 2 is correctly identified as an even number
        assertFalse(checker.isEven(3)); // Test if 3 is correctly identified as not an even number
        assertTrue(checker.isEven(0)); // Test if 0 is correctly identified as an even number
    }

    @Test
    public void testIsOdd() {
        assertFalse(checker.isOdd(2)); // Test if 2 is correctly identified as not an odd number
        assertTrue(checker.isOdd(3)); // Test if 3 is correctly identified as an odd number
        assertFalse(checker.isOdd(0)); // Test if 0 is correctly identified as not an odd number
    }

    @Test
    public void testIsPrime() {
        assertTrue(checker.isPrime(2)); // Test if 2 is correctly identified as a prime number
        assertFalse(checker.isPrime(4)); // Test if 4 is correctly identified as not a prime number
        assertTrue(checker.isPrime(13)); // Test if 13 is correctly identified as a prime number
    }

    @Test
    public void testIsPalindrome() {
        assertTrue(checker.isPalindrome("r a_d_a r")); // Test if "r a_d_a r" is correctly identified as a palindrome
        assertFalse(checker.isPalindrome("hello")); // Test if "hello" is correctly identified as not a palindrome
        assertTrue(checker.isPalindrome("madam")); // Test if "madam" is correctly identified as a palindrome
    }

    @Test
    public void testIsPositive() {
        assertTrue(checker.isPositive(1)); // Test if 1 is correctly identified as a positive number
        assertFalse(checker.isPositive(-1)); // Test if -1 is correctly identified as not a positive number
        assertFalse(checker.isPositive(0)); // Test if 0 is correctly identified as not a positive number
    }
}
