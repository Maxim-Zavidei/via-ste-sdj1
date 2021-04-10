public class DateIntervalTest {
    public static void main(String[] args) {

        DateInterval firstInterval = new DateInterval(new MyDate(17, 10, 2020), 10);
        DateInterval secondInterval = new DateInterval(new MyDate(15, 10, 2020), new MyDate(16, 10, 2020));
        System.out.println(secondInterval.getStartDate());
        System.out.println(secondInterval.getEndDate());

        System.out.println(firstInterval.overlap(secondInterval));
        System.out.println(firstInterval.equals(secondInterval));
        System.out.println(firstInterval.toString());
    }
}
