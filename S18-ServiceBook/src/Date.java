public class Date {

    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int yaer) {
        set(day, month, year);
    }

    public Date() {
        this(26, 10, 2020);
    }

    public void set(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public Date copy() {
        return new Date(day, month, year);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Date)) return false;
        Date other = (Date) obj;
        return day == other.day && month == other.month && year == other.year;
    }

    @Override
    public String toString() {
        return "{day= " + day + ", month= " + month + ", yaer=" + year + "}";
    }
}
