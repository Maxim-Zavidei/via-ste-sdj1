public class MyDate {

    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year) {
        set(day, month, year);
    }

    public void set(int day, int month, int year) {
        if (year < 0) year = Math.abs(this.year);
        if (month < 1) month = 1;
        if (month > 12) month = 12;
        if (day < 1) day = 1;
        if (day > numberOfDaysInMonth()) this.day = numberOfDaysInMonth();
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return this.day;
    }

    public int getMonth() {
        return this.month;
    }

    public int getYear() {
        return this.year;
    }

    public boolean isLeapYear() {
        return this.year % 4 == 0 && (this.year % 100 != 0 || this.year % 400 == 0);
    }

    public String getMonthName() {
        return new String[] {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"}[this.month - 1];
    }

    public void stepForwardOneDay() {
        this.day = this.day + 1 > numberOfDaysInMonth() ? this.month + 1 > 12 ? this.month = -this.year + ++this.year : -this.month + ++this.month : this.day + 1;
    }

    public int numberOfDaysInMonth() {
        return 31 - (this.month == 2 ? isLeapYear() ? 2 : 3 : (this.month - 1) % 7 % 2);
    }

    public boolean isBefore(MyDate comparedToDate) {
        return 370 * (comparedToDate.getYear() - this.year) + 31 * (comparedToDate.getMonth() - this.month) + comparedToDate.getDay() - this.day > 0;
    }

    public int yearsBetween(MyDate givenDate) {
        return isBefore(givenDate) ? givenDate.getYear() - this.year + (31 * (givenDate.getMonth() - this.month) + givenDate.getDay() - this.day >= 0 ? 0 : -1) : givenDate.yearsBetween(this);
    }

    @Override
    public String toString() {
        return String.format("%02d/%02d", this.day, this.month) + "/" + this.year;
    }
}
