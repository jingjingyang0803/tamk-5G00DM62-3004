/**
 * @author Jingjing Yang <jingjing.yang@tuni.fi>
 * @version 2024.0219
 * @since 17.0
 */
public class Book {

    /**
     * The title of the book.
     *
     * Used as the primary identifier and descriptor for the book.
     */
    private String title;

    /**
     * The author of the book.
     *
     * Indicates who wrote the book and is used for searching and categorization.
     */
    private String author;

    /**
     * The International Standard Book Number (ISBN) of the book.
     *
     * A unique identifier for the book used globally for identification and
     * inventory purposes.
     */
    private String ISBN;

    /**
     * Sets the title of the book.
     *
     * @param title The title of the book. Cannot be null or empty.
     * @throws IllegalArgumentException if the title is null or empty.
     */
    public void setTitle(String title) {
        if (title == null || title.isEmpty()) {
            throw new IllegalArgumentException("Title cannot be null or empty");
        }
        this.title = title;
    }

    /**
     * Gets the title of the book.
     *
     * @return The title of the book.
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * Sets the author of the book.
     *
     * @param author The name of the author. Cannot be null or empty.
     * @throws IllegalArgumentException if the author name is null or empty.
     */
    public void setAuthor(String author) {
        if (author == null || author.isEmpty()) {
            throw new IllegalArgumentException("Author cannot be null or empty");
        }
        this.author = author;
    }

    /**
     * Gets the author of the book.
     *
     * @return The name of the author.
     */
    public String getAuthor() {
        return this.author;
    }

    /**
     * Sets the ISBN of the book.
     *
     * @param ISBN The ISBN of the book. Cannot be null or empty.
     * @throws IllegalArgumentException if the ISBN is null or empty.
     */
    public void setISBN(String ISBN) {
        if (ISBN == null || ISBN.isEmpty()) {
            throw new IllegalArgumentException("ISBN cannot be null or empty");
        }
        this.ISBN = ISBN;
    }

    /**
     * Gets the ISBN of the book.
     *
     * @return The ISBN of the book.
     */
    public String getISBN() {
        return this.ISBN;
    }
}
