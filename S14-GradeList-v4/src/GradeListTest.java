public class GradeListTest {
    public static void main(String[] args) {

        GradeList list = new GradeList();
        list.addGrade(new Grade(12));
        list.addGrade(new Grade(-3));
        list.addGrade(new Grade(7));
        list.addGrade(new Grade(7));
        list.addGrade(new Grade(12));
        list.addGrade(new Grade(10));
        list.addGrade(new Grade(0));
        list.addGrade(new Grade(0));
        list.addGrade(new Grade(4));
        list.addGrade(new Grade(7));
        System.out.println("Grades: " + list);
        System.out.println("Average: " + list.getAverage());
        System.out.println("Grade 12 count: " + list.getGradeCount(new Grade(12)));
        System.out.println("Distribution: " + list.getGradeDistribution());

        list.removeGrade(0);
        list.removeGrade(list.size() - 1);
        list.removeGrade(2);
        list.addGrade(0, new Grade("A"));
        list.addGrade(list.size(), new Grade(12));
        list.addGrade(2, new Grade(12));
        System.out.println("Grades: " + list);
        System.out.println("Distribution: " + list.getGradeDistribution());
    }
}
