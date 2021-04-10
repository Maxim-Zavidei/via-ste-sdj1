import java.time.LocalDate;

public class MyDate {

    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year) {
        set(day, month, year);
    }

    public MyDate(int day, String monthName, int year) {
        set(day, convertToMonthNumber(monthName), year);
    }

    public MyDate() {
        set(LocalDate.now().getDayOfMonth(), LocalDate.now().getMonthValue(), LocalDate.now().getYear());
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

    public void stepForward(int days) {
        while (days-- != 0) stepForwardOneDay();
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

    public String dayOfWeek() {
        return new String[] {"Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"}[(this.day + (13 * (this.month + (this.month < 3 ? 13 : 1)) / 5) + (5 * ((this.year + (this.month < 3 ? -1 : 0)) % 100) + 21 * ((this.year + (this.month < 3 ? -1 : 0)) / 100)) / 4) % 7];
    }

    public String getAstroSign() {
        return new String[] {"Capricorn", "Aquarius", "Pisces", "Aries", "Taurus", "Gemini", "Cancer", "Leo", "Virgo", "Libra", "Scorpio", "Sagittarius"}[this.month % 12 - (this.day < new int[] { 20, 19, 21, 20, 21, 21, 23, 23, 23, 23, 22, 22 }[this.month - 1] ? 1 : 0)];
    }

    public String getAstroElement() {
        return new String[] {"Fire", "Earth", "Water", "Air"}["rieoagauirapancoisemibqu".indexOf(getAstroSign().substring(1, 3)) / 6];
    }

    public MyDate copy() {
        return new MyDate(day, month, year);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof MyDate)) return false;
        MyDate other = (MyDate) obj;
        return day == other.day && month == other.month && year == other.year;
    }

    @Override
    public String toString() {
        return String.format("%02d/%02d", this.day, this.month) + "/" + this.year;
    }

    public static int convertToMonthNumber(String monthName) {
        switch (monthName) {
            case "February": return 2;
            case "March": return 3;
            case "April": return 4;
            case "May": return 5;
            case "June": return 6;
            case "July": return 7;
            case "August": return 8;
            case "September": return 9;
            case "October": return 10;
            case "November": return 11;
            case "December": return 12;
            default: return 1;
        }
    }
}
