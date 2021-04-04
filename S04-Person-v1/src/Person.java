public class Person {

    private String name;
    private int age;
    private char gender;

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Person(String name, char gender) {
        this(name, 0, gender);
    }

    public Person(char gender) {
        this(null, 0, gender);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public char getGender() {
        return this.gender;
    }

    @Override
    public String toString() {
        return "Name=" + this.name + ", Age=" + this.age + ", Gender=" + this.gender;
    }
}
