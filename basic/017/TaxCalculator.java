import java.text.DecimalFormat;

/**
 * @author 		Jingjing Yang <jingjing.yang@tuni.fi>
 * @version     2024.0208 (last modified)
 * @since   	17.0 (miminimum Java version)
 */
class TaxCalculator {

	/**
	 * Exercise: 1.7
	 *     1.7 Calculate taxes
	 *
	 *         Write a program to calculate annual taxes from following
	 *         initial values:
	 *
	 *         - Total earnings in year: 134 000
	 *           of which the stock exchange earnings are 23 000.
	 *         - The nominal tax rate for person is 27,3%.
	 *         - The government tax rate for extra income, like stocks, is 21 %.
	 *
	 *         The program should calculate taxes and display the result. The
	 *         results NNNNN.NN may contain any number of decimals.
	 *
	 *             All income    : 134000
	 *             Work earnings : 111000
	 *             Stock earnings: 23000
	 *
	 *             Taxes total   : NNNNN.NN
	 *             Net income    : NNNNN.NN (after taxes reduced)
	 *
	 * @param  args  Command line arguments. Not used.
	 * @return No return value (void method).
	 */
	public static void main(String[] args) {
		int totalEarnings = 134000;
		int stockEarnings = 23000;
		double personalTaxRate = 0.273;
		double stockTaxRate = 0.21;

		calculateAndPrintEarningsAndTaxes(totalEarnings, stockEarnings, personalTaxRate, stockTaxRate);
	}

	/**
	 * This method calculates and prints the total earnings, work earnings, stock earnings, taxes, and net income.
	 * It takes total earnings, stock earnings, and respective tax rates as inputs.
	 *
	 * @param totalEarnings    The total earnings.
	 * @param stockEarnings    The earnings from stocks.
	 * @param personalTaxRate  The tax rate for personal income.
	 * @param stockTaxRate     The tax rate for stock earnings.
	 * @return No return value (void method).
	 */
	public static void calculateAndPrintEarningsAndTaxes(int totalEarnings, int stockEarnings, double personalTaxRate, double stockTaxRate) {
		int workEarnings = totalEarnings - stockEarnings;
		double taxes = workEarnings * personalTaxRate + stockEarnings * stockTaxRate;
		double netIncome = totalEarnings - taxes;

		DecimalFormat df = new DecimalFormat("0.00");

		System.out.println("All income    : " + totalEarnings);
		System.out.println("Work earnings : " + workEarnings);
		System.out.println("Stock earnings: " + stockEarnings);
		System.out.println("\nTaxes total   : " + df.format(taxes));
		System.out.println("Net income    : " + df.format(netIncome));
	}
}

// End of file
