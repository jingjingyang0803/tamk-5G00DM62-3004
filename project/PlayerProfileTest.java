import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class PlayerProfileTest {

	/**
	 * Instance of PlayerProfile used for testing.
	 */
	private PlayerProfile playerProfile;

	// Initializing a PlayerProfile object for testing
	@Before
	public void setUp() {
		this.playerProfile = new PlayerProfile("TestUser");
	}

	// Testing getUsername method
	@Test
	public void testGetUsername() {
		assertEquals("TestUser", this.playerProfile.getUsername());
	}

	@Test
	public void testGetUsernameAfterChange() {
		// Changing username
		this.playerProfile.setUsername("NewUser");
		// Testing getUsername method after username change
		assertEquals("NewUser", this.playerProfile.getUsername());
	}

	@Test
	public void testGetUsernameAfterSecondChange() {
		// Changing username
		this.playerProfile.setUsername("NewUser");
		// Changing username again
		this.playerProfile.setUsername("AnotherUser");
		// Testing getUsername method after multiple username changes
		assertEquals("AnotherUser", this.playerProfile.getUsername());
	}

	// Testing getGamesPlayed method
	@Test
	public void testGetGamesPlayed() {
		assertEquals(0, this.playerProfile.getGamesPlayed());
	}

	@Test
	public void testGetGamesPlayedAfterIncrement() {
		// Incrementing games played
		this.playerProfile.incrementGamesPlayed();
		// Testing getGamesPlayed method after incrementing games played
		assertEquals(1, this.playerProfile.getGamesPlayed());
	}

	@Test
	public void testGetGamesPlayedAfterMultipleIncrement() {
		// Incrementing games played
		this.playerProfile.incrementGamesPlayed();
		// Incrementing games played again
		this.playerProfile.incrementGamesPlayed();
		// Incrementing games played again
		this.playerProfile.incrementGamesPlayed();
		// Testing getGamesPlayed method after multiple increments of games played
		assertEquals(3, this.playerProfile.getGamesPlayed());
	}

	// Testing getGamesWon method
	@Test
	public void testGetGamesWon() {
		assertEquals(0, this.playerProfile.getGamesWon());
	}

	@Test
	public void testGetGamesWonAfterIncrement() {
		// Incrementing games won
		this.playerProfile.incrementGamesWon();
		// Testing getGamesWon method after incrementing games won
		assertEquals(1, this.playerProfile.getGamesWon());
	}

	@Test
	public void testGetGamesWonAfterMultipleIncrement() {
		// Incrementing games won
		this.playerProfile.incrementGamesWon();
		// Incrementing games won again
		this.playerProfile.incrementGamesWon();
		// Incrementing games won again
		this.playerProfile.incrementGamesWon();
		// Testing getGamesWon method after multiple increments of games won
		assertEquals(3, this.playerProfile.getGamesWon());
	}

	@Test
	public void testIncrementGamesPlayed() {
		// Incrementing games played
		this.playerProfile.incrementGamesPlayed();
		// Testing getGamesPlayed method after incrementing games played
		assertEquals(1, this.playerProfile.getGamesPlayed());
	}

	@Test
	public void testIncrementGamesPlayedTwice() {
		// Incrementing games played
		this.playerProfile.incrementGamesPlayed();
		// Incrementing games played again
		this.playerProfile.incrementGamesPlayed();
		// Testing getGamesPlayed method after incrementing games played twice
		assertEquals(2, this.playerProfile.getGamesPlayed());
	}

	@Test
	public void testIncrementGamesPlayedThrice() {
		// Incrementing games played
		this.playerProfile.incrementGamesPlayed();
		// Incrementing games played again
		this.playerProfile.incrementGamesPlayed();
		// Incrementing games played again
		this.playerProfile.incrementGamesPlayed();
		// Testing getGamesPlayed method after incrementing games played thrice
		assertEquals(3, this.playerProfile.getGamesPlayed());
	}

	@Test
	public void testIncrementGamesWon() {
		// Incrementing games won
		this.playerProfile.incrementGamesWon();
		// Testing getGamesWon method after incrementing games won
		assertEquals(1, this.playerProfile.getGamesWon());
	}

	@Test
	public void testIncrementGamesWonTwice() {
		// Incrementing games won
		this.playerProfile.incrementGamesWon();
		// Incrementing games won again
		this.playerProfile.incrementGamesWon();
		// Testing getGamesWon method after incrementing games won twice
		assertEquals(2, this.playerProfile.getGamesWon());
	}

	@Test
	public void testIncrementGamesWonThrice() {
		// Incrementing games won
		this.playerProfile.incrementGamesWon();
		// Incrementing games won again
		this.playerProfile.incrementGamesWon();
		// Incrementing games won again
		this.playerProfile.incrementGamesWon();
		// Testing getGamesWon method after incrementing games won thrice
		assertEquals(3, this.playerProfile.getGamesWon());
	}
}
