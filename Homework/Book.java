public class Book {
    String title; // this stores the title of the book.
    double price; // this stores the price of the book.

    // this constructor initializes book info.
    public Book(String title, double price) {
        this.title = title;
        this.price = price;
    }

    // this method will display basic book info.
    public void showInfo() {
        System.out.println("Title: " + title + ", Price: " + price);
    }
}