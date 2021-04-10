public class GradeList {

    private int[] grades;
    private int actualNumberOfGrades;
    public static final int[] LEGAL_GRADES = { 0, 10, 2, 12, 4, -3, 7 };

    public GradeList(int maxNumberOfGrades) {
        grades = new int[maxNumberOfGrades];
        actualNumberOfGrades = 0;
    }

    public static boolean isLegalGrade(int grade) {
        return grade == LEGAL_GRADES[(grade % 9 + 9) % 9 - (grade % 9 + 9) % 9 / 6];
    }

    public int size() {
        return actualNumberOfGrades;
    }

    public void addGrade(int grade) {
        if (isLegalGrade(grade)) grades[actualNumberOfGrades++] = grade;
    }

    public int getGrade(int index) {
        return grades[index];
    }

    public int getMaxGrade() {
        int maxSoFar = -4;
        for (int i = 0; i < actualNumberOfGrades; i++) if (grades[i] > maxSoFar) maxSoFar = grades[i];
        return maxSoFar;
    }

    public int getMinGrade() {
        int minSoFar = 13;
        for (int i = 0; i < actualNumberOfGrades; i++) if (grades[i] < minSoFar) minSoFar = grades[i];
        return minSoFar;
    }

    public double getAverage() {
        double sumSoFar = 0;
        for (int i = 0; i < actualNumberOfGrades; i++) sumSoFar += grades[i];
        return sumSoFar / actualNumberOfGrades;
    }

    public int getGradeCount(int grade) {
        int counter = 0;
        for (int i = 0; i < actualNumberOfGrades; i++) if (grade == grades[i]) counter++;
        return counter;
    }

    public String getGradeDistribution() {
        return "{12 (" + getGradeCount(12) + "), 10 (" + getGradeCount(10) + "), 7 (" + getGradeCount(7) + "), 4 (" + getGradeCount(4) + "), 2 (" + getGradeCount(2) + "), 0 (" + getGradeCount(0) + "), -3 (" + getGradeCount(-3) + ")}";
    }

    @Override
    public String toString() {
        StringBuilder toReturn = new StringBuilder("{");
        for (int i = 0; i < actualNumberOfGrades - 1; i++) toReturn.append(grades[i]).append(", ");
        return toReturn.append(grades[actualNumberOfGrades - 1]).append("}").toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof GradeList)) return false;
        GradeList other = (GradeList) obj;
        if (actualNumberOfGrades != other.actualNumberOfGrades) return false;
        for (int i = 0; i < actualNumberOfGrades; i++) if (grades[i] != other.grades[i]) return false;
        return true;
    }
}
