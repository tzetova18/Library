public class BookCopy implements Borrowable {

    private int id;
    private boolean available;
    private Book book;

    public BookCopy(int id, Book book) {
        this.id = id;
        this.book = book;
        this.available = true;
    }

    @Override
    public void borrowItem() {
        if (available) {
            available = false;
        }
    }

    @Override
    public void returnItem() {
        available = true;
    }

    @Override
    public boolean isAvailable() {
        return available;
    }

    @Override
    public int getId() {
        return id;
    }

    public Book getBook() {
        return book;
    }

    @Override
    public String toString() {
        return "Copy ID: " + id +
               ", Book: " + book +
               ", Available: " + available;
    }
}