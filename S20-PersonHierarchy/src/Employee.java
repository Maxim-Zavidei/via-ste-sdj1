public abstract class Employee extends Person {

    public Employee(String name, int age, int socialSecNum) {
        super(name, age, socialSecNum);
    }

    public String toString() {
        return "Employee: " + super.getName();
    }
}
