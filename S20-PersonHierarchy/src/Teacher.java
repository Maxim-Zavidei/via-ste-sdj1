public class Teacher extends Employee {

    public Teacher(String name, int age, int socialSecNum) {
        super(name, age, socialSecNum);
    }

    @Override
    public String toString() {
        return "Teacher: " + super.getName();
    }
}
