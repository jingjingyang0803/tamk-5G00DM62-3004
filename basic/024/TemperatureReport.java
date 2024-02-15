/**
 * @author Jingjing Yang <jingjing.yang@tuni.fi>
 * @version 2024.0212 (last modified)
 * @since 17.0 (miminimum Java version)
 */
class TemperatureReport {

    /**
     * Prints the temperature category of a city based on its temperature.
     *
     * Exercise: 2.4
     * 2.4 If temperature
     * <p>
     * Write a program that solves following problem using logical
     * operators. Set values at the beginning:
     * <p>
     * const int HELSINKI = 0;
     * const int TAMPERE = 1;
     * const int TURKU = 2;
     * <p>
     * // These values can be changed
     * int city = HELSINKI;
     * int temperature = -25;
     * ... code ...
     * <p>
     * Use following decision table:
     * <p>
     * If below -20 in Tampere, display "Freezing"
     * If below -20 in Turku or Helsinki, display "Ice Freezing"
     * If above -20 in Tampere, display "Moderate Winter"
     * If between -20..-10 in Helsinki or Turku, display "Ice Cold"
     *
     * @param args Command line arguments. Not used.
     */
    public static void main(String[] args) {
        int city = 0;
        int temperature = -25;
        printTemperatureReport(city, temperature);
    }

    /**
     * Prints the temperature category of a city based on its temperature.
     *
     * @param city        The city
     * @param temperature The temperature of the city
     */
    public static void printTemperatureReport(int city, int temperature) {
        final int HELSINKI = 0;
        final int TAMPERE = 1;
        final int TURKU = 2;

        if (city == TAMPERE) {
            if (temperature < -20) {
                System.out.println("Freezing");
            } else {
                System.out.println("Moderate Winter");
            }
        } else if (city == TURKU || city == HELSINKI) {

            if (temperature < -20) {
                System.out.println("Ice Freezing");
            } else if (temperature < -10) {
                System.out.println("Ice Cold");
            }
        }
    }
}

// End of file
