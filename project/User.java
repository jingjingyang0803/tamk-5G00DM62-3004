/**
 * @author Jingjing Yang <jingjing.yang@tuni.fi>
 * @version 2024.0219
 * @since 17.0
 */
import java.util.ArrayList;

public class User {

    /**
     * The name of the user.
     * Used for identification and display purposes within the library system.
     */
    private String name;

    /**
     * The email address of the user.
     * Used as a unique identifier and for communication purposes.
     */
    private String email;

    /**
     * The password for the user's account.
     * Used for authentication purposes.
     */
    private String password;

    /**
     * A list of books currently borrowed by the user.
     * This list tracks the user's active book borrowings.
     */
    private ArrayList<Book> borrowedBooks = new ArrayList<>();

    /**
     * Registers a new user with the given details.
     *
     * @param name     The name of the user.
     * @param email    The email address of the user.
     * @param password The password for the user.
     * @throws IllegalArgumentException if any argument is null.
     */
    public void register(String name, String email, String password) {
        if (name == null || email == null || password == null) {
            throw new IllegalArgumentException("User details cannot be null");
        }
        this.name = name;
        this.email = email;
        this.password = password;
    }

    /**
     * Deletes a user, clearing all their details.
     */
    public void deleteUser() {
        this.name = null;
        this.email = null;
        this.password = null;
        borrowedBooks.clear();
    }

    /**
     * Updates the user's details.
     *
     * @param name     The new name of the user.
     * @param email    The new email address of the user.
     * @param password The new password for the user.
     * @throws IllegalArgumentException if any argument is null.
     */
    public void updateUserDetails(String name, String email, String password) {
        if (name == null || email == null || password == null) {
            throw new IllegalArgumentException("User details cannot be null");
        }
        this.name = name;
        this.email = email;
        this.password = password;
    }

    /**
     * Borrows a book, adding it to the list of borrowed books.
     *
     * @param book The book to be borrowed.
     * @throws IllegalArgumentException if the book is null.
     */
    public void borrowBook(Book book) {
        if (book == null) {
            throw new IllegalArgumentException("Book cannot be null");
        }
        borrowedBooks.add(book);
    }

    /**
     * Returns a book, removing it from the list of borrowed books.
     *
     * @param book The book to be returned.
     * @throws IllegalArgumentException if the book is null or not in the borrowed list.
     */
    public void returnBook(Book book) {
        if (book == null || !borrowedBooks.contains(book)) {
            throw new IllegalArgumentException("Book is not borrowed or does not exist");
        }
        borrowedBooks.remove(book);
    }

    // Getters and setters for name, email, password
    // (Consider implementing in a real-world scenario for data encapsulation)
}
