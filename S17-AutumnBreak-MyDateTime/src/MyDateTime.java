public class MyDateTime {

    private MyDate date;
    private Clock clock;
    private int printTime;

    public MyDateTime(int day, int month, int year, int hour, int minute, int second) {
        set(day, month, year, hour, minute, second);
    }

    public MyDateTime(int day, int month, int year, int hour, int minute) {
        set(day, month, year, hour, minute);
    }

    public MyDateTime(int day, int month, int year) {
        this(day, month, year, 0, 0);
        printTime = 0;
    }

    public void set(int day, int month, int year, int hour, int minute, int second) {
        date = new MyDate(day, month, year);
        clock = new Clock(hour, minute, second);
        printTime = 2;
    }

    public void set(int day, int month, int year, int hour, int minute) {
        set(day, month, year, hour, minute, 0);
        printTime = 1;
    }

    public MyDate getDate() {
        return date.copy();
    }

    public Clock getTime() {
        return clock.copy();
    }

    public void tic() {
        clock.tic();
    }

    public void goToNextDay() {
        date.stepForwardOneDay();
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof MyDateTime)) return false;
        MyDateTime other = (MyDateTime) obj;
        return date.equals(other.date) && clock.equals(other.clock);
    }

    @Override
    public String toString() {
        StringBuilder toReturn = new StringBuilder();
        toReturn.append(date);
        if (printTime == 1) toReturn.append(" ").append(clock.getHour()).append(" ").append(clock.getMinute());
        if (printTime == 2) toReturn.append(" ").append(clock.getHour()).append(" ").append(clock.getMinute()).append(" ").append(clock.getSecond());
        return toReturn.toString();
    }

    public String toString(String format) {
        format = format.replaceAll("%MMM|%MM", "" + (format.indexOf("%MMM") > 0 ? date.getMonthName() : String.format("%02d", date.getMonth())));
        format = format.replaceAll("%YY|%Y", "" + (format.indexOf("%YY") > 0 ? date.getYear() % 100 : date.getYear()));
        return String.format(format.replaceAll("%ss|%hh|%mm|%DD", "%02d").replaceAll("%s|%h|%m|%D", "%d"), date.getDay(), clock.getHour(), clock.getMinute(), clock.getSecond());
    }
}
