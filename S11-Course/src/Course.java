public class Course {

    private String courseName;
    private TextBook primaryTextBook;
    private TextBook secondaryTextBook;
    private Instructor instructor;

    public Course(String name, Instructor who, TextBook primaryTextBook) {
        this.courseName = name;
        this.primaryTextBook = primaryTextBook;
        this.instructor = who;
    }

    public String getCourseName() {
        return courseName;
    }

    public TextBook getPrimaryTextBook() {
        return primaryTextBook;
    }

    public TextBook getSecondaryTextBook() {
        return secondaryTextBook;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void setSecondaryTextBook(TextBook secondaryTextBook) {
        this.secondaryTextBook = secondaryTextBook;
    }

    @Override
    public String toString() {
        return "Course: " + courseName + ", Instructor: " + instructor + ", Primary text book: " + primaryTextBook + (secondaryTextBook != null ? ", " + secondaryTextBook : "");
    }
}
