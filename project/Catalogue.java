/**
 * @author Jingjing Yang <jingjing.yang@tuni.fi>
 * @version 2024.0219
 * @since 17.0
 */
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Catalogue {

    /**
     * Represents the collection of books in the library's catalogue.
     * 
     * Stores all the books that are currently available in the library.
     * It is used for adding, removing, searching, and listing books within the catalogue.
     */
    private ArrayList<Book> books;

    /**
     * Constructs a new Catalogue instance.
     */
    public Catalogue() {
        this.books = new ArrayList<>();
    }

    /**
     * Adds a book to the catalogue.
     *
     * @param book The book to add. Must not be null.
     * @throws IllegalArgumentException if the book is null.
     */
    public void addBook(Book book) {
        if (book == null) {
            throw new IllegalArgumentException("Book cannot be null");
        }
        books.add(book);
    }

    /**
     * Removes a book from the catalogue.
     *
     * @param book The book to remove. Must not be null.
     * @throws IllegalArgumentException if the book is null.
     */
    public void removeBook(Book book) {
        if (book == null) {
            throw new IllegalArgumentException("Book cannot be null");
        }
        books.remove(book);
    }

    /**
     * Searches for books by title.
     *
     * @param title The title to search for.
     * @return A list of books with matching titles.
     */
    public List<Book> searchByTitle(String title) {
        return books.stream()
                .filter(book -> book.getTitle().equalsIgnoreCase(title))
                .collect(Collectors.toList());
    }

    /**
     * Searches for books by author.
     *
     * @param author The author to search for.
     * @return A list of books written by the specified author.
     */
    public List<Book> searchByAuthor(String author) {
        return books.stream()
                .filter(book -> book.getAuthor().equalsIgnoreCase(author))
                .collect(Collectors.toList());
    }

    /**
     * Lists all the books in the catalogue.
     *
     * @return A list of all books in the catalogue.
     */
    public List<Book> listAllBooks() {
        return new ArrayList<>(books);
    }

    /**
     * Updates the details of a book in the catalogue.
     *
     * @param oldBook The existing book to be updated. Must not be null.
     * @param newBook The book with updated details. Must not be null.
     * @throws IllegalArgumentException if either oldBook or newBook is null.
     */
    public void updateBookDetails(Book oldBook, Book newBook) {
        if (oldBook == null || newBook == null) {
            throw new IllegalArgumentException("Books cannot be null");
        }
        if (books.contains(oldBook)) {
            books.remove(oldBook);
            books.add(newBook);
        }
    }
}
