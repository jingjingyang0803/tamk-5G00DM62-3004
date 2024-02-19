import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

@RunWith(JUnit4.class)
public class PatternDrawerTest {

	/**
	 * Instance of PatternDrawer used for testing.
	 */
	private PatternDrawer patternDrawer = new PatternDrawer();

	// Create a ByteArrayOutputStream to capture the output
	private final ByteArrayOutputStream outContent =
			new ByteArrayOutputStream();

	private PrintStream originalOut; // original System.out

	/**
	 * Sets up the streams for capturing System.out output.
	 *
	 * Redirects the standard output (System.out) to a custom PrintStream,
	 * allowing the test to capture and analyze the output produced during its execution.
	 * The original System.out is stored before redirection to be restored later.
	 */
	@Before
	public void setUpStreams() {
		originalOut = System.out; // Save the original System.out
		// Set up the new PrintStream for capturing output
		System.setOut(new PrintStream(outContent));
	}

	@Test
	public void testDrawSquare1() {
		String expected = "* * \n" +
				"* * \n";
		patternDrawer.drawSquare(2, '*');
		assertEquals(expected, outContent.toString());
		outContent.reset();
	}

	@Test
	public void testDrawSquare2() {
		String expected = "# # # # # \n" +
				"# # # # # \n" +
				"# # # # # \n" +
				"# # # # # \n" +
				"# # # # # \n";
		patternDrawer.drawSquare(5, '#');
		assertEquals(expected, outContent.toString());
		outContent.reset();
	}

	@Test
	public void testDrawSquare3() {
		String expected = "$ $ $ $ $ $ $ \n" +
				"$ $ $ $ $ $ $ \n" +
				"$ $ $ $ $ $ $ \n" +
				"$ $ $ $ $ $ $ \n" +
				"$ $ $ $ $ $ $ \n" +
				"$ $ $ $ $ $ $ \n" +
				"$ $ $ $ $ $ $ \n";
		patternDrawer.drawSquare(7, '$');
		assertEquals(expected, outContent.toString());
	}

	@Test
	public void testDrawRectangle1() {
		String expected = "* * * \n" +
				"* * * \n" +
				"* * * \n" +
				"* * * \n";
		patternDrawer.drawRectangle(3, 4, '*');
		assertEquals(expected, outContent.toString());
		outContent.reset();
	}

	@Test
	public void testDrawRectangle2() {
		String expected = "# # # # # # \n" +
				"# # # # # # \n";
		patternDrawer.drawRectangle(6, 2, '#');
		assertEquals(expected, outContent.toString());
		outContent.reset();
	}

	@Test
	public void testDrawRectangle3() {
		String expected = "$ $ $ $ \n" +
				"$ $ $ $ \n" +
				"$ $ $ $ \n" +
				"$ $ $ $ \n" +
				"$ $ $ $ \n" +
				"$ $ $ $ \n" +
				"$ $ $ $ \n" +
				"$ $ $ $ \n";
		patternDrawer.drawRectangle(4, 8, '$');
		assertEquals(expected, outContent.toString());
	}

	@Test
	public void testDrawTriangle1() {
		String expected = "* \n" +
				"* * \n" +
				"* * * \n";
		patternDrawer.drawTriangle(3, '*');
		assertEquals(expected, outContent.toString());
		outContent.reset();
	}

	@Test
	public void testDrawTriangle2() {
		String expected = "# \n" +
				"# # \n" +
				"# # # \n" +
				"# # # # \n" +
				"# # # # # \n";
		patternDrawer.drawTriangle(5, '#');
		assertEquals(expected, outContent.toString());
		outContent.reset();
	}

	@Test
	public void testDrawTriangle3() {
		String expected = "$ \n" +
				"$ $ \n" +
				"$ $ $ \n" +
				"$ $ $ $ \n" +
				"$ $ $ $ $ \n" +
				"$ $ $ $ $ $ \n" +
				"$ $ $ $ $ $ $";
		patternDrawer.drawTriangle(7, '$');
		assertEquals("$ \n$ $ \n$ $ $ \n$ $ $ $ \n$ $ $ $ $ \n$ $ $ $ $ $ \n" +
				"$ $ $ $ $ $ $ \n", outContent.toString());
	}

	@Test
	public void testDrawDiamond1() {
		String expected = "  *\n" +
				" * *\n" +
				"* * *\n" +
				" * *\n" +
				"  *\n";
		patternDrawer.drawDiamond(2, '*');
		assertEquals(expected, outContent.toString());
		outContent.reset();
	}

	@Test
	public void testDrawDiamond2() {
		String expected = "   #\n" +
				"  # #\n" +
				" # # #\n" +
				"# # # #\n" +
				" # # #\n" +
				"  # #\n" +
				"   #\n";
		patternDrawer.drawDiamond(3, '#');
		assertEquals(expected, outContent.toString());
		outContent.reset();
	}

	@Test
	public void testDrawDiamond3() {
		String expected = "       $\n" +
				"      $ $\n" +
				"     $ $ $\n" +
				"    $ $ $ $\n" +
				"   $ $ $ $ $\n" +
				"  $ $ $ $ $ $\n" +
				" $ $ $ $ $ $ $\n" +
				"$ $ $ $ $ $ $ $\n" +
				" $ $ $ $ $ $ $\n" +
				"  $ $ $ $ $ $\n" +
				"   $ $ $ $ $\n" +
				"    $ $ $ $\n" +
				"     $ $ $\n" +
				"      $ $\n" +
				"       $\n";
		patternDrawer.drawDiamond(7, '$');
		assertEquals(expected, outContent.toString());
	}

	@Test
	public void testDrawHeart1() {
		String expected = "  * * * * *   * * * * *   \n" +
				"* * * * * * * * * * * * * \n" +
				"* * * * * * * * * * * * * \n" +
				"* * * * * * * * * * * * * \n" +
				"  * * * * * * * * * * *   \n" +
				"    * * * * * * * * *     \n" +
				"      * * * * * * *       \n" +
				"        * * * * *         \n" +
				"          * * *           \n" +
				"            *             \n"; // expected string representation of the heart
		patternDrawer.drawHeart(3, '*');
		assertEquals(expected, outContent.toString());
		outContent.reset();
	}

	@Test
	public void testDrawHeart2() {
		String expected = "    # # # # # # #       # # # # # # #     \n" +
				"  # # # # # # # # #   # # # # # # # # #   \n" +
				"# # # # # # # # # # # # # # # # # # # # # \n" +
				"# # # # # # # # # # # # # # # # # # # # # \n" +
				"# # # # # # # # # # # # # # # # # # # # # \n" +
				"# # # # # # # # # # # # # # # # # # # # # \n" +
				"  # # # # # # # # # # # # # # # # # # #   \n" +
				"    # # # # # # # # # # # # # # # # #     \n" +
				"      # # # # # # # # # # # # # # #       \n" +
				"        # # # # # # # # # # # # #         \n" +
				"          # # # # # # # # # # #           \n" +
				"            # # # # # # # # #             \n" +
				"              # # # # # # #               \n" +
				"                # # # # #                 \n" +
				"                  # # #                   \n" +
				"                    #                     \n";
		patternDrawer.drawHeart(5, '#');
		assertEquals(expected, outContent.toString());
		outContent.reset();
	}

	@Test
	public void testDrawHeart3() {
		String expected = "        $ $ $ $ $ $ $               $ $ $ $ $ $ $         \n" +
				"    $ $ $ $ $ $ $ $ $ $ $       $ $ $ $ $ $ $ $ $ $ $     \n" +
				"  $ $ $ $ $ $ $ $ $ $ $ $ $   $ $ $ $ $ $ $ $ $ $ $ $ $   \n" +
				"  $ $ $ $ $ $ $ $ $ $ $ $ $   $ $ $ $ $ $ $ $ $ $ $ $ $   \n" +
				"$ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ \n" +
				"$ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ \n" +
				"$ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ \n" +
				"$ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ \n" +
				"  $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $   \n" +
				"    $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $     \n" +
				"      $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $       \n" +
				"        $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $         \n" +
				"          $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $           \n" +
				"            $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $             \n" +
				"              $ $ $ $ $ $ $ $ $ $ $ $ $ $ $               \n" +
				"                $ $ $ $ $ $ $ $ $ $ $ $ $                 \n" +
				"                  $ $ $ $ $ $ $ $ $ $ $                   \n" +
				"                    $ $ $ $ $ $ $ $ $                     \n" +
				"                      $ $ $ $ $ $ $                       \n" +
				"                        $ $ $ $ $                         \n" +
				"                          $ $ $                           \n" +
				"                            $                             \n";
		patternDrawer.drawHeart(7, '$');
		assertEquals(expected, outContent.toString());
	}
	
	/**
	 * Restores the standard output stream (System.out) to its original state.
	 *
	 * Ensures that System.out is reset to the standard console output,
	 * reverting the redirection done in setUpStreams.
	 */
	@After
	public void restoreStreams() {
		System.setOut(originalOut); // Restore System.out to the original PrintStream
	}

}