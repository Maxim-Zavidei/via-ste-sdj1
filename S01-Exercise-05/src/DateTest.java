import rentalcompany.model.MyDate;

public class DateTest {
    public static void main(String[] args) {

        MyDate myBirthdayDate = new MyDate(2, 1, 1998);
        System.out.println("My birthday is on: " + myBirthdayDate);

        MyDate today = new MyDate();
        int days = myBirthdayDate.daysBetween(today);
        System.out.println("Days since my birthday: " + days);

        int years = myBirthdayDate.yearsBetween(today);
        System.out.println("I'm: " + years + " years old");

        System.out.println("Today's month is: " + today.getMonthName());
    }
}
