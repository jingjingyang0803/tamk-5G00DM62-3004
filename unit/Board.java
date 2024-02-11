/**
 * @author 	Jingjing Yang <jingjing.yang@tuni.fi>
 * @version     2024.0211 (last modified)
 * @since   	17.0 (miminimum Java version)
 */
/**
 * This class represents a Board for a Tic-Tac-Toe game.
 */
class Board {
	private String[][] board; // 2D array to represent the board
	private String winner; // Variable to store the winner of the game

	/**
	 * Initializes the board to its starting state.
	 */
	public void initializeBoard() {
		this.board = new String[3][3]; // Initialize the board as a 3x3 grid
		// Fill the board with "-" to represent empty spaces
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				this.board[i][j] = "-";
			}
		}
		this.winner = null; // Set the winner to null at the start of the game
	}

	/**
	 * Checks if a given move is valid.
	 * @param x the x-coordinate of the move
	 * @param y the y-coordinate of the move
	 * @return true if the move is valid, false otherwise
	 */
	public boolean isValidMove(int x, int y) {
		// Check that the move is within the board's boundaries
		if (x < 0 || x > 2 || y < 0 || y > 2) {
			return false;
		}
		// Check that the chosen space is empty
		return this.board[x][y].equals("-");
	}

	/**
	 * Makes a move on the board.
	 * @param x the x-coordinate of the move
	 * @param y the y-coordinate of the move
	 * @param player the player making the move
	 */
	public void makeMove(int x, int y, String player) {
		// If the move is valid, place the player's symbol at the chosen coordinates
		if (isValidMove(x, y)) {
			this.board[x][y] = player;
		}
	}

	/**
	 * Checks if the game is over.
	 * @return true if the game is over, false otherwise
	 */
	public boolean isGameOver() {
		// Check rows for a win
		for (int i = 0; i < 3; i++) {
			if (this.board[i][0].equals(this.board[i][1]) && this.board[i][1].equals(this.board[i][2]) && !this.board[i][0].equals("-")) {
				this.winner = this.board[i][0]; // Set the winner to the player with three in a row
				return true;
			}
		}
		// Check columns for a win
		for (int i = 0; i < 3; i++) {
			if (this.board[0][i].equals(this.board[1][i]) && this.board[1][i].equals(this.board[2][i]) && !this.board[0][i].equals("-")) {
				this.winner = this.board[0][i]; // Set the winner to the player with three in a column
				return true;
			}
		}
		// Check diagonals for a win
		if (this.board[0][0].equals(this.board[1][1]) && this.board[1][1].equals(this.board[2][2]) && !this.board[0][0].equals("-")) {
			this.winner = this.board[0][0]; // Set the winner to the player with three in a diagonal
			return true;
		}
		if (this.board[0][2].equals(this.board[1][1]) && this.board[1][1].equals(this.board[2][0]) && !this.board[0][2].equals("-")) {
			this.winner = this.board[0][2]; // Set the winner to the player with three in a diagonal
			return true;
		}
		return false; // The game is not over if no player has three in a row, column, or diagonal
	}

	/**
	 * Gets the winner of the game.
	 * @return the winner of the game if the game is over, null otherwise.
	 */
	public String getWinner() {
		if (isGameOver()) {
			return winner; // Return the winner of the game
		} else {
			return null; // Return null if the game is not over
		}
	}

	/**
	 * Retrieves the current state of the game board.
	 *
	 * @return A 2D array of Strings representing the game board.
	 * Each element of the array contains a String value that indicates
	 * the state of each cell in the grid. Typically, these values are
	 * "-" for empty cells, and other symbols like "X" or "O" for occupied cells.
	 */
	public String[][] getBoard(){
		return board;
	}
}
