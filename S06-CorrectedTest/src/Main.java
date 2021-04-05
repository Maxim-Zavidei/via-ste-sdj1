import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        MyDate firstMyDateObj = new MyDate(5, 3, 2012);

        System.out.println();
        System.out.println("Read data of date object:");
        System.out.println("getDay= " + firstMyDateObj.getDay());
        System.out.println("getMonth= " + firstMyDateObj.getMonth());
        System.out.println("getYear= " + firstMyDateObj.getYear());
        System.out.println("getMonthName= " + firstMyDateObj.getMonthName());
        System.out.println("numberOfDaysInMonth= " + firstMyDateObj.numberOfDaysInMonth());
        System.out.println("isLeapYear= " + firstMyDateObj.isLeapYear());
        System.out.println("toString: " + firstMyDateObj.toString());

        MyDate secondMyDateObj = new MyDate(5, 3, 2000);

        System.out.println();
        System.out.println("Changed data of date object:");
        System.out.println("yearsBetween= " + firstMyDateObj.yearsBetween(secondMyDateObj));
        input.close();
    }
}
