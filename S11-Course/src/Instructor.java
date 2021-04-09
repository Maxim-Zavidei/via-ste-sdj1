public class Instructor {

    private String name;
    private String officeNumber;

    public Instructor(String name, String officeNumber) {
        this.name = name;
        this.officeNumber = officeNumber;
    }

    @Override
    public String toString() {
        return "Name=" + name + ", OfficeNumber=" + officeNumber;
    }
}
