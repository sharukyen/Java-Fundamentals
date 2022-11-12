package Week6;

/**
 *You are required to modify the Book class. The Book class
 *
 * implements the Comparable<Book> interface
 * implements the int compareTo(Book other) method.
 * The method returns the result of the value 0 if a book is "equal" to the argument book, a value less than 0 if book is "less" than the argument book and a value greater than 0 if book is "greater" than the argument book.
 * You should compare books by the number of pages. If the number of pages in two books are the same, then compare books by the titles.
 */

class Book implements Comparable<Book>{
    private String title, author;
    private int numOfPages=1;
    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        numOfPages = pages;
    }
    public String toString() {
        return String.format("%s(%s, %d pages)",title,author,numOfPages);
    }
    public int compareTo(Book b) {
        return numOfPages == b.numOfPages?title.compareTo(b.title):numOfPages - b.numOfPages;
    }
    public static void main(String[] args) {
        Book b1 = new Book("Fluency", "Jennifer Foehner Wells", 321);
        Book b2 = new Book("The Martian", "Andy Weir", 150);
        Book b3 = new Book("Ready Player One", "Tade Thompson", 150);
        System.out.println(b1.compareTo(b2));
        System.out.println(b1.compareTo(b3));
        System.out.println(b2.compareTo(b3));
    }
}
