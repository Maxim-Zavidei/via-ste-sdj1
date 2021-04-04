import java.util.Scanner;

public class MyDateTest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Day= ");
        int day = input.nextInt();
        System.out.print("Month= ");
        int month = input.nextInt();
        System.out.print("Year= ");
        int year = input.nextInt();

        MyDate myDateObj = new MyDate(day, month, year);

        System.out.println();
        System.out.println("Read data of date object:");
        System.out.println("getDay= " + myDateObj.getDay());
        System.out.println("getMonth= " + myDateObj.getMonth());
        System.out.println("getYear= " + myDateObj.getYear());
        System.out.println("toString: " + myDateObj.toString());

        myDateObj.set(4, 10, 1000);

        System.out.println();
        System.out.println("Changed data of date object:");
        System.out.println("getDay= " + myDateObj.getDay());
        System.out.println("getMonth= " + myDateObj.getMonth());
        System.out.println("getYear= " + myDateObj.getYear());
        System.out.println("toString: " + myDateObj.toString());

        input.close();
    }
}
