public class HWMain9 {
    public static void main(String[] args) {

        // creating a regular book.
        Book b1 = new Book("Java Basics", 10.0);

        // creating an ebook.
        EBook b2 = new EBook("Advanced Java", 15.0, 2.5);

        // creating libraries and assigning books.
        Library lib1 = new Library(b1);
        Library lib2 = new Library(b2);

        // displaying book info.
        lib1.displayBook();
        lib2.displayBook();
    }
}