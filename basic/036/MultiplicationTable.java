/**
 * @author Jingjing Yang <jingjing.yang@tuni.fi>
 * @version 2024.0212 (last modified)
 * @since 17.0 (miminimum Java version)
 */
class MultiplicationTable {

    /**
     * Displays a multiplication table.
     *
     * Exercise: 3.6
     * 3.6 Loop multable
     * <p>
     * Write a program to display a multiplication table. The size of
     * the table is controlled using one value SIZE. Tip: to make the
     * output evenly spaced, utilize function printf(). You can
     * assume that the the SIZE is in range 1..9[1]
     * <p>
     * int size = 9;
     * <p>
     * Output:
     * <p>
     * * |  1  2  3  4  5  6  7  8  9
     * -------------------------------
     * 1 |  1  2  3  4  5  6  7  8  9
     * 2 |  2  4  6  8 10 12 14 16 18
     * 3 |  3  6  9 12 15 18 21 24 27
     * 4 |  4  8 12 16 20 24 28 32 36
     * 5 |  5 10 15 20 25 30 35 40 45
     * 6 |  6 12 18 24 30 36 42 48 54
     * 7 |  7 14 21 28 35 42 49 56 63
     * 8 |  8 16 24 32 40 48 56 64 72
     * 9 |  9 18 27 36 45 54 63 72 81
     * <p>
     * [1] If the SIZE would exceed 9, the requirements to display
     * evenly spaced table would change from row to row. This is not
     * a straightforward task to solve considering that:
     * <p>
     * 10 x 15 => requires 3 digit display area for value 150
     * 99 x 55 => requires 4 digit display area for value 5445
     *
     * @param args Command line arguments. Not used.
     */
    public static void main(String[] args) {
        printTable(9);
    }

    /**
     * Prints a multiplication table.
     *
     * @param size the size of the table
     */
    public static void printTable(int size) {
        System.out.print(" * |");
        for (int i = 1; i <= size; i++) {
            System.out.printf("%4d", i);
        }
        System.out.println();
        for (int i = 0; i <= size; i++) {
            System.out.print("----");
        }
        System.out.println();

        for (int i = 1; i <= size; i++) {
            System.out.printf("%2d |", i);
            for (int j = 1; j <= size; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }
    }
}

// End of file
