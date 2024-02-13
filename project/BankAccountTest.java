import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class BankAccountTest {
	private BankAccount account; // Instance variable for the BankAccount object

	@Before // Indicates that this method will run before each test
	public void setUp() {
		account = new BankAccount("John Doe", 0.05); // Creating a new BankAccount object
	}

	@Test // Indicates that this is a test method
	public void testDeposit1() {
		account.deposit(1000); // Depositing 1000 to the account
		assertEquals(1000, account.checkBalance(), 0); // Checking if the balance matches the expected value
	}

	@Test(expected = IllegalArgumentException.class) // This test is expected to throw an IllegalArgumentException
	public void testDeposit2() {
		account.deposit(-100); // Trying to deposit a negative amount
		assertEquals(0, account.checkBalance(), 0); // Checking if the balance remains 0
	}

	@Test
	public void testDeposit3() {
		account.deposit(500); // Depositing 500 to the account
		account.deposit(300); // Depositing 300 to the account
		assertEquals(800, account.checkBalance(), 0); // Checking if the balance matches the total deposited amount
	}

	@Test
	public void testWithdraw1() {
		account.deposit(1000); // Depositing 1000 to the account
		account.withdraw(500); // Withdrawing 500 from the account
		assertEquals(500, account.checkBalance(), 0); // Checking if the balance matches the expected value
	}

	@Test(expected = IllegalArgumentException.class) // This test is expected to throw an IllegalArgumentException
	public void testWithdraw2() {
		account.deposit(1000); // Depositing 1000 to the account
		account.withdraw(1500); // Trying to withdraw more than the balance
		assertEquals(1000, account.checkBalance(), 0); // Checking if the balance remains unchanged
	}

	@Test
	public void testWithdraw3() {
		account.deposit(1000); // Depositing 1000 to the account
		account.withdraw(500); // Withdrawing 500 from the account
		account.withdraw(200); // Withdrawing 200 from the account
		assertEquals(300, account.checkBalance(), 0); // Checking if the balance matches the expected value
	}

	@Test
	public void testCheckBalance1() {
		assertEquals(0, account.checkBalance(), 0); // Checking if the initial balance is 0
	}

	@Test
	public void testCheckBalance2() {
		account.deposit(1000); // Depositing 1000 to the account
		assertEquals(1000, account.checkBalance(), 0); // Checking if the balance matches the deposited amount
	}

	@Test
	public void testCheckBalance3() {
		account.deposit(500); // Depositing 500 to the account
		account.withdraw(200); // Withdrawing 200 from the account
		assertEquals(300, account.checkBalance(), 0); // Checking if the balance matches the expected value
	}

	@Test
	public void testAddInterest1() {
		account.deposit(1000); // Depositing 1000 to the account
		account.addInterest(); // Adding interest to the account
		assertEquals(1050, account.checkBalance(), 0); // Checking if the balance matches the expected value after adding interest
	}

	@Test
	public void testAddInterest2() {
		account.setInterestRate(0.1); // Setting interest rate to 0.1
		account.deposit(1000); // Depositing 1000 to the account
		account.addInterest(); // Adding interest to the account
		assertEquals(1100, account.checkBalance(), 0); // Checking if the balance matches the expected value after adding interest
	}

	@Test
	public void testAddInterest3() {
		account.deposit(1000); // Depositing 1000 to the account
		account.addInterest(); // Adding interest to the account
		account.addInterest(); // Adding interest to the account again
		assertEquals(1102.5, account.checkBalance(), 0); // Checking if the balance matches the expected value after adding interest twice
	}

	@Test
	public void testSetAndGetInterestRate1() {
		account.setInterestRate(0.1); // Setting interest rate to 0.1
		assertEquals(0.1, account.getInterestRate(), 0); // Checking if the interest rate matches the set value
	}

	@Test(expected = IllegalArgumentException.class) // This test is expected to throw an IllegalArgumentException
	public void testSetAndGetInterestRate2() {
		account.setInterestRate(-0.1); // Trying to set a negative interest rate
		assertEquals(0.05, account.getInterestRate(), 0); // Checking if the interest rate remains unchanged
	}

	@Test
	public void testSetAndGetInterestRate3() {
		account.setInterestRate(0.08); // Setting interest rate to 0.08
		account.setInterestRate(0.1); // Changing interest rate to 0.1
		assertEquals(0.1, account.getInterestRate(), 0); // Checking if the interest rate matches the last set value
	}
}
