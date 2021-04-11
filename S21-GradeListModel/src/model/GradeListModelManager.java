package model;

public class GradeListModelManager implements GradeListModel {

    private GradeList list;

    public GradeListModelManager() {
        list = new GradeList();
    }

    @Override
    public int numberOfGrades() {
        return list.size();
    }

    @Override
    public void addGrade(int grade, String course) {
        list.addGrade(new Grade(grade));
    }

    @Override
    public void removeGrade(int index) {
        list.removeGrade(index);
    }

    @Override
    public Grade getGrade(int index) {
        return list.getGrade(index);
    }

    @Override
    public Grade getMaxGrade() {
        return list.getMaxGrade();
    }

    @Override
    public Grade getMinGrade() {
        return list.getMinGrade();
    }

    @Override
    public double getAverage() {
        return list.getAverage();
    }

    @Override
    public String getAll() {
        return list.getGradeDistribution();
    }
}
