import java.util.Scanner;

public class ClockTest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Hour= ");
        int hour = input.nextInt();
        System.out.print("Minute= ");
        int minute = input.nextInt();
        System.out.print("Second= ");
        int second = input.nextInt();

        Clock clockObj = new Clock(hour, minute, second);

        System.out.println();
        System.out.println("Read data of clock object:");
        System.out.println("getHour= " + clockObj.getHour());
        System.out.println("getMinute= " + clockObj.getMinute());
        System.out.println("getSecond= " + clockObj.getSecond());
        System.out.println("getTimeInSeconds= " + clockObj.getTimeInSeconds());
        System.out.println("toString: " + clockObj.toString());

        clockObj.set(1, 2, 15);

        System.out.println();
        System.out.println("Changed data of clock object:");
        System.out.println("getHour= " + clockObj.getHour());
        System.out.println("getMinute= " + clockObj.getMinute());
        System.out.println("getSecond= " + clockObj.getSecond());
        System.out.println("getTimeInSeconds= " + clockObj.getTimeInSeconds());
        System.out.println("toString: " + clockObj.toString());
        System.out.println("getSimpleTime= " + clockObj.getSimpleTime());

        input.close();
    }
}
