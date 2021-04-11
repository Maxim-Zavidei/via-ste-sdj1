public class Student extends Person {

    public Student(String name, int age, int socialSecNum) {
        super(name, age, socialSecNum);
    }

    public String toString() {
        return "Student: " + super.getName();
    }
}
