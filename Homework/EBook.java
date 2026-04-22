public class EBook extends Book {
    double fileSize; // this stores the size of the ebook in MB.

    // this constructor will initialize everything using super.
    public EBook(String title, double price, double fileSize) {
        super(title, price); // calling parent constructor.
        this.fileSize = fileSize;
    }

    // this overrides showInfo to include file size.
    @Override
    public void showInfo() {
        System.out.println("EBook: " + title + ", Price: " + price + ", Size: " + fileSize + "MB");
    }
}