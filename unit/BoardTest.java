import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class BoardTest {
	private Board board;

	@Before
	public void setUp() {
		this.board = new Board(); // Setting up a new Board object before each test
	}

	// Test the initializeBoard() method
	@Test
	public void testInitializeBoard1() {
		this.board.initializeBoard(); // Initialize the board
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				assertEquals("-", this.board.getBoard()[i][j]); // Check if all cells are initialized to "-"
			}
		}
	}

	@Test
	public void testInitializeBoard2() {
		this.board.initializeBoard(); // Initialize the board
		assertEquals(null, this.board.getWinner()); // Check if the winner is initialized to null
	}

	@Test
	public void testInitializeBoard3() {
		this.board.initializeBoard(); // Initialize the board
		assertEquals(3, this.board.getBoard().length); // Check if the board size is 3x3
	}

	// Test the isValidMove() method
	@Test
	public void testIsValidMove1() {
		this.board.initializeBoard(); // Initialize the board
		assertTrue(this.board.isValidMove(0, 0)); // Check if a valid cell is indeed valid
		assertFalse(this.board.isValidMove(3, 3)); // Check if an out-of-bound cell is detected as invalid
	}

	@Test
	public void testIsValidMove2() {
		this.board.initializeBoard(); // Initialize the board
		assertFalse(this.board.isValidMove(-1, 0)); // Check if a negative row index is detected as invalid
		assertFalse(this.board.isValidMove(0, -1)); // Check if a negative column index is detected as invalid
	}

	@Test
	public void testIsValidMove3() {
		this.board.initializeBoard(); // Initialize the board
		this.board.makeMove(0, 0, "X"); // Make a move at a cell
		assertFalse(this.board.isValidMove(0, 0)); // Check if an already occupied cell is detected as invalid
	}

	// Test the makeMove() method
	@Test
	public void testMakeMove1() {
		this.board.initializeBoard(); // Initialize the board
		this.board.makeMove(0, 0, "X"); // Make a move at a cell
		assertEquals("X", this.board.getBoard()[0][0]); // Check if the move has been reflected on the board
	}

	@Test
	public void testMakeMove2() {
		this.board.initializeBoard(); // Initialize the board
		this.board.makeMove(2, 2, "O"); // Make a move at a cell
		assertEquals("O", this.board.getBoard()[2][2]); // Check if the move has been reflected on the board
	}

	@Test
	public void testMakeMove3() {
		this.board.initializeBoard(); // Initialize the board
		this.board.makeMove(1, 2, "O"); // Make a move at a cell
		this.board.makeMove(1, 2, "X"); // Make same move from another player at a cell
		assertEquals("O", this.board.getBoard()[1][2]); // Check if the move has been reflected for the right player on the board
	}

	// Test the isGameOver() method
	@Test
	public void testIsGameOver1() {
		this.board.initializeBoard(); // Initialize the board
		assertFalse(this.board.isGameOver()); // Check if a new game is not over
		this.board.makeMove(0, 0, "X"); // Make moves to form a winning line (three in a column)
		this.board.makeMove(0, 1, "X");
		this.board.makeMove(0, 2, "X");
		assertTrue(this.board.isGameOver()); // Check if the game is over after a winning line is formed
	}

	@Test
	public void testIsGameOver2() {
		this.board.initializeBoard(); // Initialize the board
		this.board.makeMove(0, 0, "X"); // Make moves to form a winning line (three in a diagonal)
		this.board.makeMove(1, 1, "X");
		this.board.makeMove(2, 2, "X");
		assertTrue(this.board.isGameOver()); // Check if the game is over after a winning line is formed
	}

	@Test
	public void testIsGameOver3() {
		this.board.initializeBoard(); // Initialize the board
		this.board.makeMove(2, 0, "X"); // Make moves to form a winning line (three in a diagonal)
		this.board.makeMove(1, 1, "X");
		this.board.makeMove(0, 2, "X");
		assertTrue(this.board.isGameOver()); // Check if the game is over after a winning line is formed
	}

	// Test the getWinner() method
	@Test
	public void testGetWinner1() {
		this.board.initializeBoard(); // Initialize the board
		assertNull(this.board.getWinner()); // Check if the winner is null at the start of the game

		this.board.makeMove(0, 0, "X"); // Make moves to form a winning line (three in a column)
		this.board.makeMove(0, 1, "X");
		this.board.makeMove(0, 2, "X");
		assertEquals("X", this.board.getWinner()); // Check if the winner is correctly identified
	}

	@Test
	public void testGetWinner2() {
		this.board.initializeBoard(); // Initialize the board
		this.board.makeMove(0, 0, "O"); // Make moves to form a winning line (three in a column)
		this.board.makeMove(0, 1, "O");
		this.board.makeMove(0, 2, "O");
		assertEquals("O", this.board.getWinner()); // Check if the winner is correctly identified
	}

	@Test
	public void testGetWinner3() {
		this.board.initializeBoard(); // Initialize the board with empty values.

		this.board.makeMove(0, 0, "X"); // Make a move for player "X" at position (0,0).
		this.board.makeMove(1, 1, "X"); // Make another move for player "X" at position (1,1).

		// Assert that the winner is still null since there aren't enough moves made to win.
		// At this point, no player has met the winning condition.
		assertEquals(null, this.board.getWinner());
	}
}

