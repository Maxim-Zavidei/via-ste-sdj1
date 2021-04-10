public class Clock {

    private int hour;
    private int minute;
    private int second;
    private boolean is24HourFormat;

    public Clock(int hour, int minute, int second) {
        set(hour, minute, second);
    }

    public Clock(int totalSeconds) {
        set(totalSeconds);
    }

    public void set(int hour, int minute, int second) {
        set(hour * 3600 + minute * 60 + second);
    }

    public void set(int totalSeconds) {
        if (totalSeconds < 0) return;
        this.hour = totalSeconds / 3600;
        this.minute = (totalSeconds % 3600) / 60;
        this.second = totalSeconds % 60;
    }

    public void set24HourFormat() {
        is24HourFormat = true;
    }

    public void set12HourFormat() {
        is24HourFormat = false;
    }

    public int getHour() {
        return this.hour;
    }

    public int getMinute() {
        return this.minute;
    }

    public int getSecond() {
        return this.second;
    }

    public boolean is24HourFormat() {
        return is24HourFormat;
    }

    public int getTimeInSeconds() {
        return this.hour * 3600 + this.minute * 60 + this.second;
    }

    public void tic() {
        set(getTimeInSeconds() + 1);
    }

    public boolean isBefore(Clock comparedToClock) {
        return comparedToClock.getTimeInSeconds() - getTimeInSeconds() > 0;
    }

    public Clock timeTo(Clock time) {
        int newClockTime = time.getTimeInSeconds() - getTimeInSeconds() > 0 ? time.getTimeInSeconds() - getTimeInSeconds() : time.getTimeInSeconds() - getTimeInSeconds() + 86400;
        return new Clock(newClockTime);
    }

    public String getSimpleTime() {
        return String.format("%02d:%02d", this.hour, this.minute);
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", this.hour, this.minute, this.second);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Clock)) return false;
        Clock other = (Clock) obj;
        return hour == other.hour && minute == other.minute && second == other.second;
    }

    public Clock copy() {
        return new Clock(hour, minute, second);
    }
}
