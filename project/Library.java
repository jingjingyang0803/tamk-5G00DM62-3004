/**
 * @author Jingjing Yang <jingjing.yang@tuni.fi>
 * @version 2024.0219
 * @since 17.0
 */
import java.util.ArrayList;

public class Library {
    
    /**
     * A collection of books available in the library.
     */
    private ArrayList<Book> books = new ArrayList<>();

    /**
     * Adds a book to the library's collection.
     *
     * @param book The book to be added. Must not be null.
     * @throws IllegalArgumentException if the book is null.
     */
    public void addBook(Book book) {
        if (book == null) {
            throw new IllegalArgumentException("Book cannot be null");
        }
        books.add(book);
    }

    /**
     * Removes a book from the library's collection.
     *
     * @param book The book to be removed. Must not be null.
     * @throws IllegalArgumentException if the book is null.
     */
    public void removeBook(Book book) {
        if (book == null) {
            throw new IllegalArgumentException("Book cannot be null");
        }
        books.remove(book);
    }

    /**
     * Finds a book in the library by its ISBN.
     *
     * @param ISBN The ISBN of the book to find.
     * @return The book with the specified ISBN, or null if not found.
     */
    public Book findBook(String ISBN) {
        for (Book book : books) {
            if (book.getISBN().equals(ISBN)) {
                return book;
            }
        }
        return null;
    }

    /**
     * Checks out a book from the library to a user.
     *
     * @param user The user who is checking out the book. Must not be null.
     * @param book The book to be checked out. Must be in the library.
     * @throws IllegalArgumentException if the user or book is null, or if the
     * book is not in the library.
     */
    public void checkOutBook(User user, Book book) {
        if (user == null || book == null) {
            throw new IllegalArgumentException("User and book cannot be null");
        }
        if (!books.contains(book)) {
            throw new IllegalArgumentException("Book is not available in the library");
        }
        books.remove(book);
        user.borrowBook(book);
    }

    /**
     * Returns a book to the library from a user.
     *
     * @param user The user who is returning the book. Must not be null.
     * @param book The book to be returned. Must not be null.
     * @throws IllegalArgumentException if the user or book is null, or if the
     * book is already in the library.
     */
    public void returnBook(User user, Book book) {
        if (user == null || book == null) {
            throw new IllegalArgumentException("User and book cannot be null");
        }
        if (books.contains(book)) {
            throw new IllegalArgumentException("Book is already in the library");
        }
        books.add(book);
        user.returnBook(book);
    }
}
