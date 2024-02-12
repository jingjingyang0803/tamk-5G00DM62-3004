import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class BoardTest {
	/**
	 * Instance of Board used for testing
	 */
	private Board board;

	@Before
	public void setUp() {
		// Setting up a new Board object before each test
		this.board = new Board();
	}

	// Test the initializeBoard() method
	@Test
	public void testInitializeBoard1() {
		this.board.initializeBoard(); // Initialize the board
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				// Check if all cells are initialized to "-"
				assertEquals("-", this.board.getBoard()[i][j]);
			}
		}
	}

	@Test
	public void testInitializeBoard2() {
		this.board.initializeBoard(); // Initialize the board
		// Check if the winner is initialized to null
		assertEquals(null, this.board.getWinner());
	}

	@Test
	public void testInitializeBoard3() {
		this.board.initializeBoard(); // Initialize the board
		// Check if the board size is 3x3
		assertEquals(3, this.board.getBoard().length);
	}

	// Test the isValidMove() method
	@Test
	public void testIsValidMove1() {
		this.board.initializeBoard(); // Initialize the board
		// Check if a valid cell is indeed valid
		assertTrue(this.board.isValidMove(0, 0));
		// Check if an out-of-bound cell is detected as invalid
		assertFalse(this.board.isValidMove(3, 3));
	}

	@Test
	public void testIsValidMove2() {
		this.board.initializeBoard(); // Initialize the board
		// Check if a negative row index is detected as invalid
		assertFalse(this.board.isValidMove(-1, 0));
		// Check if a negative column index is detected as invalid
		assertFalse(this.board.isValidMove(0, -1));
	}

	@Test
	public void testIsValidMove3() {
		this.board.initializeBoard(); // Initialize the board
		this.board.makeMove(0, 0, "X"); // Make a move at a cell
		// Check if an already occupied cell is detected as invalid
		assertFalse(this.board.isValidMove(0, 0));
	}

	// Test the makeMove() method
	@Test
	public void testMakeMove1() {
		this.board.initializeBoard(); // Initialize the board
		this.board.makeMove(0, 0, "X"); // Make a move at a cell
		// Check if the move has been reflected on the board
		assertEquals("X", this.board.getBoard()[0][0]);
	}

	@Test
	public void testMakeMove2() {
		this.board.initializeBoard(); // Initialize the board
		this.board.makeMove(2, 2, "O"); // Make a move at a cell
		// Check if the move has been reflected on the board
		assertEquals("O", this.board.getBoard()[2][2]);
	}

	@Test
	public void testMakeMove3() {
		this.board.initializeBoard(); // Initialize the board
		this.board.makeMove(1, 2, "O"); // Make a move at a cell
		// Make same move from another player at a cell
		this.board.makeMove(1, 2, "X");
		// Check if the move has been reflected for the right player on board
		assertEquals("O", this.board.getBoard()[1][2]);
	}

	// Test the isGameOver() method
	@Test
	public void testIsGameOver1() {
		this.board.initializeBoard(); // Initialize the board
		assertFalse(this.board.isGameOver()); // Check if a new game is not over
		// Make moves to form a winning line (three in a column)
		this.board.makeMove(0, 0, "X");
		this.board.makeMove(0, 1, "X");
		this.board.makeMove(0, 2, "X");
		// Check if the game is over after a winning line is formed
		assertTrue(this.board.isGameOver());
	}

	@Test
	public void testIsGameOver2() {
		this.board.initializeBoard(); // Initialize the board
		// Make moves to form a winning line (three in a diagonal)
		this.board.makeMove(0, 0, "X");
		this.board.makeMove(1, 1, "X");
		this.board.makeMove(2, 2, "X");
		// Check if the game is over after a winning line is formed
		assertTrue(this.board.isGameOver());
	}

	@Test
	public void testIsGameOver3() {
		this.board.initializeBoard(); // Initialize the board
		// Make moves to form a winning line (three in a diagonal)
		this.board.makeMove(2, 0, "X");
		this.board.makeMove(1, 1, "X");
		this.board.makeMove(0, 2, "X");
		// Check if the game is over after a winning line is formed
		assertTrue(this.board.isGameOver());
	}

	// Test the getWinner() method
	@Test
	public void testGetWinner1() {
		this.board.initializeBoard(); // Initialize the board
		// Check if the winner is null at the start of the game
		assertNull(this.board.getWinner());
		// Make moves to form a winning line (three in a column)
		this.board.makeMove(0, 0, "X");
		this.board.makeMove(0, 1, "X");
		this.board.makeMove(0, 2, "X");
		// Check if the winner is correctly identified
		assertEquals("X", this.board.getWinner());
	}

	@Test
	public void testGetWinner2() {
		this.board.initializeBoard(); // Initialize the board
		// Make moves to form a winning line (three in a column)
		this.board.makeMove(0, 0, "O");
		this.board.makeMove(0, 1, "O");
		this.board.makeMove(0, 2, "O");
		// Check if the winner is correctly identified
		assertEquals("O", this.board.getWinner());
	}

	@Test
	public void testGetWinner3() {
		this.board.initializeBoard(); // Initialize the board with empty values.
		// Make a move for player "X" at position (0,0).
		this.board.makeMove(0, 0, "X");
		// Make another move for player "X" at position (1,1).
		this.board.makeMove(1, 1, "X");

		// Assert that the winner is still null since there aren't enough
		// moves made to win.
		// At this point, no player has met the winning condition.
		assertEquals(null, this.board.getWinner());
	}
}

