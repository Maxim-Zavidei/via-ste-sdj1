public class Main {
    public static void main(String[] args) {

        Course courseObj = new Course("Math", new Instructor("lol", "888"), new TextBook("lolbook", "nobody", 9999));
        System.out.println(courseObj);
        courseObj.setSecondaryTextBook(new TextBook("lolbook chap2", "nobody", 9998));
        System.out.println(courseObj);
    }
}
