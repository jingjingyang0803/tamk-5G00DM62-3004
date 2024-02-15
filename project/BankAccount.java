/**
 * @author Jingjing Yang <jingjing.yang@tuni.fi>
 * @version 2024.0213 (last modified)
 * @since 17.0 (miminimum Java version)
 */
public class BankAccount {
    private String ownerName; // The name of the bank account owner
    private double interestRate; // The interest rate for the bank account
    private double balance; // The current balance of the bank account

    /**
     * Creates a BankAccount class constructor.
     *
     * @param ownerName    The name of the account owner.
     * @param interestRate The interest rate for the account.
     */
    public BankAccount(String ownerName, double interestRate) {
        this.ownerName = ownerName;
        this.interestRate = interestRate;
        this.balance = 0;
    }

    /**
     * Deposits money into the account.
     *
     * @param amount The amount to be deposited.
     * @throws IllegalArgumentException if deposit amount is negeative
     */
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            throw new IllegalArgumentException("Cannot deposit negative amount");
        }
    }

    /**
     * Withdraws money from the account.
     *
     * @param amount The amount to be withdrawn.
     * @throws IllegalArgumentException if withdraw amount is bigger than balance
     */
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            throw new IllegalArgumentException("Insufficient balance");
        }
    }

    /**
     * Checks the current balance of the account.
     *
     * @return The current balance.
     */
    public double checkBalance() {
        return balance;
    }

    /**
     * Adds interest to the account.
     */
    public void addInterest() {
        double interest = balance * interestRate;
        deposit(interest);
    }

    /**
     * Sets the interest rate of the account.
     *
     * @param interestRate The interest rate to be set.
     * @throws IllegalArgumentException if interest rate is negeative
     */
    public void setInterestRate(double interestRate) {
        if (interestRate >= 0) {
            this.interestRate = interestRate;
        } else {
            throw new IllegalArgumentException("Cannot set negative interest rate");
        }
    }

    /**
     * Gets the interest rate of the account.
     *
     * @return The current interest rate.
     */
    public double getInterestRate() {
        return interestRate;
    }
}
