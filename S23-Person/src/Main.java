public class Main {
    public static void main(String[] args) {
        try {
            Person person = new Person(new Name("GG", "LOL"), new MyDate(5, 5, 2000), 'f');
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
