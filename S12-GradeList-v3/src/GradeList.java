public class GradeList {

    private Grade[] grades;
    private int actualNumberOfGrades;

    public GradeList(int maxNumberOfGrades) {
        grades = new Grade[maxNumberOfGrades];
        actualNumberOfGrades = 0;
    }

    public int size() {
        return actualNumberOfGrades;
    }

    public void addGrade(Grade grade) {
        grades[actualNumberOfGrades++] = grade;
    }

    public void addGrade(int index, Grade grade) {
        for (int i = actualNumberOfGrades; i > index; i--) grades[i] = grades[i - 1];
        actualNumberOfGrades++;
        grades[index] = grade;
    }

    public void removeGrade(int index) {
        for (int i = index; i < actualNumberOfGrades - 1; i++) grades[i] = grades[i + 1];
        actualNumberOfGrades--;
    }

    public Grade getGrade(int index) {
        return grades[index];
    }

    public Grade getMaxGrade() {
        int maxSoFar = -4;
        for (int i = 0; i < actualNumberOfGrades; i++) if (grades[i].getGrade() > maxSoFar) maxSoFar = grades[i].getGrade();
        return new Grade(maxSoFar);
    }

    public Grade getMinGrade() {
        int minSoFar = 13;
        for (int i = 0; i < actualNumberOfGrades; i++) if (grades[i].getGrade() < minSoFar) minSoFar = grades[i].getGrade();
        return new Grade(minSoFar);
    }

    public double getAverage() {
        double sumSoFar = 0;
        for (int i = 0; i < actualNumberOfGrades; i++) sumSoFar += grades[i].getGrade();
        return sumSoFar / actualNumberOfGrades;
    }

    public int getGradeCount(Grade grade) {
        int counter = 0;
        for (int i = 0; i < actualNumberOfGrades; i++) if (grades[i].equals(grade)) counter++;
        return counter;
    }

    public String getGradeDistribution() {
        StringBuilder toReturn = new StringBuilder("{");
        for (int i = 6; i >= 1; i--) {
            toReturn.append(Grade.LEGAL_GRADES[i]).append(" (").append(getGradeCount(new Grade(Grade.LEGAL_GRADES[i]))).append("), ");
        }
        return toReturn.append(Grade.LEGAL_GRADES[0]).append(" (").append(getGradeCount(new Grade(Grade.LEGAL_GRADES[0]))).append(")}").toString();
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
        for (int i = 0; i < actualNumberOfGrades; i++) if (grades[i].equals(other.grades[i])) return false;
        return true;
    }
}
