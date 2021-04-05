public class ClockTest {
    public static void main(String[] args) {

        Clock firstClockObj = new Clock(50000);
        Clock secondClockObj = new Clock(46002);

        System.out.println();
        System.out.println("Hardcoded data of the first clock object:");
        System.out.println("getHour= " + firstClockObj.getHour());
        System.out.println("getMinute= " + firstClockObj.getMinute());
        System.out.println("getSecond= " + firstClockObj.getSecond());
        System.out.println("getTimeInSeconds= " + firstClockObj.getTimeInSeconds());
        System.out.println("getSimpleTime= " + firstClockObj.getSimpleTime());
        System.out.println("toString: " + firstClockObj.toString());
        System.out.println("isBefore= " + firstClockObj.isBefore(secondClockObj));

        Clock thirdClock = firstClockObj.timeTo(secondClockObj);
        System.out.println();
        System.out.println("Calculated data of the third clock object:");
        System.out.println("getHour= " + thirdClock.getHour());
        System.out.println("getMinute= " + thirdClock.getMinute());
        System.out.println("getSecond= " + thirdClock.getSecond());
    }
}
