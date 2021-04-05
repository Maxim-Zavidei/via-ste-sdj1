public class MyDate {

    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year) {
        set(day, month, year);
    }

    public void set(int day, int month, int year) {
        if (this.year < 0) this.year = Math.abs(this.year);
        if (this.month < 1) this.month = 1;
        if (this.month > 12) this.month = 12;
        if (this.day < 1) this.day = 1;
        if (this.day > numberOfDaysInMonth()) this.day = numberOfDaysInMonth();
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
        if (this.year % 4 == 0 && (this.year % 100 != 0 || this.year % 400 == 0))
            return true;
        else
            return false;
    }

    public String getMonthName() {
        if (this.month == 1) return "January";
        else if (this.month == 2) return "February";
        else if (this.month == 3) return "March";
        else if (this.month == 4) return "April";
        else if (this.month == 5) return "May";
        else if (this.month == 6) return "June";
        else if (this.month == 7) return "July";
        else if (this.month == 8) return "August";
        else if (this.month == 9) return "September";
        else if (this.month == 10) return "October";
        else if (this.month == 11) return "November";
        else if (this.month == 12) return "December";
        else return "";
    }

    public void stepForwardOneDay() {
        if (this.day + 1 > numberOfDaysInMonth()) {
            this.day = 1;
            if (this.month == 12) {
                this.month = 1;
                this.year++;
            } else this.month++;
        } else this.day++;
    }

    public int numberOfDaysInMonth() {
        if (this.month == 2) {
            if (isLeapYear())
                return 29;
            else
                return 28;
        } else if (this.month == 4 || this.month == 6 || this.month == 9 || this.month == 11)
            return 30;
        else
            return 31;
    }

    public boolean isBefore(MyDate comparedToDate) {
        if (this.year < comparedToDate.getYear())
            return true;
        else if (this.year == comparedToDate.getYear() && this.month < comparedToDate.getMonth())
            return true;
        else if (this.year == comparedToDate.getYear() && this.month == comparedToDate.getMonth() && this.day < comparedToDate.getDay())
            return true;
        else
            return false;
    }

    public int yearsBetween(MyDate givenDate) {
        if (this.month < givenDate.getMonth())
            return Math.abs(this.year - givenDate.getYear()) - 1;
        else if (this.month == givenDate.getMonth() && this.day < givenDate.getDay())
            return Math.abs(this.year - givenDate.getYear()) + 1;
        else
            return Math.abs(this.year - givenDate.getYear());
    }

    public String toString() {
        return String.format("%02d/%02d", this.day, this.month) + "/" + this.year;
    }
}
