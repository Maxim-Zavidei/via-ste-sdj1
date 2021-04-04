import java.util.Scanner;
import rentalcompany.model.*;

public class DateTest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a day= ");
        int day = input.nextInt();
        System.out.print("Enter a month= ");
        int month = input.nextInt();
        System.out.print("Enter a year= ");
        int year = input.nextInt();

        MyDate myDateObj = new MyDate(day, month, year);

        System.out.println("The input date is " + myDateObj.toString());

        System.out.print("Enter the number to skip forward= ");
        int daysToSkip = input.nextInt();

        myDateObj.stepForward(daysToSkip);
        System.out.print("The new date is " + myDateObj.toString());

        input.close();
    }
}
