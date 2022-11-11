package Week3;

/**
 *A protected String data field named title that defines the title of a book.
 * A protected String data field named author that defines the author name of a book.
 * A protected String data field named publisher that defines the publisher name of a book.
 * A protected int data field named yearOfEdition that defines the year of edition of a book.
 * A protected String data field named ISBNCode that defines the ISBN code number of a book. The default value is "N/A".
 * An overloaded constructor that creates a Book object with the given title, author and ISBNCode.
 * An overloaded constructor that creates a Book object with the given title, author, publisher, year of edition and ISBN code.
 * A method named toString() which returns a string representation of the object as examples shown below.
 * A method named equals(Object ob) which compares two book objects. The method returns true if the they are equal, and returns false otherwise. Two instances of Book are considered equal if the ISBN numbers are the same.
 *
 *Continuing on from the previous class, define a class named EBook which represents an e-book. The EBook class extends the Book class. The EBook class contains the following extra fields and methods:
 *
 * A private String data field named downloadSite which defines the web address of an e-book.
 * A private int data field named sizeMB which defines the size (in MB) of an e-book.
 * A constructor that creates a EBook object with the specified values.
 * The overridden toString() method which returns a string representation of object as the examples below.
 * A method named getDownloadSite() which returns the web address of an e-book.
 * A method named getSizeMB() which returns the size (in MB) of an e-book.
 */

public class Book {
    protected String title;
    protected String author;
    protected String publisher;
    protected int yearOfEdition;
    protected String ISBNCode = "N/A";

    public Book(String title, String author, String ISBNCode) {
        this.title = title;
        this.author = author;
        this.ISBNCode = ISBNCode;
    }

    public Book(String title, String author, String publisher, int yearOfEdition, String isbn) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.yearOfEdition = yearOfEdition;
        ISBNCode = isbn;
    }

    public String toString() {
        return String.format("Book=%s, author=%s, ISBN=%s", title, author, ISBNCode);
    }

    public boolean equals(Object other) {
        return (other instanceof Book) &&
                (ISBNCode == ((Book) other).ISBNCode);
    }

}

class EBook extends Book {
    private String downloadSite ;
    private int sizeMB;
    public EBook(String title, String author, String isbn, String site, int size ) {
        super(title, author, isbn);
        downloadSite = site;
        sizeMB = size;
    }
    public String toString() { return String.format("%s, web address=%s, size=%d", super.toString(), downloadSite, sizeMB); }
    public String getDownloadSite() { return downloadSite; }
    public int getSizeMB() { return sizeMB; }

    public static void main(String[] args) {
        EBook firstBook = new EBook("The JFC Swing Tutorial", "Kathy Walrath", "0201914670", "http//abc.com", 128);
        EBook secondBook = new EBook("The JFC Swing Tutorial", "Kathy Walrath", "0201914670", "http://xyz.com", 256);
        System.out.println(firstBook);
        System.out.println(secondBook);
    }
}