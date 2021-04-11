public class Secretary extends Employee {

    public Secretary(String name, int age, int socialSecNum) {
        super(name, age, socialSecNum);
    }

    @Override
    public String toString() {
        return "Secretary: " + super.getName();
    }
}
