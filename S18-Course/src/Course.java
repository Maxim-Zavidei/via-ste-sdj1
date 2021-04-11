import java.util.ArrayList;

public class Course {

    private String title;
    private Instructor primaryInstructor;
    private Instructor secondaryInstructor;
    private ArrayList<Student> students;

    public Course(String title, Instructor primaryInstructor) {
        this.title = title;
        this.primaryInstructor = primaryInstructor;
        this.secondaryInstructor = null;
        students = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public Instructor getPrimaryInstructor() {
        return primaryInstructor;
    }

    public Instructor getSecondaryInstructor() {
        return secondaryInstructor;
    }

    public void setSecondaryInstructor(Instructor secondaryInstructor) {
        this.secondaryInstructor = secondaryInstructor;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public int getNumberOfInstructors() {
        return secondaryInstructor == null ? 1 : 2;
    }

    public int getNumberOfStudents(int semester) {
        int counter = 0;
        for (Student student : students) if (student.getSemester() == semester) counter++;
        return counter;
    }

    public Student[] getStudentsBySemester(int semester) {
        Student[] toReturn = new Student[getNumberOfStudents(semester)];
        int counter = 0;
        for (Student student : students) if (student.getSemester() == semester) toReturn[counter++] = student;
        return toReturn;
    }

    public boolean hasStudent(String name) {
        for (Student student : students) if (student.getName().equals(name)) return true;
        return false;
    }

    @Override
    public String toString() {
        StringBuilder toReturn = new StringBuilder("Course{title= " + title + ", ins1=" + primaryInstructor + ", ins2= " + secondaryInstructor + ", students={");
        for (int i = 0; i < students.size() - 1; i++) toReturn.append(students.get(i) + ", ");
        return toReturn.append(students.get(students.size())).append("}}").toString();
    }
}
