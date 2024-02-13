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

	@Before // This method will run before each test
	public void setUpStreams() {
		// Redirect System.out to the ByteArrayOutputStream
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

	@After // This method will run after each test
	public void restoreStreams() {
		System.setOut(System.out); // Restore System.out to its original state
	}
}