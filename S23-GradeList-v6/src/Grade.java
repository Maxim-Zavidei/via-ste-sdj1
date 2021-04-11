import java.util.Map;

public class Grade {

    private int grade;
    private String course;
    public static final Map<Integer, String> VALUE_TO_ECTS = Map.of(-3, "F", 0, "Fx", 2, "E", 4, "D", 7, "C", 10, "B", 12, "A");
    public static final Map<String, Integer> ECTS_TO_VALUE = Map.of("F", -3, "Fx", 0, "E", 2, "D", 4, "C", 7, "B", 10, "A", 12);

    public Grade(String ectsGrade, String course) {
        if (ectsGrade == null || !isLegalGrade(ectsGrade)) throw new IllegalArgumentException("Invalid Grade");
        if (course == null) throw new IllegalArgumentException("Invalid Course");
        this.grade = ECTS_TO_VALUE.get(ectsGrade);
        this.course = course;
    }

    public Grade(int grade, String course) {
        this(VALUE_TO_ECTS.get(grade), course);
    }

    public int getGrade() {
        return grade;
    }

    public String getCourse() {
        return course;
    }

    public String getEctsGrade() {
        return VALUE_TO_ECTS.get(grade);
    }

    @Override
    public String toString() {
        return "Danish Grade= " + this.grade + ", Ects Grade= " + getEctsGrade() + ", Course= " + course;
    }

    public static boolean isLegalGrade(int grade) {
        return VALUE_TO_ECTS.containsKey(grade);
    }

    public static boolean isLegalGrade(String ectsGrade) {
        return ECTS_TO_VALUE.containsKey(ectsGrade);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Grade)) return false;
        Grade other = (Grade) obj;
        return grade == other.grade && course.equals(other.course);
    }
}
