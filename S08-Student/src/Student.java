public class Student {

    private String name;
    private String nationality;
    private int studyNumber;

    public Student(String name, String nationality, int studyNumber) {
        setName(name);
        setNationality(nationality);
        this.studyNumber = studyNumber;
    }

    public Student(String name, int studyNumber) {
        this(name, null, studyNumber);
    }

    public void setName(String name) {
        // Order of conditions is important here because if equals method would be the first and the string were to be null it would throw an error.
        this.name = name == null || name.equals("") ? "Unknown" : name;
    }

    public void setNationality(String nationality) {
        // Order of conditions is important here because if length method would be the first and the string were to be null it would throw an error.
        this.nationality = nationality == null || nationality.length() != 2 ? null : nationality.toUpperCase();
    }

    public String getName() {
        return this.name;
    }

    public String getNationality() {
        return this.nationality;
    }

    public int getStudyNumber() {
        return this.studyNumber;
    }

    public boolean hasAKnownNationality() {
        return nationality != null;
    }

    public boolean hasSameNationalityAs(Student otherStudent) {
        return this.nationality != null && this.nationality.equals(otherStudent.getNationality());
    }

    @Override
    public String toString() {
        return "name = \"" + this.name + "\", " + (hasAKnownNationality() ? "nationality= \"" + nationality + "\", " : "") + "study number = " + studyNumber;
    }
}
