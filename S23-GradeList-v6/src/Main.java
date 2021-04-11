import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        GradeList list = new GradeList();

        while (list.size() < 4) {
            while (true) {
                System.out.print("Please input a grade: ");
                int grade = in.nextInt();
                try {
                    list.addGrade(new Grade(grade, "lol"));
                    break;
                } catch (IllegalArgumentException e) {
                    System.out.println("Invalid grade input again.");
                }
            }
        }
    }
}
