public class GradeListTest {
    public static void main(String[] args) {

        GradeList list = new GradeList(10);
        list.addGrade(12);

        list.addGrade(-3);
        list.addGrade(7);
        list.addGrade(7);
        list.addGrade(12);
        list.addGrade(10);
        list.addGrade(0);
        list.addGrade(0);
        list.addGrade(4);
        list.addGrade(7);
        System.out.println("Grades: " + list);
        System.out.println("Average: " + list.getAverage());
        System.out.println("Grade 12 count: " + list.getGradeCount(12));
        System.out.println("Distribution: " + list.getGradeDistribution());
    }
}
