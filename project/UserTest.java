import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class UserTest {

    private User user;
    private Book book;

    @Before
    public void setUp() {
        user = new User();
        book = new Book();
        book.setTitle("Test Book");
    }

    // Test for register method
    @Test
    public void testRegisterValidUser() {
        user.register("John Doe", "johndoe@example.com", "password123");
        assertEquals("John Doe", user.getName());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRegisterNullName() {
        user.register(null, "johndoe@example.com", "password123");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRegisterEmptyEmail() {
        user.register("John Doe", "", "password123");
    }

    // Test for deleteUser method
    @Test
    public void testDeleteUser() {
        user.register("Jane Doe", "janedoe@example.com", "password321");
        user.deleteUser();
        assertNull(user.getName());
        assertNull(user.getEmail());
    }

    // Test for updateUserDetails method
    @Test
    public void testUpdateUserDetails() {
        user.register("John Doe", "johndoe@example.com", "password123");
        user.updateUserDetails("Jane Doe", "janedoe@example.com", "newpass456");
        assertEquals("Jane Doe", user.getName());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testUpdateUserDetailsWithNull() {
        user.register("John Doe", "johndoe@example.com", "password123");
        user.updateUserDetails(null, "janedoe@example.com", "newpass456");
    }

    // Test for borrowBook method
    @Test
    public void testBorrowBook() {
        user.borrowBook(book);
        assertTrue(user.getBorrowedBooks().contains(book));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBorrowNullBook() {
        user.borrowBook(null);
    }

    // Test for returnBook method
    @Test
    public void testReturnBook() {
        user.borrowBook(book);
        user.returnBook(book);
        assertFalse(user.getBorrowedBooks().contains(book));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testReturnBookNotBorrowed() {
        user.returnBook(book);
    }
}
