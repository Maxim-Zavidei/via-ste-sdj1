import java.util.ArrayList;

/**
 * Class for the GradeList object.
 *
 * @author Maxim Zavidei
 * @version 1.0 - 21.11.2020
 */
public class GradeList {

    private ArrayList<Grade> grades;

    /**
     * Constructor for the GradeList object.
     */
    public GradeList() {
        grades = new ArrayList<>();
    }

    /**
     * Method to get the number of grades stored in the list.
     *
     * @return Number of grades stored in the list.
     */
    public int size() {
        return grades.size();
    }

    /**
     * Method to add a Grade object at the end of the list.
     *
     * @param grade Object of type grade to be added.
     */
    public void addGrade(Grade grade) {
        grades.add(grade);
    }

    /**
     * Method to add a Grade object at a specific index of the list.
     *
     * @param index Position in the list at which the grade will be added.
     * @param grade Object of type grade to be added.
     */
    public void addGrade(int index, Grade grade) {
        grades.add(index, grade);
    }

    /**
     * Method to remove a Grade object from a specific index of the list.
     *
     * @param index Position of the Grade object that needs to be removed.
     */
    public void removeGrade(int index) {
        grades.remove(index);
    }

    /**
     * Getter for the Grade object at a certain position in the list.
     *
     * @param index Position of the Grade object to be returned.
     * @return The Grade object at that position.
     */
    public Grade getGrade(int index) {
        return grades.get(index);
    }

    /**
     * Method to get the max grade in the list.
     *
     * @return A Grade object representing the maximum grade in the list.
     */
    public Grade getMaxGrade() {
        int maxSoFar = -4;
        for (Grade grade : grades) if (grade.getGrade() > maxSoFar) maxSoFar = grade.getGrade();
        return new Grade(maxSoFar);
    }

    /**
     * Method to get the min grade in the list.
     *
     * @return A Grade object representing the minimum grade in the list.
     */
    public Grade getMinGrade() {
        int minSoFar = 13;
        for (Grade grade : grades) if (grade.getGrade() < minSoFar) minSoFar = grade.getGrade();
        return new Grade(minSoFar);
    }

    /**
     * Method to get the average value of the grades in the list.
     *
     * @return A double value representing the average value of all the grades in
     *         the list.
     */
    public double getAverage() {
        double sumSoFar = 0;
        for (Grade grade : grades) sumSoFar += grade.getGrade();
        return sumSoFar / size();
    }

    /**
     * A method to get the number of occurrence of a specific grade value.
     *
     * @param grade A grade object representing the value to compare against.
     * @return The number of occurrences of that grade in the list.
     */
    public int getGradeCount(Grade grade) {
        int counter = 0;
        for (Grade gradeObj : grades) if (gradeObj.equals(grade)) counter++;
        return counter;
    }

    /**
     * Method to get an overview of the number of all grades values in the list.
     *
     * @return A string describing the number of all of the grades in the list.
     */
    public String getGradeDistribution() {
        StringBuilder toReturn = new StringBuilder("{");
        for (int i = 6; i >= 1; i--) {
            toReturn.append(Grade.LEGAL_GRADES[i]).append(" (").append(getGradeCount(new Grade(Grade.LEGAL_GRADES[i]))).append("), ");
        }
        return toReturn.append(Grade.LEGAL_GRADES[0]).append(" (").append(getGradeCount(new Grade(Grade.LEGAL_GRADES[0]))).append(")}").toString();
    }

    /**
     * To string method to print the entire grade list.
     *
     * @return A string presenting the grades in the list.
     */
    @Override
    public String toString() {
        StringBuilder toReturn = new StringBuilder("{");
        for (int i = 0; i < size() - 1; i++) toReturn.append(grades.get(i)).append(", ");
        return toReturn.append(grades.get(size() - 1)).append("}").toString();
    }

    /**
     * A method to check whether two GradeList objects are equal.
     *
     * @param obj Object of type GradeList to compare against.
     * @return A boolean value representing whether the objects are equal or not.
     */
    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof GradeList)) return false;
        GradeList other = (GradeList) obj;
        if (size() != other.size()) return false;
        for (int i = 0; i < size(); i++) if (grades.get(i).equals(other.grades.get(i))) return false;
        return true;
    }
}
