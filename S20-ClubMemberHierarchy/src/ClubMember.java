public abstract class ClubMember {

    private String name;
    private int age;

    public ClubMember(String name, int age) {
        this.name = name;
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "ClubMember{" + "name='" + name + '\'' + ", age=" + age + '}';
    }

    public abstract double getMembershipFee();
}
