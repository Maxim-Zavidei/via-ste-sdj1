package model;

public interface GradeListModel {
    int numberOfGrades();
    void addGrade(int grade, String course);
    void removeGrade(int index);
    Grade getGrade(int index);
    Grade getMaxGrade();
    Grade getMinGrade();
    double getAverage();
    String getAll();
}
