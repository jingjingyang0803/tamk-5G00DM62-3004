import java.text.DecimalFormat;

/**
 * @author Jingjing Yang <jingjing.yang@tuni.fi>
 * @version 2024.0211 (last modified)
 * @since 17.0 (miminimum Java version)
 */
class TaxCalculator {

    /**
     * Calculates and displays earnings and taxes for an individual.
     *
     * Exercise: 1.7
     * 1.7 Calculate taxes
     * <p>
     * Write a program to calculate annual taxes from following
     * initial values:
     * <p>
     * - Total earnings in year: 134 000
     * of which the stock exchange earnings are 23 000.
     * - The nominal tax rate for person is 27,3%.
     * - The government tax rate for extra income, like stocks, is 21 %.
     * <p>
     * The program should calculate taxes and display the result. The
     * results NNNNN.NN may contain any number of decimals.
     * <p>
     * All income    : 134000
     * Work earnings : 111000
     * Stock earnings: 23000
     * <p>
     * Taxes total   : NNNNN.NN
     * Net income    : NNNNN.NN (after taxes reduced)
     *
     * @param args Command line arguments. Not used.
     */
    public static void main(String[] args) {
        int totalEarnings = 134000;
        int stockEarnings = 23000;
        double personalTaxRate = 0.273;
        double stockTaxRate = 0.21;

        calculateAndPrintEarningsAndTaxes(totalEarnings, stockEarnings,
                personalTaxRate, stockTaxRate);
    }

    /**
     * Calculates and prints total/work/stock earnings, taxes, and net income.
     *
     * It takes total earnings, stock earnings, and respective tax rates as
     * inputs.
     *
     * @param totalEarnings   The total earnings.
     * @param stockEarnings   The earnings from stocks.
     * @param personalTaxRate The tax rate for personal income.
     * @param stockTaxRate    The tax rate for stock earnings.
     */
    public static void calculateAndPrintEarningsAndTaxes(int totalEarnings,
                                                         int stockEarnings, double personalTaxRate, double stockTaxRate) {
        int workEarnings = totalEarnings - stockEarnings;
        double taxes = workEarnings * personalTaxRate +
                stockEarnings * stockTaxRate;
        double netIncome = totalEarnings - taxes;

        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println("All income    : " + totalEarnings);
        System.out.println("Work earnings : " + workEarnings);
        System.out.println("Stock earnings: " + stockEarnings);
        System.out.println("\nTaxes total   : " + formatValue(taxes));
        System.out.println("Net income    : " + formatValue(netIncome));
    }

    /**
     * Formats a numerical value to a specified decimal format.
     *
     * @param value The value to be formatted.
     * @return The formatted value as a String.
     */
    public static String formatValue(double value) {
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        return decimalFormat.format(value);
    }
}

// End of file
