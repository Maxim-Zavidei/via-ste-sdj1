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

        list.removeGrade(0);
        list.removeGrade(list.size() - 1);
        list.removeGrade(2);
        System.out.println("Grades: " + list.toString());
        list.addGrade(0, 12);
        list.addGrade(list.size(), 12);
        list.addGrade(2, 12);
        System.out.println("Grades: " + list);
        System.out.println("Distribution: " + list.getGradeDistribution());
    }
}
