import java.util.ArrayList;

public class GradeList {

    private ArrayList<Grade> grades;

    public GradeList() {
        grades = new ArrayList<>();
    }

    public int size() {
        return grades.size();
    }

    public void addGrade(Grade grade) {
        grades.add(grade);
    }

    public void addGrade(int index, Grade grade) {
        grades.add(index, grade);
    }

    public void removeGrade(int index) {
        grades.remove(index);
    }

    public Grade getGrade(int index) {
        return grades.get(index);
    }

    public Grade getMaxGrade() {
        int maxSoFar = -4;
        for (Grade grade : grades) if (grade.getGrade() > maxSoFar) maxSoFar = grade.getGrade();
        return new Grade(maxSoFar);
    }

    public Grade getMinGrade() {
        int minSoFar = 13;
        for (Grade grade : grades) if (grade.getGrade() < minSoFar) minSoFar = grade.getGrade();
        return new Grade(minSoFar);
    }

    public double getAverage() {
        double sumSoFar = 0;
        for (Grade grade : grades) sumSoFar += grade.getGrade();
        return sumSoFar / size();
    }

    public int getGradeCount(Grade grade) {
        int counter = 0;
        for (Grade gradeObj : grades) if (gradeObj.equals(grade)) counter++;
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
        for (int i = 0; i < size() - 1; i++) toReturn.append(grades.get(i)).append(", ");
        return toReturn.append(grades.get(size() - 1)).append("}").toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof GradeList)) return false;
        GradeList other = (GradeList) obj;
        if (size() != other.size()) return false;
        for (int i = 0; i < size(); i++) if (grades.get(i).equals(other.grades.get(i))) return false;
        return true;
    }
}
