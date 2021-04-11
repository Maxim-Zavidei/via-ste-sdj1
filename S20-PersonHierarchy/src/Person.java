public abstract class Person {

    private String name;
    private int age;
    private int socialSecNum;

    public Person(String name, int age, int socialSecNum) {
        setName(name);
        this.age = age;
        this.socialSecNum = socialSecNum;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getSocialSecurityNumber() {
        return socialSecNum;
    }

    public abstract String toString();
}
