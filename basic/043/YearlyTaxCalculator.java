import java.text.DecimalFormat;

/**
 * @author 	Jingjing Yang <jingjing.yang@tuni.fi>
 * @version     2024.0212 (last modified)
 * @since   	17.0 (miminimum Java version)
 */
class YearlyTaxCalculator {

    /**
     * Calculates taxes.
	 *
	 * Exercise: 4.3
     *     4.3 Function tax
	 *
	 *         Write a function to calculate taxes.
	 *
	 *             // double yearlyTaxes(double, double)
	 *             double taxes = taxes(yearlySalary, percentage);
     *
     * @param args Command line arguments. Not used.
     */
	public static void main(String[] args) {
		double yearlySalary = 58977;
		double percentage = 21.7;
		double taxes = taxes(yearlySalary, percentage);
		DecimalFormat df = new DecimalFormat("0.00");
		System.out.println("Taxes = " + df.format(taxes));
	}

	/**
	 * Calculates the taxes based on yearly salary and tax percentage.
	 *
	 * @param yearlySalary The yearly salary of the person.
	 * @param percentage The tax percentage.
	 * @return The calculated tax.
	 */
	public static double taxes(double yearlySalary, double percentage) {
		double taxes = yearlySalary * percentage / 100;
		return taxes;
	}
}

// End of file
