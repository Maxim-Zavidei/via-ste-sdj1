package model;

import java.util.Map;
import java.io.Serializable;

public class Grade implements Serializable {

    private int grade;
    private String course;
    public static final Map<Integer, Integer> LEGAL_GRADES = Map.of(-3, -3, 0, 0, 2, 2, 4, 4, 7, 7, 10, 10, 12, 12);

    public Grade(int grade, String course) {
        if (!isLegalGrade(grade)) throw new IllegalArgumentException("Invalid grade.");
        if (course == null) throw new IllegalArgumentException("Invalid course.");
        this.grade = grade;
        this.course = course;
    }

    public int getGrade() {
        return grade;
    }

    public String getCourse() {
        return course;
    }

    @Override
    public String toString() {
        return "Grade= " + this.grade + ", Course= " + course;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Grade)) return false;
        Grade other = (Grade) obj;
        return grade == other.grade && course.equals(other.course);
    }

    public static boolean isLegalGrade(int grade) {
        return LEGAL_GRADES.containsKey(grade);
    }
}
