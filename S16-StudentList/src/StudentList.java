import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class StudentList {

    private ArrayList<Student> studentList;

    public StudentList() {
        studentList = new ArrayList<>();
    }

    public StudentList(Student[] initialMembers) {
        studentList = new ArrayList<>(Arrays.asList(initialMembers));
    }

    public int size() {
        return studentList.size();
    }

    public void addStudent(Student student) {
        studentList.add(student);
    }

    public void removeStudent(int index) {
        studentList.remove(index);
    }

    public Student get(int index) {
        return studentList.get(index);
    }

    public Student getByStudyNumber(int studyNumber) {
        for (Student student : studentList) if (student.getStudyNumber() == studyNumber) return student;
        return null;
    }

    public int getNumberOfGroupMembers(int groupNumber) {
        int counter = 0;
        for (Student student : studentList) if (student.getGroupNumber() == groupNumber) counter++;
        return counter;
    }

    public Student[] getByGroup(int groupNumber) {
        int numberOfStudents = getNumberOfGroupMembers(groupNumber);
        Student[] returnList = new Student[numberOfStudents];
        for (int i = 0; i < numberOfStudents; i++) if (studentList.get(i).getGroupNumber() == groupNumber) returnList[i] = studentList.get(i);
        return returnList;
    }

    public Student[] getByNationality(String nationality) {
        ArrayList<Student> returnList = new ArrayList<>();
        for (Student student : studentList) if (student.getNationality().equals(nationality)) returnList.add(student);
        return returnList.toArray(new Student[returnList.size()]);
    }

    public Student[] getStudentsOlderThen(int years) {
        ArrayList<Student> returnList = new ArrayList<>();
        for (Student student : studentList) if (student.getAge() > years) returnList.add(student);
        return returnList.toArray(new Student[returnList.size()]);
    }

    public ArrayList<Integer> getAllGroupNumbers() {
        ArrayList<Integer> returnList = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for (Student student : studentList) if (!set.contains(student.getGroupNumber())) {
            set.add(student.getGroupNumber());
            returnList.add(student.getGroupNumber());
        }
        return returnList;
    }

    public ArrayList<String> getAllNationalities() {
        ArrayList<String> returnList = new ArrayList<>();
        HashSet<String> set = new HashSet<>();
        for (Student student : studentList) if (!set.contains(student.getGroupNumber())) {
            set.add(student.getNationality());
            returnList.add(student.getNationality());
        }
        return returnList;
    }

    @Override
    public String toString() {
        ArrayList<Student> orderedStudentList = new ArrayList<>(studentList);
        int n = orderedStudentList.size();
        Student temp = null;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (orderedStudentList.get(j - 1).getNationality().compareTo(orderedStudentList.get(j).getNationality()) > 0) {
                    temp = orderedStudentList.get(j - 1);
                    orderedStudentList.set(j - 1, orderedStudentList.get(j));
                    orderedStudentList.set(j, temp);
                }
            }
        }
        return "{" + "studentList=" + orderedStudentList.toString() + '}';
    }
}
