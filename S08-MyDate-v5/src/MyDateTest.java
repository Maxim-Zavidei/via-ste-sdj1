import java.util.Scanner;

public class MyDateTest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        MyDate firstMyDateObj = new MyDate();
        firstMyDateObj.stepForward(3);

        System.out.println();
        System.out.println("Read data of date object:");
        System.out.println("getDay= " + firstMyDateObj.getDay());
        System.out.println("getMonth= " + firstMyDateObj.getMonth());
        System.out.println("getYear= " + firstMyDateObj.getYear());
        System.out.println("getMonthName= " + firstMyDateObj.getMonthName());
        System.out.println("numberOfDaysInMonth= " + firstMyDateObj.numberOfDaysInMonth());
        System.out.println("isLeapYear= " + firstMyDateObj.isLeapYear());
        System.out.println("getAstroSign= " + firstMyDateObj.getAstroSign());
        System.out.println("getAstroElement= " + firstMyDateObj.getAstroElement());
        System.out.println("dayOfWeek= " + firstMyDateObj.dayOfWeek());
        System.out.println("toString: " + firstMyDateObj.toString());

        input.close();
    }
}
