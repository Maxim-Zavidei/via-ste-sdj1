public class DateInterval {

    private int days;
    private MyDate startDate;

    public DateInterval(MyDate startDate, int days) {
        this.startDate = startDate.copy();
        this.days = days;
    }

    public DateInterval(int day, int month, int year, int days) {
        this(new MyDate(day, month, year), days);
    }

    public DateInterval(MyDate startDate, MyDate endDate) {
        this(startDate, endDate.daysBetween(startDate));
    }

    public MyDate getStartDate() {
        return startDate.copy();
    }

    public MyDate getEndDate() {
        MyDate endDate = startDate.copy();
        endDate.stepForward(days);
        return endDate;
    }

    public int getDays() {
        return days;
    }

    public boolean overlap(DateInterval otherDateInterval) {
        return !(otherDateInterval.getEndDate().isBefore(getStartDate()) || getEndDate().isBefore(otherDateInterval.getStartDate()));
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof DateInterval)) return false;
        DateInterval other = (DateInterval) obj;
        return getStartDate().equals(other.getStartDate()) && getEndDate().equals(other.getEndDate());
    }

    @Override
    public String toString() {
        return "startDate= " + startDate + ", endDate=" + getEndDate();
    }
}
