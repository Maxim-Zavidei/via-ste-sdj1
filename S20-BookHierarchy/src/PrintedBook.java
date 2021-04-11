public class PrintedBook extends Book {

    private boolean isPaperback;

    public PrintedBook(String title, String isbn, boolean isPaperback) {
        super(title, isbn);
        this.isPaperback = isPaperback;
    }

    public boolean isPaperback() {
        return isPaperback;
    }

    public String getBookType() {
        return isPaperback ? "Paperback" : "Hardback";
    }

    @Override
    public String toString() {
        return super.toString() + ", PrintedBook{" + "isPaperback=" + isPaperback + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof PrintedBook)) return false;
        PrintedBook other = (PrintedBook) obj;
        return super.equals(obj) && isPaperback == other.isPaperback;
    }
}
