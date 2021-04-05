public class Person {

    private String name;
    private int age;
    private char gender;

    public void set(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Person(String name, int age, char gender) {
        set(name, age, gender);
    }

    public Person(String name, char gender) {
        this(name, 0, gender);
    }

    public Person(char gender) {
        this(null, 0, gender);
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

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Name=" + this.name + ", Age=" + this.age + ", Gender=" + this.gender;
    }

    public String getAgeStatus() {
        if (age < 0) {
            return "Age can't be less then 0.";
        } else if (age <= 12) {
            return "Child.";
        } else if (age <= 19) {
            return "Teenager.";
        } else if (age <= 65) {
            return "Adult.";
        } else {
            return "Senior citizen.";
        }
    }

    public String getStatus() {
        return age < 0 || (gender - 70) * (gender - 77) * (gender - 102) * (gender - 109) != 0 ? "Error" : new String[] {"Girl", "Boy", "Woman", "Man"}[gender % 2 + (age < 18 ? 0 : 2)];
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Person)) return false;
        Person other = (Person) obj;
        return (name == null ? other.name == null : name.equals(other.name)) && age == other.age && gender == other.gender;
    }
}
