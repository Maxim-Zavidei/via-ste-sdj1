public class Main {
    public static void main(String[] args) {

        Book[] books = new Book[] {
            new PrintedBook("lol", "55", true),
            new PrintedBook("lol2", "54", false),
            new EBook("https://", "lol3", "53")
        };

        for (Book book : books) {
            System.out.println(book.getBookType());
            System.out.println(book.equals(books[1]));
        }
    }
}
