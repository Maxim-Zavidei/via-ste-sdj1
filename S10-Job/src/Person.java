public class Person {

    private Name name;
    private MyDate birthday;
    private char gender;

    public Person(Name name, MyDate birthday, char gender) {
        this.name = name;
        this.birthday = birthday.copy();
        this.gender = gender;
    }

    public Person(Name name, char gender) {
        this(name, new MyDate(), gender);
    }

    public Person(char gender) {
        this(null, new MyDate(), gender);
    }

    public String getName() {
        return this.name.getFullName();
    }

    public int getAge() {
        return birthday.yearsBetween(new MyDate());
    }

    public char getGender() {
        return this.gender;
    }

    public MyDate getBirthday() {
        return this.birthday.copy();
    }

    public void setName(Name name) {
        this.name = name;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Name=" + this.name.getFullName() + ", Age=" + getAge() + ", Gender=" + this.gender + ", Birthday= " + this.birthday;
    }

    public String getAgeStatus() {
        int age = getAge();
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
        int age = getAge();
        return age < 0 || (gender - 70) * (gender - 77) * (gender - 102) * (gender - 109) != 0 ? "Error" : new String[] {"Girl", "Boy", "Woman", "Man"}[gender % 2 + (age < 18 ? 0 : 2)];
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Person)) return false;
        Person other = (Person) obj;
        return (name == null ? other.name == null : name.equals(other.name)) && birthday.equals(other.birthday) && gender == other.gender;
    }
}
