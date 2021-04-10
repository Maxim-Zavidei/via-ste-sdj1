import java.util.ArrayList;

public class Kindergarten {

    private int countTeachers;
    private ArrayList<Child> childrenList;

    public Kindergarten() {
        countTeachers = 0;
        childrenList = new ArrayList<>();
    }

    public void addChild(Child child) {
        childrenList.add(child);
    }

    public void removeChild(Child child) {
        childrenList.remove(child);
    }

    public void hireTeachers(int count) {
        countTeachers = count;
    }

    public void fireTeachers() {
        countTeachers--;
    }

    public int countChildren() {
        return childrenList.size();
    }

    public int countTeachers() {
        return countTeachers;
    }

    public double getAverageChildAge() {
        double toReturn = 0;
        for (Child child : childrenList) toReturn += child.getAge();
        return toReturn / countChildren();
    }

    public double getNorm() {
        return (double) countChildren() / countTeachers();
    }

    public void celebrateBirthday(String name) {
        for (Child child : childrenList) if (child.getName().equals(name)) child.setAge(child.getAge() + 1);
    }

    @Override
    public String toString() {
        return "Number of teachers= " + countTeachers + ", Children: " + childrenList.toString();
    }
}
