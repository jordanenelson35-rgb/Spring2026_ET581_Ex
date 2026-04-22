public class Library {
    Book book; // this means library HAS-A book.

    // this constructor assigns a book to the library.
    public Library(Book book) {
        this.book = book;
    }

    // this method will display the book info.
    public void displayBook() {
        book.showInfo(); // calling the method from Book or EBook.
    }
}