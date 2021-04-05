import java.util.Scanner;

public class LeapYearTest {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter start year= ");
        int startYear = in.nextInt();
        System.out.print("Enter the end year= ");
        int endYear = in.nextInt();

        MyDate myDateObj = new MyDate(1, 1, startYear);

        int numberOfLeapYears = 0;
        for (int i = startYear; i <= endYear; i++) {
            myDateObj.set(1, 1, i);
            if (myDateObj.isLeapYear()) numberOfLeapYears++;
        }

        System.out.println("Number of leap years since " + startYear + "= " + numberOfLeapYears);
        in.close();
    }
}
