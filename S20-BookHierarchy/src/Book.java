public abstract class Book {

    private String title;
    private String isbn;

    public Book(String title, String isbn) {
        this.title = title;
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getIsbn() {
        return isbn;
    }

    public abstract String getBookType();

    @Override
    public String toString() {
        return "Book{" + "title='" + title + '\'' + ", isbn='" + isbn + '\'' + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Book)) return false;
        Book other = (Book) obj;
        return title.equals(other.title) && isbn.equals(other.isbn);
    }
}
