/**
 * @author Jingjing Yang <jingjing.yang@tuni.fi>
 * @version 2024.0219
 * @since 17.0
 */
import java.util.ArrayList;

public class BorrowRecord {

    /**
     * The user who borrowed the book.
     */
    private User user;

    /**
     * The book that has been borrowed.
     */
    private Book book;

    /**
     * Constructs a new BorrowRecord with the specified user and book.
     *
     * @param user The user who is borrowing the book. Cannot be null.
     * @param book The book that is being borrowed. Cannot be null.
     * @throws IllegalArgumentException if either the user or book is null.
     */
    public BorrowRecord(User user, Book book) {
        if (user == null || book == null) {
            throw new IllegalArgumentException("User and book cannot be null");
        }
        this.user = user;
        this.book = book;
    }

    /**
     * Creates a new borrow record with the given user and book.
     *
     * @param user The user who is borrowing the book. Cannot be null.
     * @param book The book that is being borrowed. Cannot be null.
     * @throws IllegalArgumentException if either the user or book is null.
     */
    public void createRecord(User user, Book book) {
        if (user == null || book == null) {
            throw new IllegalArgumentException("User and book cannot be null");
        }
        this.user = user;
        this.book = book;
    }

    /**
     * Deletes the borrow record, removing the associated user and book details.
     */
    public void deleteRecord() {
        this.user = null;
        this.book = null;
    }

    /**
     * Updates the borrow record with a new user and book.
     *
     * @param user The new user for the record. Cannot be null.
     * @param book The new book for the record. Cannot be null.
     * @throws IllegalArgumentException if either the user or book is null.
     */
    public void updateRecord(User user, Book book) {
        if (user == null || book == null) {
            throw new IllegalArgumentException("User and book cannot be null");
        }
        this.user = user;
        this.book = book;
    }

    /**
     * Gets a description of the borrow record.
     *
     * @return A string representation of the borrow record, including user and
     * book details.
     */
    public String getRecord() {
        if (this.user == null || this.book == null) {
            return "Record is empty or incomplete";
        }
        return "User: " + user.getName() + ", Book: " + book.getTitle();
    }

    /**
     * Lists all borrow records in the specified list.
     *
     * @param records An ArrayList of BorrowRecord objects to be listed.
     *                Cannot be null.
     * @throws IllegalArgumentException if the records list is null.
     */
    public void listAllRecords(ArrayList<BorrowRecord> records) {
        if (records == null) {
            throw new IllegalArgumentException("Records list cannot be null");
        }

        for (BorrowRecord record : records) {
            System.out.println(record.getRecord());
        }
    }
}
