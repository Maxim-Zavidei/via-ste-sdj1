public class EBook extends Book {

    private String url;

    public EBook(String url, String title, String isbn) {
        super(title, isbn);
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public String getBookType() {
        return "E-Book";
    }

    @Override
    public String toString() {
        return super.toString() + ", EBook{" + "url='" + url + '\'' + '}';
    }
}
