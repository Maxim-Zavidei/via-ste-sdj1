import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("First score= ");
        int firstScore = input.nextInt();
        System.out.print("Second score= ");
        int secondScore = input.nextInt();
        System.out.print("Third score= ");
        int thirdScore = input.nextInt();

        TestScores testScoresObj = new TestScores(firstScore, secondScore, thirdScore);

        System.out.println();
        System.out.println("Read data of test score object:");
        System.out.println("getFirstScore= " + testScoresObj.getFirstScore());
        System.out.println("getSecondScore= " + testScoresObj.getSecondScore());
        System.out.println("getThirdScore= " + testScoresObj.getThirdScore());
        System.out.println("getAverageScore= " + testScoresObj.getAverageScore());
        System.out.println("toString: " + testScoresObj.toString());

        input.close();
    }
}
