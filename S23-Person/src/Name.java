public class Name {

    private String firstName;
    private String lastName;

    public Name(String firstName, String lastName) {
        if (firstName == null || firstName.length() < 2) throw new IllegalArgumentException("Invalid firstname.");
        if (lastName == null || lastName.length() < 2) throw new IllegalArgumentException("Invalid lastname.");
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getFullName() {
        return this.firstName + " " + this.lastName;
    }

    public String getFormalName() {
        return this.lastName + ", " + this.firstName;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Name)) return false;
        Name other = (Name) obj;
        return firstName.equals(other.firstName) && lastName.equals(other.lastName);
    }
}
