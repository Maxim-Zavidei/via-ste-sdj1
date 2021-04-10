public class Student {

    private String name;
    private int studyNumber;
    private String nationality;
    private int groupNumber;
    private MyDate birthday;

    public Student(String name, int studyNumber, String nationality, int groupNumber, MyDate birthday) {
        this.name = name;
        this.studyNumber = studyNumber;
        this.nationality = nationality;
        this.groupNumber = groupNumber;
        this.birthday = birthday.copy();
    }

    public String getName() {
        return name;
    }

    public int getStudyNumber() {
        return studyNumber;
    }

    public String getNationality() {
        return nationality;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public MyDate getBirthday() {
        return birthday.copy();
    }

    public int getAge() {
        return birthday.yearsBetween(new MyDate());
    }

    @Override
    public String toString() {
        return "{" + "name=" + name + ", studyNumber=" + studyNumber + ", nationality=" + nationality + ", groupNumber=" + groupNumber + ", birthday=" + birthday + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Student)) return false;
        Student other = (Student) obj;
        return name.equals(other.name) && studyNumber == other.studyNumber && nationality.equals(other.nationality) && groupNumber == other.groupNumber && birthday.equals(other.birthday);
    }
}
