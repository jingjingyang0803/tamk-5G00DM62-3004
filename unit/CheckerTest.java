import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class CheckerTest {
    /**
     * Instance of Checker used for testing.
     */
    private Checker checker;

    @Before
    public void setUp() {
        // Initialize a new Checker object before each test
        this.checker = new Checker();
    }

    @Test
    public void testIsEven1() {
        // Test if 2 is correctly identified as an even number
        assertTrue(checker.isEven(2));
    }

    @Test
    public void testIsEven2() {
        // Test if 3 is correctly identified as not an even number
        assertFalse(checker.isEven(3));
    }

    @Test
    public void testIsEven3() {
        // Test if 0 is correctly identified as an even number
        assertTrue(checker.isEven(0));
    }

    @Test
    public void testIsOdd1() {
        // Test if 2 is correctly identified as not an odd number
        assertFalse(checker.isOdd(2));
    }

    @Test
    public void testIsOdd2() {
        // Test if 3 is correctly identified as an odd number
        assertTrue(checker.isOdd(3));
    }

    @Test
    public void testIsOdd3() {
        // Test if 0 is correctly identified as not an odd number
        assertFalse(checker.isOdd(0));
    }

    @Test
    public void testIsPrime1() {
        // Test if 2 is correctly identified as a prime number
        assertTrue(checker.isPrime(2));
    }

    @Test
    public void testIsPrime2() {
        // Test if 4 is correctly identified as not a prime number
        assertFalse(checker.isPrime(4));
    }

    @Test
    public void testIsPrime3() {
        // Test if 13 is correctly identified as a prime number
        assertTrue(checker.isPrime(13));
    }

    @Test
    public void testIsPalindrome1() {
        // Test if "r a_d_a r" is correctly identified as a palindrome
        assertTrue(checker.isPalindrome("r a_d_a r"));
    }

    @Test
    public void testIsPalindrome2() {
        // Test if "hello" is correctly identified as not a palindrome
        assertFalse(checker.isPalindrome("hello"));
    }

    @Test
    public void testIsPalindrome3() {
        // Test if "madam" is correctly identified as a palindrome
        assertTrue(checker.isPalindrome("madam"));
    }

    @Test
    public void testIsPositive1() {
        // Test if 1 is correctly identified as a positive number
        assertTrue(checker.isPositive(1));
    }

    @Test
    public void testIsPositive2() {
        // Test if -1 is correctly identified as not a positive number
        assertFalse(checker.isPositive(-1));
    }

    @Test
    public void testIsPositive3() {
        // Test if 0 is correctly identified as not a positive number
        assertFalse(checker.isPositive(0));
    }
}
