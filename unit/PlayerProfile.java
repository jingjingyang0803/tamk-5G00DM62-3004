/**
 * @author Jingjing Yang <jingjing.yang@tuni.fi>
 * @version 2024.0212 (last modified)
 * @since 17.0 (miminimum Java version)
 */
class PlayerProfile {
	private String username;// player's username
	private int gamesPlayed;// the number of games they have played
	private int gamesWon;// the number of games they have won

	/**
	 * Constructs a new PlayerProfile with the provided username.
	 *
	 * @param username the username of the player
	 */
	public PlayerProfile(String username) {
		this.username = username;
		this.gamesPlayed = 0;
		this.gamesWon = 0;
	}

	/**
	 * Returns the username of the player.
	 *
	 * @return the username of the player
	 */
	public String getUsername() {
		return this.username;
	}

	/**
	 * Sets the username of the player.
	 * 
	 * @param username the new username of the player
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * Returns the number of games the player has played.
	 *
	 * @return the number of games played
	 */
	public int getGamesPlayed() {
		return this.gamesPlayed;
	}

	/**
	 * Returns the number of games the player has won.
	 *
	 * @return the number of games won
	 */
	public int getGamesWon() {
		return this.gamesWon;
	}

	/**
	 * Increments the number of games the player has played by one.
	 *
	 */
	public void incrementGamesPlayed() {
		this.gamesPlayed++;
	}

	/**
	 * Increments the number of games the player has won by one.
	 */
	public void incrementGamesWon() {
		this.gamesWon++;
	}
}
