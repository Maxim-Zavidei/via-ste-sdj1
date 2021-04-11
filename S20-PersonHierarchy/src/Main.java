public class Main {
    public static void main(String[] args) {

        Person secretary = new Secretary("Secretary", 2, 5);
        Person teacher = new Teacher("Teacher", 5, 6);
        Person student = new Student("Student", 7, 7);

        System.out.println(secretary);
        System.out.println(teacher);
        System.out.println(student);
    }
}
