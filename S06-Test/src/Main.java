import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        MyDate myDateObj = new MyDate(21, 3, 2000);

        System.out.println();
        System.out.println("Read data of date object:");
        System.out.println("getDay= " + myDateObj.getDay());
        System.out.println("getMonth= " + myDateObj.getMonth());
        System.out.println("getYear= " + myDateObj.getYear());
        System.out.println("getMonthName= " + myDateObj.getMonthName());
        System.out.println("numberOfDaysInMonth= " + myDateObj.numberOfDaysInMonth());
        System.out.println("isLeapYear= " + myDateObj.isLeapYear());
        System.out.println("toString: " + myDateObj.toString());

        MyDate date2 = new MyDate(24, 3, 2005);

        System.out.println();
        System.out.println("Changed data of date object:");
        System.out.println("yearsBetween= " + myDateObj.yearsBetween(date2));
        input.close();
    }
}
